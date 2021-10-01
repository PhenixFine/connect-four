class ConnectFour private constructor(
    private val player1: String,
    private val player2: String,
    private val rows: Int = 6,
    private val columns: Int = 7
) {

    companion object {
        fun getGame(): ConnectFour {
            val message = "player's name:"
            val player1 = getString("Connect Four\nFirst $message")
            val player2 = getString("Second $message")
            val dimensions = getDimensions()

            return if (dimensions == null) ConnectFour(player1, player2) else {
                ConnectFour(player1, player2, dimensions.first, dimensions.second)
            }
        }

        private fun getDimensions(): Pair<Int, Int>? {
            val message = "Set the board dimensions (Rows x Columns)\nPress Enter for default (6 x 7)"
            val dimensions = getString(message).filter { !it.isWhitespace() }
            val regex = Regex("\\d+[xX]\\d+")
            var error = "Invalid input"

            if (dimensions.isEmpty()) return null else if (dimensions.matches(regex)) {
                val (num1, num2) = dimensions.split("x", "X").map { it.toInt() }
                val matches = { num: Int -> (5..9).contains(num) }
                val wrongDimension = if (!matches(num1)) "rows" else if (!matches(num2)) "columns" else ""
                if (wrongDimension.isEmpty()) return Pair(num1, num2) else {
                    error = "Board $wrongDimension should be from 5 to 9"
                }
            }
            println(error)
            return getDimensions()
        }

        private fun getString(message: String): String {
            println(message)
            return readLine()!!
        }
    }

    fun print() {
        println("$player1 VS $player2")
        println("$rows X $columns board")
    }
}