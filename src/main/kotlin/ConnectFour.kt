import util.getString

class ConnectFour private constructor(
    private val player1: String, private val player2: String, private val gameBoard: GameBoard
) {

    init {
        println("$player1 VS $player2")
        gameBoard.print()
    }

    fun play() {
        var isPlayer1 = true
        val turnMessage = { (if (isPlayer1) player1 else player2) + "'s turn:" }
        val getDisc = { if (isPlayer1) 'o' else '*' }
        var command = ""
        val getCommand = { command = getString(turnMessage()); command }

        while (getCommand() != "end") {
            if (gameBoard.insertDisc(getDisc(), command)) {
                gameBoard.print(false)
                isPlayer1 = !isPlayer1
            }
        }
        println("Game over!")
    }

    companion object {
        fun getGame(): ConnectFour {
            val playerName = "player's name:"
            val player1 = getString("Connect Four\nFirst $playerName")
            val player2 = getString("Second $playerName")

            return ConnectFour(player1, player2, GameBoard.getGameBoard())
        }
    }
}