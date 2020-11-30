import java.util.Scanner;

class Change {
  public static void main(String[] args){
    
  Scanner scan = new Scanner(System.in);
  System.out.println("Please enter the cost of the item:");
  double cost = scan.nextDouble();
  System.out.println("Please enter the amount paid:");
  double paid = scan.nextDouble();
  double change = paid-cost;
  System.out.println("Change Owed: $" + change);
  change = change * 100;
  int q = (int)change/25;
  change = change%25;
  int d = (int)change/10;
  change = change%10;
  int n = (int)change/5;
  change = change%5;
  int p = (int)change;
  System.out.println("Quarter(s): " + q);
  System.out.println("Dime(s): " + d);
  System.out.println("Nickel(s): " + n);
  System.out.println("Penn(ies): " + p);
  
  }
}