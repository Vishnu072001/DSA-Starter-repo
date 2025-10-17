/*
 * Problem: Two Sum
 * Description: Given an array of integers and a target value,
 *              find the indices of the two numbers that add up to the target.
 * Example: nums = [2, 7, 11, 15], target = 9 → Output: [0, 1]
 *
 * Approach: Use a simple nested loop to check every pair of numbers.
 *           If their sum equals the target, return their indices.
 *           Time Complexity: O(n^2)
 *           Space Complexity: O(1)
 *
 * Author: Jorge Flores
 * Date: October 17, 2025
 */
public class TwoSum {
    public static void main(String[] args) {
        
        int target = 19;
        int arr[] = {3,1,9,9,10};
        System.out.print("array: ");
        
        printArray(arr);
        int[] result = solution(arr, target);
        if(result.length == 2){
            System.out.println("Indices found: [" + result[0] + ", " + result[1] + "]");
            System.out.println("Numbers: " + arr[result[0]] + " + " + arr[result[1]] + " = " + target);
        } else {
            System.out.println("No pair found!");
        }

    }

    public static int[] solution(int[] arr, int target) {

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
