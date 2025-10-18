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

## Problem
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

---

### Complexity
- **Time:** `O(n)` — each character is visited once.
- **Space:** `O(1)` — reversal happens in place, no extra structures used.



### Key Concept
- Uses the **Two-Pointer Technique**, a common approach for reversing arrays, checking palindromes, and similar problems.
- Works for both even and odd-length strings with no extra conditions needed.

---

# Find Maximum Element - Notes by Jorge Flores

The **Find Maximum Element** problem is one of the most fundamental exercises in Data Structures & Algorithms.

## Problem
Given an array of integers, find and return the largest value.


### Approach
- Assume the first element of the array is the maximum.
- Loop through the rest of the array.
- If any element is greater than the current maximum, update `max`.
- Return the final `max` value at the end of the loop.

### Walkthrough

**Input:** `[3, 7, 5, 9, 1000]`

| Step | i | arr[i] | Current Max | Action |
|------|---|---------|--------------|---------|
| 1 | 0 | 3 | 3 | Initialize max = 3 |
| 2 | 1 | 7 | 3 → 7 | Update max |
| 3 | 2 | 5 | 7 | No change |
| 4 | 3 | 9 | 7 → 9 | Update max |
| 5 | 4 | 1000 | 9 → 1000 | Update max |

**Output:** `1000`

---

### Complexity
- **Time:** `O(n)` — the array is traversed once.
- **Space:** `O(1)` — only a single variable (`max`) is used.



### Key Concept
- Demonstrates **linear traversal** over an array.
- Shows how to track and update a running value during iteration.
- Useful foundation for more advanced problems like **finding min, average, or range**.

---

