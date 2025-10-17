# DSA Theory Notes

# Two Sum - Notes by Jorge Flores

The **Two Sum** problem is a common question in Data Structures & Algorithms.

## Problem
Given an array of integers and a target number, find two numbers that add up to the target.

### Approach
- Use two loops to check every possible pair.
- If the sum equals the target, return their indices.

### Complexity
- **Time:** `O(n²)` — because every pair is checked.
- **Space:** `O(1)` — no extra memory used.

### Example
```bash
Input: [3, 1, 9, 9, 10], Target = 19  
Output: Indices [2, 4] → Numbers (9 + 10)
```
---

# Reverse String - Notes by Jorge Flores

The **Reverse String** problem is a classic question in Data Structures & Algorithms.

### Problem
Given a string, reverse it without using any built-in reverse functions.

### Approach
- Convert the string into a character array.
- Use two pointers (left and right) to swap characters from both ends, moving toward the center.
- Convert the array back into a string and return the result.

### Walkthrough Odd Length

**Input:** `"hello"`

| Step | left | right | Swap | Resulting Array |
|------|-------|--------|------|----------------|
| 1 | 0 | 4 | h ↔ o | ['o', 'e', 'l', 'l', 'h'] |
| 2 | 1 | 3 | e ↔ l | ['o', 'l', 'l', 'e', 'h'] |
| 3 | Stop (left = 2, right = 2) | — | Final: `"olleh"` |

**Output:** `"olleh"`

### Walkthrough Even Length
**Input:** `"java"`

| Step | left | right | Swap | Resulting Array |
|------|-------|--------|------|----------------|
| 1 | 0 | 3 | j ↔ a | ['a', 'a', 'v', 'j'] |
| 2 | 1 | 2 | a ↔ v | ['a', 'v', 'a', 'j'] |
| 3 | Stop (left = 2, right = 1) | — | Final: `"avaj"` |

**Output:** `"avaj"`


### Complexity
- **Time:** `O(n)` — each character is visited once.
- **Space:** `O(1)` — reversal happens in place, no extra structures used.

---

### Key Concept
- Uses the **Two-Pointer Technique**, a common approach for reversing arrays, checking palindromes, and similar problems.
- Works for both even and odd-length strings with no extra conditions needed.

---