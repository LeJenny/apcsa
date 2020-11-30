import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter an integer (enter 666 to stop):");
        
        int num = scan.nextInt();
        int max = num;
        
        while (num != 666)
        {
          
          if (num > max)
          {
            max = num;
          }
          
          num = scan.nextInt();

        }
        System.out.print(max + " is the maximum number.");
        // if they print 666 as their initial and only number, i think that should still count as the max cause i'm sure they understand the conditions.
    }

}


