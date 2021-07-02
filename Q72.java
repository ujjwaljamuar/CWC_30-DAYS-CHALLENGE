package challenge;

// Write a program Given two integer arrays of same size, “arr[]” and “index[]”,
// reorder elements in “arr[]” according to given index array. It is not allowed to given array arr’s length.

import java.util.Arrays;

public class Q72 {
    static int arr[] = new int[]{50, 40, 70, 60, 90};
    static int index[] = new int[]{3,  0,  4,  1,  2};
     
    // Method to reorder elements of arr[] according
    // to index[]
    static void reorder()
    {
        int temp[] = new int[arr.length];
      
        // arr[i] should be present at index[i] index
        for (int i=0; i<arr.length; i++)
            temp[index[i]] = arr[i];
      
        // Copy temp[] to arr[]
        for (int i=0; i<arr.length; i++)
        {
           arr[i]   = temp[i];
           index[i] = i;
        }
    }
     

    public static void main(String[] args)
    {
         
        reorder();
         
        System.out.println("Reordered array is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Modified Index array is:");
        System.out.println(Arrays.toString(index));
         
    }
}
