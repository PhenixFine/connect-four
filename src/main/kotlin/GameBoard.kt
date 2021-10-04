import util.getString

class GameBoard private constructor(private val rows: Int = 6, private val columns: Int = 7) {
    private val board = Array(rows) { Array(columns) { ' ' } }
    private val columnRange = 1..columns
    private val boardMap = columnRange.associateWith { rows }.toMutableMap()

    fun print(printColumnRows: Boolean = true) {
        val (pipe, leftPipe, middlePipe, rightPipe) = listOf("║", "╚", "═╩", "═╝")

        if (printColumnRows) println("$rows X $columns board")
        println(" " + columnRange.joinToString(" "))
        board.forEach { println(it.joinToString(pipe, pipe, pipe)) }
        println(leftPipe + middlePipe.repeat(columns - 1) + rightPipe)
    }

    fun insertDisc(disc: Char, columnString: String): Boolean {
        val column = columnString.toIntOrNull()
        var error =
            if (column == null) "Incorrect column number" else "The column number is out of range (1 - $columns)"

        if (column != null) {
            boardMap[column]?.let { row: Int ->
                if (row != 0) {
                    updateBoard(disc, row, column)
                    return true
                } else error = "Column $column is full"
            }
        }
        println(error)
        return false
    }

    private fun updateBoard(disc: Char, row: Int, column: Int) {
        board[row - 1][column - 1] = disc
        boardMap[column] = row - 1
    }

    companion object {
        fun getGameBoard(): GameBoard {
            val message = "Set the board dimensions (Rows x Columns)\nPress Enter for default (6 x 7)"
            val dimensions = getString(message).filterNot { it.isWhitespace() }
            val regex = Regex("\\d+[xX]\\d+")
            var error = "Invalid input"

            if (dimensions.isEmpty()) return GameBoard() else if (dimensions.matches(regex)) {
                val (num1, num2) = dimensions.split("x", "X").map { it.toInt() }
                val notRange = { num: Int -> !(5..9).contains(num) }
                val wrongDimension = if (notRange(num1)) "rows" else if (notRange(num2)) "columns" else ""
                if (wrongDimension.isEmpty()) return GameBoard(num1, num2) else {
                    error = "Board $wrongDimension should be from 5 to 9"
                }
            }
            println(error)
            return getGameBoard()
        }
    }
}