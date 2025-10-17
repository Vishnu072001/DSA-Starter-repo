# DSA Theory Notes

# Two Sum - Notes by Jorge Flores

The **Two Sum** problem is a common question in Data Structures & Algorithms.

## Problem
Given an array of integers and a target number, find two numbers that add up to the target.

### Approach
- Use two loops to check every possible pair.
- If the sum equals the target, return their indices.

### Complexity
- **Time:** O(n²) — because every pair is checked.
- **Space:** O(1) — no extra memory used.

### Example
Input: [3, 1, 9, 9, 10], Target = 19  
Output: Indices [2, 3] → Numbers (9 + 10)
