import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        
        int n1 = 0;
        int n2 = 1;
        int n3 = n1 + n2;
        int n4 = n2 + n3;
        int n5 = n3 + n4;
        
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);
        
        while (n5 != 701408733)
        {
          n1 = n4 + n5;
          n2 = n5 + n1;
          n3 = n1 + n2;
          n4 = n2 + n3;
          n5 = n3 + n4;
        
          System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);
        }
    }

}


