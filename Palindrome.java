import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args)
  {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter a word, phrase or sentence.");
    
    
    String text = scan.nextLine();
    
    String low = text.toLowerCase();
    
    String fix1 = low.replaceAll("[^a-zA-Z0-9\\s+]","");
    
    String fix2 = fix1.replaceAll("\\s","");
    
    if (checkPalindrome(fix2)) {
      System.out.print("\"" + text + "\"" + " is a palindrome");
    }
    
    else {
      System.out.print("\"" + text + "\"" + " isn't a palindrome");
    }
}
  
  static boolean checkPalindrome(String text) {
    
    int i = 0;
    int j = text.length() - 1;
    
    while (i < j) {
      if (text.charAt(i) != text.charAt(j)) {
        return false;
      }
      
      i++;
      j--;
    }
    return true;
} 
}


