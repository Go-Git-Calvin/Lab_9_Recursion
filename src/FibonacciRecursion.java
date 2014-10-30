/**
 * FibonacciRecursion.java
 *
 * Created by Calvin Wong on 10/27/14.
 *
 * A program that uses a recursive method for the Fibonacci sequence
 */

import java.util.Scanner;

public class FibonacciRecursion {

    public static void main(String[] args) {

        // prints fibonacci numbers up to specified number
        System.out.print("Enter number for Fibonacci to print:");
        int userInput = new Scanner(System.in).nextInt();

        System.out.println("Fibonacci series up to " + userInput + " numbers :");

        for (int i = 1; i < userInput; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println("\n");

        // prints fibonacci step by step sequence
        System.out.println("\n" + fibonacci2(userInput));

        /*
        // prints out entire fibonacci sequence
        int index = 0;
        while (true) {
            System.out.println(fibonacci(index));
            index++;
        }
        */
    }

    // fibonacci recursive method
    public static long fibonacci(int n) {
        if (n <= 0) {
            return 0;
            //throw new IllegalArgumentException("n <= 0"); // throws argument exception n < 0
        }
        if (n <= 2) {
            return 1;
        } else {
           return fibonacci(n - 1) + fibonacci(n - 2); // recursion
        }
    }

    // fibonacci that prints the step by step sequence
    public static long fibonacci2(int n)  {

        long number1;
        long number2;
        long result;

        if(n == 0) {
            return 0;

        } else if(n == 1) {
            return 1;

        } else {
            number1 = fibonacci2(n - 1);
            number2 = fibonacci2(n - 2);

            result = number1 + number2;

            System.out.println("Fibonacci2(n - 1) = " + number1);
            System.out.println("Fibonacci2(n - 2) = " + number2);
            System.out.println("\t\t   Result = " + result + "\n");
        }
        return result;
    }
} // end of class
