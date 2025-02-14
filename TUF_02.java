
import java.util.Arrays;

// Problem Statement: Given an array, we have to find the largest element in the array.

// Examples
// Example 1:
// Input:
//  arr[] = {2,5,1,3,0};
// Output:
//  5
// Explanation:
//  5 is the largest element in the array. 

// Example2:
// Input:
//  arr[] = {8,10,5,7,9};
// Output:
//  10
// Explanation:
//  10 is the largest element in the array. 

public class TUF_02 {
    static int largestElement(int[] arr, int n){
        int largestElement = Integer.MIN_VALUE;
        Arrays.sort(arr);
        largestElement = arr[n-1];
        return largestElement;
    }
    public static void main(String[] args) {
        int arr[] = {8,10,5,7,9};
        int n = arr.length;
        System.out.println("The largest element in the array is: " + largestElement(arr, n));
    }
}
