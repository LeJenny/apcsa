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