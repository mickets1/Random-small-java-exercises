package assignment1;

import java.util.Scanner;

public class Diamonds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean check = true;

        while (check) {
            System.out.print("Enter a positive number or a negative number to exit: ");
            int input = scan.nextInt();

            if (input < 0) {
                System.out.print("Exiting program");
                check = false;
                scan.close();
            } else if (input < 2) {
                System.out.print("You must provide a number larger than 1.\n");
            } else {
                // Prints top half diamond.
                for (int i = 0; i <= input; i += 1) {
                    for (int j = 1; j <= input - i; j += 1)
                        System.out.print(" ");
                    for (int h = 1; h <= 2 * i - 1; h += 1)
                        System.out.print("*");
                    System.out.println("");
                }

                // Prints bottom half diamond.
                for (int i = input - 1; i >= 1; i -= 1) {
                    for (int j = 1; j <= input - i; j += 1)
                        System.out.print(" ");
                    for (int h = 1; h <= 2 * i - 1; h += 1)
                        System.out.print("*");
                    System.out.println("");
                }
            }
        }
        scan.close();
    }
}


