/**
 * PalindromesRecursion.java
 *
 * Created by Calvin Wong on 10/27/14.
 *
 * A program that checks whether word or phrase is a Palindrome, using a regular reverse method and a recursive method!!
 */

import java.util.Scanner;

public class PalindromesRecursion {

    // using a regular reverse method
    public boolean isPalindrome1(String s) {

        StringBuilder reversed = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }

        return s.equalsIgnoreCase(reversed.toString());
    }

    // using the recursive method!!!!!!!
    public boolean isPalindrome2(String s) {

        if(s.length() == 0 || s.length() == 1) {
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome2(s.substring(1, s.length() - 1)); // recursion
        }
        return false;
    }

    // main method
    public static void main(String[] args) {

        PalindromesRecursion pal = new PalindromesRecursion();
        Scanner keyboard = new Scanner(System.in);

        String userInput;

        do {
            System.out.print("Enter a word or phrase to check for Palindromes ('exit' to quit): ");
            userInput = keyboard.nextLine();

            System.out.println(pal.isPalindrome1(userInput)); // using reverse method
            System.out.println(pal.isPalindrome2(userInput)); // using recursion

        } while (!userInput.equalsIgnoreCase("exit"));
    }
} // end of class

