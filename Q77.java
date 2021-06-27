package challenge;
// Given an array a[] of size n and a number num ,
// write a program to find if there exists a pair of elements in the array whose difference is num.
public class Q77 {

    // The function assumes that the array is sorted
    public static boolean findPair(int arr[], int n) {
        int size = arr.length;

        // Initialize positions of two elements
        int i = 0, j = 1;

        // Search for a pair
        while (i < size && j < size) {
            if (i != j && arr[j] - arr[i] == n) {
                System.out.print("Pair Found: " + "( " + arr[i] + ", " + arr[j] + " )");
                return true;
            } else if (arr[j] - arr[i] < n)
                j++;
            else
                i++;
        }

        System.out.print("No such pair");
        return false;
    }

    // Driver program to test above function
    public static void main(String[] args) {
        int arr[] = { 1, 8, 30, 60, 100 };
        int num = 40;
        findPair(arr, num);
    }
}
