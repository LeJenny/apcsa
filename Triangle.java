import java.util.Scanner;

class Triangle {
  public static void main(String[] args){ //i'll try spacing out my code this time ig
    
  Scanner scan = new Scanner(System.in);
  
  //variables
  System.out.println("Please enter the x and y coordinates of point 1 (separated by a space):");
  double x1 = scan.nextDouble();
  double y1 = scan.nextDouble();
  System.out.println("Please enter the x and y coordinates of point 2 (separated by a space):");
  double x2 = scan.nextDouble();
  double y2 = scan.nextDouble();
  System.out.println("Please enter the x and y coordinates of point 3 (separated by a space):");
  double x3 = scan.nextDouble();
  double y3 = scan.nextDouble();
  
  //calculations
  double s1 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
  double s2 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
  double s3 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));

  //comparisons
  if ((s1 == s2) && (s2 == s3))
    System.out.println("This is an equilateral triangle.");
  if ((s1 != s2) && (s2 != s3) && (s1 != s3))
    System.out.println("This is an scalene triangle.");
  if ((s1 == s2) && (s2 != s3) && (s1 != s3))
    System.out.println("This is an isosceles triangle.");
  if ((s1 == s3) && (s3 != s2) && (s1 != s2))
    System.out.println("This is an isosceles triangle.");
  if ((s2 == s3) && (s2 != s1) && (s3 != s1))
    System.out.println("This is an isosceles triangle.");
  }
}