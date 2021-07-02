package challenge;

// Given a sorted array containing only 0s and 1s, find the transition point. Note: return -1 if there is no transition point.

public class Q82 {
    static int findTransitionPoint(int arr[], int n) {
        // perform a linear search and return the index of
        // first 1
        for (int i = 0; i < n; i++)
            if (arr[i] == 1)
                return i;

        // if no element is 1
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 1, 1 };
        int n = arr.length;

        int point = findTransitionPoint(arr, n);

        if (point >= 0)
            System.out.print("Transition point is " + point);
        else
            System.out.print("There is no transition point");
    }
}
