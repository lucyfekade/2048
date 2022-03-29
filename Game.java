/**
* Name: Lucy Fekade
* Pennkey: lucyfe
* Execution: java Game
*
* Description: this class runs the game until the player has either lost or won
**/
public class Game {
    public static void main(String[] args) {
        //creat and draw the board
        Board a = new Board();
        a.drawBoard();
        //run until game ends
        while (a.isGameOver() == false) {
            //while the player has inputted how they want to move
            if (PennDraw.hasNextKeyTyped()) {
                //variable to store key typed by player
                char c = PennDraw.nextKeyTyped();
                //move up
                if (c == 'W' || c == 'w') {
                    //board before shift for comparison
                    Spaces[][] grid = a.getBoard();
                    //if player presses w, merge up if possible
                    a.mergeUp();
                    //board after shift
                    Spaces[][] grid2 = a.getBoard();
                    //comparison variable to see if arrays are equal
                    boolean areEqual = true;
                    //traverse 2d array
                    for (int row = 0; row < grid.length; row++) {
                        for (int col = 0; col < grid[row].length; col++) {
                            //check if array before and after are the same
                            if (grid[row][col].getValue() !=
                               grid2[row][col].getValue()) {
                                //if not, set comparison variable to false
                                areEqual = false;
                            }
                        }
                    }
                    /**
                     * if the two arrays, before and after merge, are not
                     * equal, generate a random tile
                     **/
                    if (areEqual == false) {
                        a.generateRandomTile();
                    }
                    a.drawBoard();
                } else if (c == 'D' || c == 'd') {
                    //board before shift for comparison
                    Spaces[][] grid = a.getBoard();
                    //if player presses d, merge right if possible
                    a.mergeRight();
                    //board after shift
                    Spaces[][] grid2 = a.getBoard();
                    //comparison variable to see if arrays are equal
                    boolean areEqual = true;
                    //traverse 2d array
                    for (int row = 0; row < grid.length; row++) {
                        for (int col = 0; col < grid[row].length; col++) {
                            //check if array before and after are the same
                            if (grid[row][col].getValue() !=
                               grid2[row][col].getValue()) {
                                //if not, set comparison variable to false
                                areEqual = false;
                            }
                        }
                    }
                    /**
                     * if the two arrays, before and after merge, are not
                     * equal, generate a random tile
                     **/
                    if (areEqual == false) {
                        a.generateRandomTile();
                    }
                    a.drawBoard();
                } else if (c == 'S' || c == 's') {
                    //board before shift for comparison
                    Spaces[][] grid = a.getBoard();
                    //if player presses s, merge down if possible
                    a.mergeDown();
                    //board after shift
                    Spaces[][] grid2 = a.getBoard();
                    //comparison variable to see if arrays are equal
                    boolean areEqual = true;
                    //traverse 2d array
                    for (int row = 0; row < grid.length; row++) {
                        for (int col = 0; col < grid[row].length; col++) {
                            //check if array before and after are the same
                            if (grid[row][col].getValue() !=
                               grid2[row][col].getValue()) {
                                //if not, set comparison variable to false
                                areEqual = false;
                            }
                        }
                    }
                    /**
                     * if the two arrays, before and after merge, are not
                     * equal, generate a random tile
                     **/
                    if (areEqual == false) {
                        a.generateRandomTile();
                    }
                    a.drawBoard();
                } else if (c == 'A' || c == 'a') {
                    //board before shift for comparison
                    Spaces[][] grid = a.getBoard();
                    //if player presses a, merge left if possible
                    a.mergeLeft();
                    //board after shift
                    Spaces[][] grid2 = a.getBoard();
                    //comparison variable to see if arrays are equal
                    boolean areEqual = true;
                    //traverse 2d array
                    for (int row = 0; row < grid.length; row++) {
                        for (int col = 0; col < grid[row].length; col++) {
                            //check if array before and after are the same
                            if (grid[row][col].getValue() !=
                               grid2[row][col].getValue()) {
                                //if not, set comparison variable to false
                                areEqual = false;
                            }
                        }
                    }
                    /**
                     * if the two arrays, before and after merge, are not
                     * equal, generate a random tile
                     **/
                    if (areEqual == false) {
                        a.generateRandomTile();
                    }
                    a.drawBoard();
                }
            }
        }

    }
}
