import util.getString

class ConnectFour private constructor(
    private val player1: String,
    private val player2: String,
    private val gameBoard: GameBoard,
    private val totalGames: Int
) {

    private val isMultiple = totalGames > 1
    private var score = Pair(0, 0)
    private var isPlayer1 = true
    private val currentPlayer get() = if (isPlayer1) player1 else player2
    private var command = ""

    init {
        println("$player1 VS $player2")
        gameBoard.printColumnRows()
        println(if (isMultiple) "Total $totalGames games" else "Single game")
    }

    fun play() {
        playGame()
        println("Game over!")
    }

    private fun playGame() {
        repeat(totalGames) { gameCount ->
            var drawOrWin = "It is a draw"

            if (gameCount > 0) isPlayer1 = (gameCount) % 2 == 0
            if (isMultiple) println("Game #${gameCount + 1}")
            gameBoard.print()
            while (!gameBoard.gameOver() && isContinue()) {
                if (gameBoard.insertDisc(if (isPlayer1) 'o' else '*', command)) {
                    gameBoard.print()
                    if (gameBoard.gameWon) {
                        drawOrWin = "Player $currentPlayer won"
                    } else isPlayer1 = !isPlayer1
                }
            }
            if (!gameBoard.gameOver()) return
            println(drawOrWin)
            if (isMultiple) multipleGame()
        }
    }

    private fun isContinue(): Boolean {
        command = getString("$currentPlayer's turn:")
        return command != "end"
    }

    private fun multipleGame() {
        score = if (gameBoard.gameWon) {
            if (isPlayer1) Pair(score.first + 2, score.second) else Pair(score.first, score.second + 2)
        } else Pair(score.first + 1, score.second + 1)
        println("Score\n$player1: ${score.first} $player2: ${score.second}")
        gameBoard.resetGame()
    }

    companion object {
        fun getGame(): ConnectFour {
            val playerName = "player's name:"
            val player1 = getString("Connect Four\nFirst $playerName")
            val player2 = getString("Second $playerName")

            return ConnectFour(player1, player2, GameBoard.getGameBoard(), getGameTotal())
        }

        private fun getGameTotal(): Int {
            val message = """
                Do you want to play single or multiple games?
                For a single game, input 1 or press Enter
                Input a number of games:
                """.trimIndent()
            val totalString = getString(message)
            val total = if (totalString.isEmpty()) 1 else totalString.toIntOrNull()

            if (total != null && total > 0) return total
            println("Invalid input")
            return getGameTotal()
        }
    }
}