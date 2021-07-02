package challenge;

// The number will be unique if it is positive integer and there are no repeated digits in the number. 
// In other words, a number is said to be unique if and only if the digits are not duplicate.
// For example, 20, 56, 9863, 145, etc. are the unique numbers while 33, 121, 900, 1010, etc. are not unique numbers

import java.util.Scanner;

public class Q65 {
    public static void main(String args[]) {
        int r1, r2, number, num1, num2, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        // reading a number from the user
        number = sc.nextInt();
        // num1 and num2 are temporary variable
        num1 = number;
        num2 = number;
        // iterate over all digits of the number
        while (num1 > 0) {
            // detrmins the last digit of the number
            r1 = num1 % 10;
            while (num2 > 0) {
                // finds the last digit
                r2 = num2 % 10;
                // comparing the last digit
                if (r1 == r2) {
                    // increments the count variable by 1
                    count++;
                }
                // removes the last digit from the number
                num2 = num2 / 10;
            }
            // removes the last digit from the number
            num1 = num1 / 10;
        }
        if (count == 1) {
            System.out.println("The number is unique.");
        } else {
            System.out.println("The number is not unique.");
        }
    }
}
