package challenge;
// Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

import java.util.Scanner;
public class Q57 {
    public static int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res += (n & 1);
            n = n >>> 1;
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        int a = hammingWeight(n);
        System.out.println(a);
    }
}
