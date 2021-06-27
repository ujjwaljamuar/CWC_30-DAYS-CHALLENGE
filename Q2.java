package challenge;

//Write a program to find partial sums of the terms of the Fibonacci sequence.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3, count, sum=0;
        System.out.println("Enter the count : ");
        count = sc.nextInt();
        System.out.print(n1 + " " + n2 + " ");

        for (int i = 2; i < count; ++i) {
            n3 = n1 + n2;
            sum= sum + n3;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            

        }
        System.out.println();
        System.out.println("Sum is "+(sum+1));

        sc.close();
    }
           
}
