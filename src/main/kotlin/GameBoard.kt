import util.getString

class GameBoard private constructor(private val rows: Int = 6, private val columns: Int = 7) {
    private val board = Array(rows) { Array(columns) { ' ' } }

    companion object {
        fun getGameBoard(): GameBoard {
            val message = "Set the board dimensions (Rows x Columns)\nPress Enter for default (6 x 7)"
            val dimensions = getString(message).filter { !it.isWhitespace() }
            val regex = Regex("\\d+[xX]\\d+")
            var error = "Invalid input"

            if (dimensions.isEmpty()) return GameBoard() else if (dimensions.matches(regex)) {
                val (num1, num2) = dimensions.split("x", "X").map { it.toInt() }
                val matches = { num: Int -> (5..9).contains(num) }
                val wrongDimension = if (!matches(num1)) "rows" else if (!matches(num2)) "columns" else ""
                if (wrongDimension.isEmpty()) return GameBoard(num1, num2) else {
                    error = "Board $wrongDimension should be from 5 to 9"
                }
            }
            println(error)
            return getGameBoard()
        }
    }

    fun print() {
        val range = 1..columns
        val (pipe, leftPipe, middlePipe, rightPipe) = listOf("║", "╚", "═╩", "═╝")

        println("$rows X $columns board")
        println(" " + (range).joinToString(" "))
        board.forEach { println(it.joinToString(pipe, pipe, pipe)) }
        println(leftPipe + middlePipe.repeat(columns - 1) + rightPipe)
    }
}