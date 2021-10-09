import util.getString
import Direction.*

class GameBoard private constructor(private val rows: Int = 6, private val columns: Int = 7) {
    private var board = getBoard()
    private val columnRange = 1..columns
    private val rowRange = 1..rows
    private var boardMap = getBoardMap()
    var gameWon = false
        private set

    fun print() {
        val (pipe, leftPipe, middlePipe, rightPipe) = listOf("║", "╚", "═╩", "═╝")

        println(" " + columnRange.joinToString(" "))
        board.forEach { println(it.joinToString(pipe, pipe, pipe)) }
        println(leftPipe + middlePipe.repeat(columns - 1) + rightPipe)
    }

    fun printColumnRows() = println("$rows X $columns board")

    fun insertDisc(disc: Char, columnString: String): Boolean {
        val column = columnString.toIntOrNull()
        var error =
            if (column == null) "Incorrect column number" else "The column number is out of range (1 - $columns)"

        if (column != null) {
            boardMap[column]?.let { row: Int ->
                if (row != 0) {
                    updateBoard(disc, row, column)
                    gameWon = isWin(disc, row, column)
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

    private fun isWin(disc: Char, row: Int, column: Int) = checkWin(disc, row, column, LEFT, RIGHT)
            || checkWin(disc, row, column, UP, DOWN) || checkWin(disc, row, column, UP_LEFT, DOWN_RIGHT)
            || checkWin(disc, row, column, DOWN_LEFT, UP_RIGHT)

    private fun checkWin(disc: Char, row: Int, column: Int, path1: Direction, path2: Direction) =
        checkPath(disc, row, column, path1) + checkPath(disc, row, column, path2) >= 3

    private fun checkPath(disc: Char, row: Int, column: Int, path: Direction): Int {
        var count = 0
        var shift = path.shift(row, column)

        while (isValid(shift) && isDisc(shift, disc)) {
            count++
            shift = path.shift(shift.first, shift.second)
        }
        return count
    }

    private fun isValid(shift: Pair<Int, Int>) = rowRange.contains(shift.first) && columnRange.contains(shift.second)

    private fun isDisc(shift: Pair<Int, Int>, disc: Char) = board[shift.first - 1][shift.second - 1] == disc

    fun gameOver() = gameWon || boardMap.all { it.value == 0 }

    fun resetGame() {
        if (gameWon) gameWon = false
        board = getBoard()
        boardMap = getBoardMap()
    }

    private fun getBoard() = Array(rows) { Array(columns) { ' ' } }

    private fun getBoardMap() = columnRange.associateWith { rows }.toMutableMap()

    companion object {
        fun getGameBoard(): GameBoard {
            val message = "Set the board dimensions (Rows x Columns)\nPress Enter for default (6 x 7)"
            val dimensions = getString(message).filterNot { it.isWhitespace() }
            val regex = Regex("\\d+[xX]\\d+")
            var error = "Invalid input"

            if (dimensions.isEmpty()) return GameBoard() else if (dimensions.matches(regex)) {
                val (num1, num2) = dimensions.split("x", "X").map { it.toInt() }
                val wrongDimension = if (notRange(num1)) "rows" else if (notRange(num2)) "columns" else ""
                if (wrongDimension.isEmpty()) return GameBoard(num1, num2) else {
                    error = "Board $wrongDimension should be from 5 to 9"
                }
            }
            println(error)
            return getGameBoard()
        }

        private fun notRange(num: Int) = !(5..9).contains(num)
    }
}