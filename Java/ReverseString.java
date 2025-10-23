/*
 * Problem: Reverse String
 * Description: Given a string, reverse it without using any built-in reverse functions.
 * Example: Input: "hello" → Output: "olleh"
 *
 * Approach: 
 *   - Convert the string to a character array.
 *   - Swap characters from both ends moving toward the center.
 *   - Return the reversed string.
 *
 * Time Complexity: O(n)  — Each character is visited once.
 * Space Complexity: O(1) — In-place reversal using the same array.
 *
 * Author: Jorge Flores
 * Date: October 17, 2025
 */

public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverse(input));
    }

    public static String reverse(String str){
        char[] arr = str.toCharArray();
        
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
        return new String(arr);
    }
}
