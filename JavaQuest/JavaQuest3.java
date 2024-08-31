package src.questions;
import java.util.Scanner;
public class JavaQuest3 {


  public static void main(String[] args) {
    
  

    Scanner input = new Scanner(System.in);

    int number_Of_DaysInMonth = 0;
    String MonthOfName = "Unknown";

    System.out.print("Input a month number: ");
    int month = input.nextInt();

    System.out.print("Input a year: ");
    int year = input.nextInt();

    // Complete the switch statement
    switch (month) {
      case 1:
        MonthOfName = "January";
        MonthOfName = "December";
        number_Of_DaysInMonth = 31;
      case 2:
        MonthOfName = "February";
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
          number_Of_DaysInMonth = 29;
      } else {
          number_Of_DaysInMonth = 28;
      }
     
    System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
}
}
}


        // The February has 29 days: (Every 4 years and the year cannot divded by 100)
        // or The year can divided by 400
        // i.e. 2200 Feb -> 28 days, 2400 Feb -> 29 days, 2016 Feb -> 29 days
        // otherwise the February should have 28 days only
        // how about other months, December?

          /**
   * Expected Output:
   * 
   * Input a month number: 2
   * Input a year: 2016
   * February 2016 has 29 days
   * 
   * Input a month number: 12
   * Input a year: 2014
   * December 2014 has 31 days
   */
  // Program toExercise3Ansumber of days that the month of a year has.