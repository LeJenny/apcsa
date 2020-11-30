import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

public class Tips {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the dinner amount (up to 2 decimal places only)");
        double amt = scan.nextDouble();
        
        System.out.println("Please enter the satisfaction level (1 – 3 only)");
        int level = scan.nextInt();

        double tip;
        double total;
        
        if (level==3)
        {
          System.out.println("Customer is totally satisfied.");
          System.out.println("Dinner amount = $" + amt);
          
          tip = (int) ((amt * 0.2) * 100 + 0.5) / 100.0;
          System.out.println("Tip amount = $" + tip);
          
          total = amt+tip;
          System.out.println("Total amount = $" + total);
        }
        
        if (level==2)
        {
          System.out.println("Customer is  satisfied.");
          System.out.println("Dinner amount = $" + amt);
          
          tip = (int) ((amt * 0.15) * 100 + 0.5) / 100.0;
          System.out.println("Tip amount = $" + tip);
          
          total = amt+tip;
          System.out.println("Total amount = $" + total);
        }
        
        if (level==1)
        {
          System.out.println("Customer is not satisfied.");
          System.out.println("Dinner amount = $" + amt);
          
          tip = (int) ((amt * 0.1) * 100 + 0.5) / 100.0;
          System.out.println("Tip amount = $" + tip);
          
          total = amt+tip;
          System.out.println("Total amount = $" + total);
        }

    }

}


