// From a set of permutations for a given number n find the number of elements such hat no element appears in its original position.

import java.util.*;

public class Q1 {
    static int countPer(int n) {

        if (n == 1)
            return 0;
        if (n == 2)
            return 1;

        return (n - 1) * (countPer(n - 1) + countPer(n - 2));
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println(countPer(n));

        sc.close();
    }
}
