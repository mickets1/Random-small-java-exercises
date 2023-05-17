package assignment1;

import java.util.Scanner;

public class Time {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Give a number of seconds: ");

    int input = scan.nextInt();
    scan.close();

    int hours = input / 3600;
    int minutes = (input % 3600) / 60;
    int seconds = input % 60;

    System.out.print(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds.");
  }
}
