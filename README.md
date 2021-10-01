# Connect Four
Stage 1 of 5 for JetBrains Academy - Kotlin - [Connect Four project](https://hyperskill.org/projects/202/stages/1002/implement).   
This stage has us ask for the two player's name and the size of the game board ( with dimensions that can't be any smaller than 5 and any larger than 9 ).
## Requirements
### Description
Connect Four is a classic game where players drop colorful discs onto a vertical board. The main goal of the game is to form a line of four discs of the same color horizontally, vertically, or diagonally.

In this project, you will create a software version of this game. Typically, the game board has 6 rows and 7 columns, but in this version, the number of rows and columns can vary from 5 to 9.

In this stage, the program should read the players' names and the board size from the console input.

The board size is input in the following format: `<Rows> X <Columns>` or `<Rows> x <Columns>`, for example, `7 X 8` or `8x9`. Whitespaces (spaces and tabs) have no effect.
### Objectives
The program should print the program title `Connect Four`, ask for the 1st player's name with the prompt `First player's name:`, and read it. Then it should ask for the 2nd player's name with the prompt `Second player's name:` and read it.

Subsequently, the program should ask for the board dimensions with the following prompt:
```text
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
```
Once the dimensions are entered, it should read them (Examples 1, 3). Ignore any whitespaces. If users press the Enter button right away (ignoring the dimension prompt), then the board size is 6 rows and 7 columns (see Example 2).

If the number of rows is outside the 5-9 range, print the following message `Board rows should be from 5 to 9` and ask for dimensions once again (see Example 3).

If the number of columns is outside the 5-9 range, print the following message `Board columns should be from 5 to 9` and ask for dimensions once again (see Example 3).

If users fail to input dimensions in the correct format, print Invalid input and ask for dimensions once again (see Example 4).

Finally, output the following message:
```text
<1st player's name> VS <2nd players name>
<Rows> X <Columns>
```
### Examples
The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.
#### Example 1: defining the board size
```text
Connect Four
First player's name:
> Ava
Second player's name:
> Oliver
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 7 x 9
Ava VS Oliver
7 X 9 board
```
#### Example 2: pressing Enter to get the default board size
```text
Connect Four
First player's name:
> Ava
Second player's name:
> Oliver
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
>
Ava VS Oliver
6 X 7 board
```
#### Example 3: invalid board size
```text
Connect Four
First player's name:
> Oliver
Second player's name:
> Ava
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 4x7
Board rows should be from 5 to 9
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 10x7
Board rows should be from 5 to 9
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 7 x 4
Board columns should be from 5 to 9
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 7 X 10
Board columns should be from 5 to 9
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 5X9
Oliver VS Ava
5 X 9 board
```
#### Example 4: invalid input
```text
Connect Four
First player's name:
> Ava
Second player's name:
> Oliver
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 6 7
Invalid input
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 6_7
Invalid input
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 6 V 7
Invalid input
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 6x7
Ava VS Oliver
6 X 7 board
```