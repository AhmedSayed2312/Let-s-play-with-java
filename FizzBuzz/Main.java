/*first user will enter a number, if the number is divisible by 5, print "Fizz".
if the number is divisible by 3, print "Buzz".
if the number is divisible by both 5 & 3, print "FizzBuzz".
if the number is not divisible by both 5 or 3, print "the number".
*/

package com.mmrproduct;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0 )
            System.out.println("Buzz");
        else
            System.out.println(number);

    }
}
