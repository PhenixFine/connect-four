import util.getString
import Direction.*

class GameBoard private constructor(private val rows: Int = 6, private val columns: Int = 7) {
    private val board = Array(rows) { Array(columns) { ' ' } }
    private val columnRange = 1..columns
    private val rowRange = 1..rows
    private val boardMap = columnRange.associateWith { rows }.toMutableMap()
    var gameWon = false
        private set

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
                    gameWon = checkWin(disc, row, column)
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

    private fun checkWin(disc: Char, row: Int, column: Int): Boolean {
        val isWin = { path1: Direction, path2: Direction ->
            checkPath(disc, row, column, path1) + checkPath(disc, row, column, path2) >= 3
        }

        return isWin(LEFT, RIGHT) || isWin(UP, DOWN) || isWin(UP_LEFT, DOWN_RIGHT) || isWin(DOWN_LEFT, UP_RIGHT)
    }

    private fun checkPath(disc: Char, row: Int, column: Int, path: Direction): Int {
        var discCount = 0
        var shift = path.shift(row, column)
        val isValid = { rowRange.contains(shift.first) && columnRange.contains(shift.second) }
        val isDisc = { board[shift.first - 1][shift.second - 1] == disc }

        while (isValid() && isDisc()) {
            discCount++
            shift = path.shift(shift.first, shift.second)
        }
        return discCount
    }

    fun gameOver() = gameWon || boardMap.all { it.value == 0 }

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