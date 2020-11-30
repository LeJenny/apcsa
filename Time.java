import java.util.Scanner;

class Time {
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.println("Please enter the number of seconds.");
  int x = scan.nextInt();
  int seconds = x%60;
  int weeks = x/(24*60*60*7);
  int days = x/(24*60*60)%7;
  int hours = (x/(60*60))%24;
  int minutes = (x/60)%60;
  System.out.println(x + " seconds = " + weeks + " week(s) " + days + " day(s) " + hours + " hour(s) " + minutes + " minute(s) " + seconds + " second(s)");
  // I added the (s) because I'm a grammar nazi lol.
  }
}

/*
Assignment 3:  Time Conversion

Prompt the user for a number in seconds.  Convert it to weeks, days, hours, minutes and seconds.

Must use %.  
Use 1 week has 7 days, 1 day has 24 hours, 1 hour has 60 minutes, and 1 minute has 60 seconds.
Cannot pre-multiply, e.g. 1 hour has 3600 seconds.
Cannot use loops (for, while) or conditionals (if).


Sample Run:

Please enter the number of seconds.
>1234567
1234567 seconds = 2 weeks 0 days 6 hours 56 minutes and 7 seconds


Please name both filename and class name Time.
*/
