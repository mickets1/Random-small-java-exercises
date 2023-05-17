package assignment1;

import java.util.Arrays;
import java.util.Random;

public class Ants {
    public static boolean visited (int[][] board) {
        // check if square has been visited.
        // System.out.println(Arrays.toString(board[0]));
        boolean check = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == -1) {
                    check = false;
                }
            }
        }
        return check;
    }

    public static int antBoard (int[][] board) {
        // Fill Arrays with -1's to check against if square has been visited before.
        for (int[] ints : board) {
            Arrays.fill(ints, -1);
        }

        /* If using Arrays class is not allowed.
        for (int i = 0; i < board.length; i += 1) {
            for (int j = 0; j < board[i].length; j += 1) {
                    board[i][j] = -1;
                }
            }
        */

        Random rnd = new Random();
        int rndX = rnd.nextInt(7);
        int rndY = rnd.nextInt(7);

        String color;
        if (rndX % 2 == 0 && rndY % 2 == 0 || rndX % 2 == 1 && rndY % 2 == 1) {
            color = "black";
        } else {
            color = "white";
        }
        System.out.println("Ant dropped on a " + color + " square, with position X: " + (rndX + 1) + " and Y: " + (rndY + 1));

        int steps = 0;
        // Check board boundaries and if all squares has been visited.
        while (!visited(board)) {
            int rndMove = rnd.nextInt(4);
            switch(rndMove) {
                case 0:
                    if(rndX + 1 <= 7)
                    rndX++;
                    break;
                case 1:
                    if(rndX - 1 >= 0)
                    rndX--;
                    break;
                case 2:
                    if(rndY + 1 <= 7)
                    rndY++;
                    break;
                case 3:
                    if(rndY - 1 >= 0)
                    rndY--;
                    break;
            }
            board[rndX][rndY] = 1;
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        double sum = 0;
        int[][] board = null;

        for (int i = 0; i < 10; i++) {
            board = new int[8][8];
        
            int steps = antBoard(board);
            sum += steps;
            System.out.println("Number of steps in simulation " + (i + 1)+ ": " + steps + "\n");
        
        }
        System.out.println("Average amount of steps: " + (sum / board.length));
        
    }
}