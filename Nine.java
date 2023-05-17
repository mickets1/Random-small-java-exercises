package assignment1;

import java.util.Scanner;
import java.util.Random;

public class Nine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.print("Hit a nine: The player closest to nine wins.\nReady to play? (Y/N): ");
        String roll1 = scan.nextLine();

        if (roll1.equalsIgnoreCase("n")) {
            System.out.println("Player doesn't want to play.");
            scan.close();
            return;
          }

        Random rnd = new Random();
        int die1 = rnd.nextInt(6)+1;
        int die2 = rnd.nextInt(6)+1;
        int plaTot = die1+die2;

        System.out.println("You rolled: "+die1);
        System.out.print("Would you like to roll again? (Y/N): ");

        String roll2 = scan.nextLine();

        if (roll2.equalsIgnoreCase("y")) {
            System.out.println("You rolled: "+die2+", in total you have "+plaTot+"\n");
        }
        else if (roll1.equalsIgnoreCase("n")) {
            plaTot = plaTot - die2;
            System.out.println("Player stays"); 
          }

        scan.close();

        // Computer
        int die3 = rnd.nextInt(6)+1;
        int die4 = rnd.nextInt(6)+1;
        int comTot = die3+die4;

            System.out.println("Computer rolled: "+die3);


        if (die3 <= 4) {
            System.out.println("Computer rolled: "+die4+", in total: "+comTot+"\n");
        }
        else {
            comTot = comTot - die4;
        }


        if (plaTot > 9 && comTot > 9) {
            System.out.println("Both players rolled over 9!");
        }
        else if (plaTot <= 9 && comTot > 9) {
            System.out.println("You Win!!");
        }
        else if (plaTot > 9 && comTot <= 9) {
            System.out.println("Computer Wins!");
        }
        else if (plaTot > comTot) {
            System.out.println("You Win!");
        }
        else if (comTot > plaTot) {
            System.out.println("Computer Win!");
        }
        else {
            System.out.println("It's a draw!");
        }

    }
}

