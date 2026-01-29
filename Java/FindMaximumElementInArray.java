/*
 * Problem: Find Maximum Element
 * Description: Given an array of integers, find and return the largest value.
 *
 * Example:
 *   Input: [3, 7, 1, 9, 5]
 *   Output: 9
 *
 * Approach:
 *   - Assume the first element is the maximum.
 *   - Loop through the array; if any element is greater, update max.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Author: Jorge Flores
 * Date: October 17, 2025
 */

public class FindMaximumElementInArray {

    
    public static void main(String[] args) {
        int[] arr = {3, 7, 5, 9, 1000};
        System.out.println("Maximum element: " + findMax(arr));
    }
    

    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i ++){
            if(max < arr[i]){
                max = arr[i];
            }        
        }
        return max; 
    }
}   

