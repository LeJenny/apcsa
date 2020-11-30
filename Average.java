import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your test grades.");
        int test1= scan.nextInt();
        int test2 = scan.nextInt();

        System.out.println("Please enter your quiz grades.");
        int quiz1= scan.nextInt();
        int quiz2 = scan.nextInt();
        int quiz3 = scan.nextInt();

        System.out.println("Please enter your homework average.");
        double hw= scan.nextDouble();

        double tavg= (test1+test2)/2.0;
        double qavg = (quiz1+quiz2+quiz3)/3.0;
        double fgrade = (0.5*tavg)+(0.3*qavg)+(0.2*hw);

        System.out.println("Test average: "+ tavg);
        System.out.println("Quiz average: "+ qavg);
        System.out.println("Final grade: "+ fgrade);

    }

}


