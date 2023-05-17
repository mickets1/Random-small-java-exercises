package assignment1;

import java.util.Scanner;

public class PrintCalendar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a year: ");
    int year = scan.nextInt();

    System.out.print("Enter a month: ");
    int month = scan.nextInt();

    if (month > 12 || month <= 0) {
      System.out.println("Not a valid month.");
      scan.close();
      return;
    }

    System.out.println(getMonthName(month) + " " + year);
    printWeekHeader();
    printCalendar(year, month);

    scan.close();
  }

  public static void printCalendar (int year, int month) {
    int unconvertedStartDay = dayOfWeek(year, month);
    int convertedStartDay = monToTueConvert(unconvertedStartDay);

    int numberOfDaysInMonth = getDaysInAMonth(year, month);

    // Padding weekdays.
    for (int i = 0; i < convertedStartDay; i++) {
      System.out.print("    ");
    }

    for (int i = 1; i <= numberOfDaysInMonth; i++) {
      System.out.printf("%4d", i);

      if ((i + convertedStartDay) % 7 == 0) {
        System.out.println();
      }
  }
  System.out.println();
}

  public static boolean getLeapYear (int year) {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }


  public static void printWeekHeader () {
    String[] dayNameArr = { "Mon","Tue","Wed","Thu","Fri","Sat","Sun" };
    
    System.out.println("-----------------------------");
    for (int i = 0; i < dayNameArr.length; i++) {
      System.out.print(" " + dayNameArr[i]);
    }
    System.out.println();
  }

  // Number of days in a month, including leap year.
  public static int getDaysInAMonth (int year, int month) {
    if (month == 1 || month == 3 || month == 5 || month == 7 ||
       month == 8 || month == 10 || month == 12) {
      return 31;
       }

    if (month == 4 || month == 6 || month == 9 || month == 11) {
      return 30;
      }

      if (month == 2) {
        if (getLeapYear(year)) {
          return 29;
        }
        return 28;
      }

      return 0;
  }

  public static String getMonthName (int month) { 
    String monthName = "";
    switch (month) {
      case 1:
      monthName = "January"; 
      break;
      case 2:
      monthName = "February";
      break;
      case 3:
      monthName = "March";
      break;
      case 4:
      monthName = "April";
      break;
      case 5:
      monthName = "May";
      break;
      case 6:
      monthName = "June";
      break;
      case 7:
      monthName = "July";
      break;
      case 8:
      monthName = "August";
      break;
      case 9:
      monthName = "September";
      break;
      case 10:
      monthName = "October";
      break;
      case 11:
      monthName = "November";
      break;
      case 12:
      monthName = "December";
    }

    return monthName;
  }

  public static int dayOfWeek (int year, int month) {
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
  int dayOfWeek = (1 + (26 * (month + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
    return dayOfWeek;
  }

  // converts Sunday to Saturday to Monday to Sunday.
  public static int monToTueConvert (int dayOfWeek) {
    int dayConvert = 0;
    switch (dayOfWeek) {
      case 0:
      dayConvert = 5;
      break;
      case 1:
      dayConvert = 6;
      break;
      case 2:
      dayConvert = 0;
      break;
      case 3:
      dayConvert = 1;
      break;
      case 4:
      dayConvert = 2;
      break;
      case 5:
      dayConvert = 3;
      break;
      case 6:
      dayConvert = 4;
      break;
    }
    return dayConvert;
  }
}
