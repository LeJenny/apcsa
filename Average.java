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

/*
Assignment 2:  Weighted Average   (The program and class name must be Average .)
 
Write a program that will input a set of grades and compute a weighted average.

The program should input 2 test scores (as ints), 3 quiz scores (also as ints) and a homework average (as a double).

The program should then output the test average, quiz average and final grade (as doubles).

The final grade should be a weighted average. Count the test average as 50% of the final grade, the quiz average as 30% of the final grade and the homework average as 20% of the final grade. 

Sample Run:

Please enter your test grades.
Test 1 >89
Test 2 >86

Please enter your quiz grades.
Quiz 1 >84
Quiz 2 >84
Quiz 3 >83

Please enter your homework average.
Homework >90.12

>Test Average: 87.5
>Quiz Average: 83.66666666666667
>Final Grade: 86.874
*/
