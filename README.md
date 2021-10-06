# Connect Four
Stage 4 of 5 for JetBrains Academy - Kotlin - [Connect Four project](https://hyperskill.org/projects/202/stages/1005/implement).   
This stage has us implement win and draw cases.
## Requirements
### Description
Now, it is time to implement the winning condition. A player wins when they place four discs of the same color in a row horizontally, vertically, or diagonally. After each move, the program checks if the condition is met. Also, if the board is full and the win condition isn't fulfilled, claim it a draw.
### Objectives
In addition to what we have added before, your program should do the following:
1. Check the board for the winning condition. If a player wins, output `Player <Player's name> won`;
2. If the board is full, but neither of the players has won, print `It is a draw`;
3. Regardless of whether it is a draw or somebody's victory, print `Game Over!` and terminate the program.
### Examples
The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.
#### Example 1: the first player wins by placing four discs in a horizontal row
```text
Connect Four
First player's name:
> Paul
Second player's name:
> Joanne
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 6x8
Paul VS Joanne
6 X 8 board
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 2
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ο║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 2
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║*║ ║ ║ ║ ║ ║ ║
║ ║ο║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 3
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║*║ ║ ║ ║ ║ ║ ║
║ ║ο║ο║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 3
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║*║*║ ║ ║ ║ ║ ║
║ ║ο║ο║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 4
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║*║*║ ║ ║ ║ ║ ║
║ ║ο║ο║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 4
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║*║*║*║ ║ ║ ║ ║
║ ║ο║ο║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 5
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║*║*║*║ ║ ║ ║ ║
║ ║ο║ο║ο║ο║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Player Paul won
Game over!
```
#### Example 2: the second player wins by placing four discs in a vertical row
```text
Connect Four
First player's name:
> Paul
Second player's name:
> Joanne
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 5x7
Paul VS Joanne
5 X 7 board
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 3
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 3
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║ ║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 3
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║ ║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 2
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
║ ║ο║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
║ ║ο║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Player Joanne won
Game over!
```
#### Example 3: the first player wins by placing four discs in a diagonal row
```text
Connect Four
First player's name:
> Paul
Second player's name:
> Joanne
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 7x7
Paul VS Joanne
7 X 7 board
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 3
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ο║ ║ ║ ║
║ ║ ║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 5
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ο║ ║ ║ ║
║ ║ ║ο║*║*║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 5
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ο║ο║ ║ ║
║ ║ ║ο║*║*║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 6
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ο║ο║ ║ ║
║ ║ ║ο║*║*║*║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 5
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║ ║ ║
║ ║ ║ ║ο║ο║ ║ ║
║ ║ ║ο║*║*║*║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 3
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║ ║ ║
║ ║ ║*║ο║ο║ ║ ║
║ ║ ║ο║*║*║*║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 6
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║ ║ ║
║ ║ ║*║ο║ο║ο║ ║
║ ║ ║ο║*║*║*║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Joanne's turn:
> 6
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║*║ ║
║ ║ ║*║ο║ο║ο║ ║
║ ║ ║ο║*║*║*║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Paul's turn:
> 6
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ο║ ║
║ ║ ║ ║ ║ο║*║ ║
║ ║ ║*║ο║ο║ο║ ║
║ ║ ║ο║*║*║*║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Player Paul won
Game over!
```
#### Example 4: a draw
```text
Connect Four
First player's name:
> Paul
Second player's name:
> Joanne
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 5 X 5
Paul VS Joanne
5 X 5 board
 1 2 3 4 5
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 1
 1 2 3 4 5
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 1
 1 2 3 4 5
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 1
 1 2 3 4 5
║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 1
 1 2 3 4 5
║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 1
 1 2 3 4 5
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 2
 1 2 3 4 5
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 2
 1 2 3 4 5
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║ ║ ║ ║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 3
 1 2 3 4 5
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║*║ ║ ║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 4
 1 2 3 4 5
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║*║ο║ ║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 2
 1 2 3 4 5
║ο║ ║ ║ ║ ║
║*║ ║ ║ ║ ║
║ο║*║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║*║ο║ ║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 2
 1 2 3 4 5
║ο║ ║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║*║ο║ ║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 2
 1 2 3 4 5
║ο║*║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║*║ο║ ║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 3
 1 2 3 4 5
║ο║*║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║ ║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ο║ ║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 3
 1 2 3 4 5
║ο║*║ ║ ║ ║
║*║ο║ ║ ║ ║
║ο║*║*║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ο║ ║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 3
 1 2 3 4 5
║ο║*║ ║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ο║ ║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 3
 1 2 3 4 5
║ο║*║*║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ο║ ║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 5
 1 2 3 4 5
║ο║*║*║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ο║ο║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 4
 1 2 3 4 5
║ο║*║*║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ ║ ║
║*║ο║ο║*║ ║
║ο║*║*║ο║ο║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 4
 1 2 3 4 5
║ο║*║*║ ║ ║
║*║ο║ο║ ║ ║
║ο║*║*║ο║ ║
║*║ο║ο║*║ ║
║ο║*║*║ο║ο║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 4
 1 2 3 4 5
║ο║*║*║ ║ ║
║*║ο║ο║*║ ║
║ο║*║*║ο║ ║
║*║ο║ο║*║ ║
║ο║*║*║ο║ο║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 4
 1 2 3 4 5
║ο║*║*║ο║ ║
║*║ο║ο║*║ ║
║ο║*║*║ο║ ║
║*║ο║ο║*║ ║
║ο║*║*║ο║ο║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 5
 1 2 3 4 5
║ο║*║*║ο║ ║
║*║ο║ο║*║ ║
║ο║*║*║ο║ ║
║*║ο║ο║*║*║
║ο║*║*║ο║ο║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 5
 1 2 3 4 5
║ο║*║*║ο║ ║
║*║ο║ο║*║ ║
║ο║*║*║ο║ο║
║*║ο║ο║*║*║
║ο║*║*║ο║ο║
╚═╩═╩═╩═╩═╝
Joanne's turn:
> 5
 1 2 3 4 5
║ο║*║*║ο║ ║
║*║ο║ο║*║*║
║ο║*║*║ο║ο║
║*║ο║ο║*║*║
║ο║*║*║ο║ο║
╚═╩═╩═╩═╩═╝
Paul's turn:
> 5
 1 2 3 4 5
║ο║*║*║ο║ο║
║*║ο║ο║*║*║
║ο║*║*║ο║ο║
║*║ο║ο║*║*║
║ο║*║*║ο║ο║
╚═╩═╩═╩═╩═╝
It is a draw
Game over!
```
#### Example 5: plain text board
```text
Connect Four
First player's name:
> Paul
Second player's name:
> Joanne
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 6x7
Paul VS Joanne
6 X 7 board
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
===============
Paul's turn:
> 7
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | |o|
===============
Joanne's turn:
> 6
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | |*|o|
===============
Paul's turn:
> 7
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | |o|
| | | | | |*|o|
===============
Joanne's turn:
> 5
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | |o|
| | | | |*|*|o|
===============
Paul's turn:
> 7
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | |o|
| | | | | | |o|
| | | | |*|*|o|
===============
Joanne's turn:
> 4
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | |o|
| | | | | | |o|
| | | |*|*|*|o|
===============
Paul's turn:
> 7
 1 2 3 4 5 6 7
| | | | | | | |
| | | | | | | |
| | | | | | |o|
| | | | | | |o|
| | | | | | |o|
| | | |*|*|*|o|
===============
Player Paul won
Game over!
```