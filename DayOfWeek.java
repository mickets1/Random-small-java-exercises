package assignment1;

import java.util.Scanner;


public class DayOfWeek {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a year: ");
    int year = scan.nextInt();

    System.out.print("Enter a month: ");
    int month = scan.nextInt();

    System.out.print("Enter a day of the month: ");
    int dayOfMonth = scan.nextInt();
    scan.close();

    // Handling January and February
    if (month == 1) {
      month = 13;
      year -= 1;
    } else if (month == 2) {
      month = 14;
      year -= 1;
    }

    int j = year / 100;
    int k = year % 100;

    // Day of week formula h = (q + 26(m+1)​ / 10 + k + 4k​ + 4j​ + 5j​) % 7
    int dayOfWeek = (dayOfMonth + (26 * (month + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

    String dayName = null;
    switch (dayOfWeek) {
      case 0: 
        dayName = "Saturday";
        break;
      case 1:
        dayName = "Sunday";
        break;
      case 2: 
        dayName = "Monday";
        break;
      case 3: 
        dayName = "Tuesday";
        break;
      case 4: 
        dayName = "Wednesday";
        break;
      case 5: 
        dayName = "Thursday";
        break;
      case 6: 
        dayName = "Friday";
        break;
      default:
        dayName = "Day error.";
    }
    System.out.println("Day of week is: " + dayName);
  }
}
