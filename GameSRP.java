package assignment1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class GameSRP {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> srp = new ArrayList<>();
    srp.add("Scissor");
    srp.add("Rock");
    srp.add("Paper");

    Random rnd = new Random();

    int winsForPlayer = 0;
    int winsForComputer = 0;
    int draws = 0;

    while (true) {
      System.out.print("Scissor (1), rock (2), paper (3) or 0 to quit: ");
      int input = scan.nextInt();

      if (input == 0) {
        System.out.println("Ending Game...");
        break;
      }

      String playerPick = srp.get(input - 1);
      String computerPick = srp.get(rnd.nextInt(3));
          
      if (playerPick == computerPick) {
        System.out.println("It's a draw! computer had " + computerPick);
        draws++;
      } else if (playerPick == "Scissor" && computerPick == "Paper"
       || playerPick == "Paper" && computerPick == "Rock"
       || playerPick == "Rock" && computerPick == "Scissor") {
        System.out.println("You won, computer had " + computerPick);
        winsForPlayer++;
      } else {
        System.out.println("You lost, computer had " + computerPick);
        winsForComputer++;
      }
    }
      System.out.println("Score: " + winsForPlayer + " (you) " + winsForComputer + " (computer) " + draws + " (draw) ");
      scan.close();
  }
}
