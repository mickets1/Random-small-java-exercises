package assignment1;

import java.util.Scanner;

public class DangerousWork {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("How much would you like to earn?: ");
    int input = scan.nextInt();
    scan.close();

    int days = 0;
    double i = 0.01;
    while (i < input) {
        i += i;
        days++;
    }
    System.out.print("You will have your money in "+days+" days.");
  }
}
