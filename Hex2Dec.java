package assignment1;

import java.util.Scanner;

public class Hex2Dec {
  public static int hexToDecimal (String hex) {
    int num = Integer.parseInt(hex,16);
    return num;
  }
  public static void main(String[] args) {
    System.out.print("Enter a hex number: ");
    Scanner scan = new Scanner(System.in);
    String hex = scan.nextLine();
    System.out.println("The decimal value for " + hex + " is " + hexToDecimal(hex) + ".");
    scan.close();
  }
}
