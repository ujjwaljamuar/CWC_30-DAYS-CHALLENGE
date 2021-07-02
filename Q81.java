package challenge;

// Given an array of even size N, task is to find minimum value that can be added to an element so that array become balanced. 
// An array is balanced if the sum of the left half of the array elements is equal to the sum of right half.
public class Q81 {
    public static int minValueToBalance(int a[], int n) {
        // Calculating sum of first half
        // elements of an array
        int sum1 = 0;
        for (int i = 0; i < n / 2; i++)
            sum1 += a[i];

        // Calculating sum of other half
        // elements of an array
        int sum2 = 0;
        for (int i = n / 2; i < n; i++)
            sum2 += a[i];

        // calculating difference
        return Math.abs(sum1 - sum2);
    }

    
    public static void main(String[] args) {
        int arr[] = { 1, 7, 1, 1, 3, 1 };
        int n = 6;
        System.out.print(minValueToBalance(arr, n));
    }
}
