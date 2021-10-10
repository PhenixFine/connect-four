# Connect Four
Stage 5 of 5 for JetBrains Academy - Kotlin - [Connect Four project](https://hyperskill.org/projects/202/stages/1006/implement).   
This stage has us add the option for more than one game ( and keeping score for multiple games ).
## Requirements
### Description
Before this stage, two players can play only one game. We are going to change this. In this stage, implement the option to play multiple games.

After setting the board dimensions, ask the players if they would like to play a single or multiple games. In the latter case, keep and print the score. When a player wins a game, they get 2 points. If it's a draw, give 1 point to each player.

If the players have chosen the multiple game option, alternate the first move for each new game. However, each player retains the same disc symbol (see Example 3).
### Objectives
After setting the board dimensions, players see the following:
```text
Do you want to play single or multiple games?
For a single game, input 1 or press Enter
Input a number of games:
```
Only positive digits are valid as for input (except 0). If a player inputs anything else, print `Invalid input` and ask for another try (see Example 4).

If players input `1` or press Enter, start a single game and print the following message:
```text
<1st player's name> VS <2nd player's name>
<Rows> X <Columns>
Single game
```
In this case, the gameplay remains the same (see Examples 1, 2).

If players input an integer that is bigger than 1, start the multiple game mode and print the following message:
```text
<1st player's name> VS <2nd player's name>
<Rows> X <Columns>
Total <Number of games> games
```
Print the score after each finished game in the following format:
```text
Score
<1st player's name>: 2 <2nd player's name>: 2
```
Before the start of a game, print the game number: `Game #<Number of game>` (see Example 3). Players take turns for the first move, but each player keeps the same disc symbol throughout all games.

At any point of the game, if players input `end`, your program should output `Game over!` and terminate the game (see Example 5).
### Examples
The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.
#### Example 1: a single game (players input 1)
```text
Connect Four
First player's name:
> Lily
Second player's name:
> James
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 5 X 8
Do you want to play single or multiple games?
For a single game, input 1 or press Enter
Input a number of games:
> 1
Lily VS James
5 X 8 board
Single game
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 3
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 3
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║*║ ║ ║ ║ ║ ║
║ ║ ║ο║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 4
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║*║ ║ ║ ║ ║ ║
║ ║ ║ο║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 4
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║*║*║ ║ ║ ║ ║
║ ║ ║ο║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 5
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║*║*║ ║ ║ ║ ║
║ ║ ║ο║ο║ο║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 5
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║*║*║*║ ║ ║ ║
║ ║ ║ο║ο║ο║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 6
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║*║*║*║ ║ ║ ║
║ ║ ║ο║ο║ο║ο║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Player Lily won
Game over!
```
#### Example 2: a single game (players input Enter)
```text
Connect Four
First player's name:
> Lily
Second player's name:
> James
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 5x6
Do you want to play single or multiple games?
For a single game, input 1 or press Enter
Input a number of games:
>
Lily VS James
5 X 6 board
Single game
 1 2 3 4 5 6
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╝
Lily's turn:
> 5
 1 2 3 4 5 6
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║ ║
╚═╩═╩═╩═╩═╩═╝
James's turn:
> 6
 1 2 3 4 5 6
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║*║
╚═╩═╩═╩═╩═╩═╝
Lily's turn:
> 5
 1 2 3 4 5 6
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║ ║
║ ║ ║ ║ ║ο║*║
╚═╩═╩═╩═╩═╩═╝
James's turn:
> 6
 1 2 3 4 5 6
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║*║
║ ║ ║ ║ ║ο║*║
╚═╩═╩═╩═╩═╩═╝
Lily's turn:
> 5
 1 2 3 4 5 6
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║ ║
║ ║ ║ ║ ║ο║*║
║ ║ ║ ║ ║ο║*║
╚═╩═╩═╩═╩═╩═╝
James's turn:
> 6
 1 2 3 4 5 6
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║*║
║ ║ ║ ║ ║ο║*║
║ ║ ║ ║ ║ο║*║
╚═╩═╩═╩═╩═╩═╝
Lily's turn:
> 5
 1 2 3 4 5 6
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║ ║
║ ║ ║ ║ ║ο║*║
║ ║ ║ ║ ║ο║*║
║ ║ ║ ║ ║ο║*║
╚═╩═╩═╩═╩═╩═╝
Player Lily won
Game over!
```
#### Example 3: multiple games
```text
Connect Four
First player's name:
> Lily
Second player's name:
> James
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 6x7
Do you want to play single or multiple games?
For a single game, input 1 or press Enter
Input a number of games:
> 3
Lily VS James
6 X 7 board
Total 3 games
Game #1
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 1
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 1
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 2
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ ║ ║
║ο║ο║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 2
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║*║ ║ ║ ║ ║ ║
║ο║ο║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 3
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║*║ ║ ║ ║ ║ ║
║ο║ο║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 3
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║*║*║ ║ ║ ║ ║
║ο║ο║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║*║*║ ║ ║ ║ ║
║ο║ο║ο║ο║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Player Lily won
Score
Lily: 2 James: 0
Game #2
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 5
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 5
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 5
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Player James won
Score
Lily: 2 James: 2
Game #3
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 7
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ο║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 1
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ ║ο║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 6
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ο║ο║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 2
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║*║ ║ ║ ║ο║ο║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 5
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║*║ ║ ║ο║ο║ο║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 3
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║*║*║ ║ο║ο║ο║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║*║*║ο║ο║ο║ο║
╚═╩═╩═╩═╩═╩═╩═╝
Player Lily won
Score
Lily: 4 James: 2
Game over!
```
#### Example 4: invalid input
```text
Connect Four
First player's name:
> Lily
Second player's name:
> James
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 5x8
Do you want to play single or multiple games?
For a single game, input 1 or press Enter
Input a number of games:
> 0
Invalid input
Do you want to play single or multiple games?
For a single game, input 1 or press Enter
Input a number of games:
> One
Invalid input
Do you want to play single or multiple games?
For a single game, input 1 or press Enter
Input a number of games:
> 1 1
Invalid input
Do you want to play single or multiple games?
For a single game, input 1 or press Enter
Input a number of games:
> 5
Lily VS James
5 X 8 board
Total 5 games
Game #1
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> end
Game over!
```
#### Example 5: exit
```text
Connect Four
First player's name:
> Lily
Second player's name:
> James
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 5x7
Do you want to play single or multiple games?
For a single game, input 1 or press Enter
Input a number of games:
> 3
Lily VS James
5 X 7 board
Total 3 games
Game #1
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 1
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 2
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ο║*║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> end
Game over!
```
#### Example 6: plain text board
```text
Connect Four
First player's name: 
> Lily
Second player's name: 
> James
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7) 
> 6 X 7
Do you want to play single or multiple games?
For a single game, input 1 or press Enter
Input a number of games:
> 2
Lily VS James
6 X 7 board
Total 2 games
Game #1
 1 2 3 4 5 6 7 
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
===============
Lily's turn: 
> 3
 1 2 3 4 5 6 7 
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | |o| | | | |
===============
James's turn: 
> 4
 1 2 3 4 5 6 7 
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | |o|*| | | |
===============
Lily's turn: 
> 3
 1 2 3 4 5 6 7 
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | |o| | | | |
| | |o|*| | | |
===============
James's turn: 
> 5
 1 2 3 4 5 6 7 
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | |o| | | | |
| | |o|*|*| | |
===============
Lily's turn: 
> 3
 1 2 3 4 5 6 7 
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | |o| | | | |
| | |o| | | | |
| | |o|*|*| | |
===============
James's turn: 
> 6
 1 2 3 4 5 6 7 
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | |o| | | | |
| | |o| | | | |
| | |o|*|*|*| |
===============
Lily's turn: 
> 3
 1 2 3 4 5 6 7 
| | | | | | | |
| | | | | | | |
| | |o| | | | |
| | |o| | | | |
| | |o| | | | |
| | |o|*|*|*| |
===============
Player Lily won
Score
Lily: 2 James: 0
Game #2
 1 2 3 4 5 6 7 
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
===============
James's turn: 
> 1
 1 2 3 4 5 6 7 
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
|*| | | | | | |
===============
Lily's turn: 
> 7
 1 2 3 4 5 6 7 
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
|*| | | | | |o|
===============
James's turn: 
> 2
 1 2 3 4 5 6 7 
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
|*|*| | | | |o|
===============
Lily's turn: 
> 6
 1 2 3 4 5 6 7 
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
|*|*| | | |o|o|
===============
James's turn: 
> 3
 1 2 3 4 5 6 7 
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
|*|*|*| | |o|o|
===============
Lily's turn: 
> 5
 1 2 3 4 5 6 7 
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
|*|*|*| |o|o|o|
===============
James's turn: 
> 4
 1 2 3 4 5 6 7 
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
| | | | | | | |
|*|*|*|*|o|o|o|
===============
Player James won
Score
Lily: 2 James: 2
Game over!
```
