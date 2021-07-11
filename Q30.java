package challenge;

public class Q30 {
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Function to Rearrange positive and negative
    // numbers in a array
    static void RearrangePosNeg(int arr[], int n)
    {
        int key, j;
        for (int i = 1; i < n; i++) {
            key = arr[i];
 
            // if current element is positive
            // do nothing
            if (key > 0)
                continue;
 
            /* if current element is negative,
            shift positive elements of arr[0..i-1],
            to one position to their right */
            j = i - 1;
            while (j >= 0 && arr[j] > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
 
            // Put negative element at its right position
            arr[j + 1] = key;
        }
    }
 
    // Driver program
    public static void main(String[] args)
    {
        int arr[] = { -3, 22, -45 , 67, 8,10, 9, -2, -5 };
        int n = arr.length;
        RearrangePosNeg(arr, n);
        printArray(arr, n);
    }
}
