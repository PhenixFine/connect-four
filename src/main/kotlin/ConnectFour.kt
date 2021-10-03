import util.getString

class ConnectFour private constructor(
    private val player1: String, private val player2: String, private val gameBoard: GameBoard
) {

    companion object {
        fun getGame(): ConnectFour {
            val message = "player's name:"
            val player1 = getString("Connect Four\nFirst $message")
            val player2 = getString("Second $message")

            return ConnectFour(player1, player2, GameBoard.getGameBoard())
        }
    }

    fun print() {
        println("$player1 VS $player2")
        gameBoard.print()
    }
}