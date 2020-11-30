import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter 5 integers");
        int one = scan.nextInt();
        int two = scan.nextInt();
        int three = scan.nextInt();
        int four = scan.nextInt();
        int five = scan.nextInt();
        
        int min;
        
        if (one<two)
        {
          min = one;
        }
        
        else 
        {
          min = two;
        }
        
        if (min>three)
        {
          min = three;
        }
        else if (min>four)
        {
          min = four;
        }
        else if (min>five)
        {
          min = five;
        }

        System.out.println("The minimum number is: " + min + ".");

    }

}


