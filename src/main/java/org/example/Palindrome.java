package org.example;
import java.util.Scanner;
public class Palindrome {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a string:");
        String word = input.next();
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() -1;
        boolean ispalindrome=true;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                ispalindrome = false;
                break;
            }
        }
            left ++;
            right --;
            if (ispalindrome) {
                System.out.println("It's a palindrome:");
            } else {
                System.out.println("It ain't a palindrome:");
            }

       input.close();

   }
}
