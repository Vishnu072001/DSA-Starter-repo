# DSA Basic Notes – Starter Version

## 1. What is DSA?
**DSA (Data Structures and Algorithms)** is the study of:  
- **Data Structures:** Ways to store and organize data efficiently  
- **Algorithms:** Step-by-step instructions to solve problems

**Why DSA is important:**  
- Improves **problem-solving skills**  
- Optimizes **time and memory usage**  
- Essential for **interviews and competitive programming**

---

## 2. Types of Data Structures

| Type        | Examples                | Use Cases                        |
|------------|------------------------|---------------------------------|
| Linear      | Arrays, Linked Lists, Stack, Queue | Ordered data, simple traversal |
| Non-linear  | Trees, Graphs, Heaps   | Hierarchical or interconnected data |
| Hash-based  | HashMap, HashSet       | Fast search, insert, delete     |

---

## 3. Examples of Data Structures in Java

```java
// 3.1 Arrays
int arr[] = {1, 2, 3, 4};
System.out.println("First element: " + arr[0]);

// 3.2 Linked List (Singly)
class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; next = null; }
}
// Example usage
Node head = new Node(10);
head.next = new Node(20);

// 3.3 Stack (LIFO)
Stack<Integer> stack = new Stack<>();
stack.push(10);
stack.push(20);
System.out.println("Top element: " + stack.peek());
stack.pop();

// 3.4 Queue (FIFO)
Queue<Integer> queue = new LinkedList<>();
queue.add(10); // enqueue
queue.add(20);
System.out.println("Front element: " + queue.peek());
queue.remove(); // dequeue

// 3.5 Binary Tree
class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int data) { this.data = data; left = right = null; }
}
// Example usage
TreeNode root = new TreeNode(1);
root.left = new TreeNode(2);
root.right = new TreeNode(3);

// 3.6 Graph (Adjacency List)
int n = 5; // number of vertices
List<List<Integer>> graph = new ArrayList<>();
for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
graph.get(0).add(1); // edge from 0 -> 1
graph.get(0).add(2); // edge from 0 -> 2


### 4. Common Algorithm Types

| Type               | Description                     | Examples                               |
|-------------------|---------------------------------|---------------------------------------|
| Sorting            | Arrange data in order           | Bubble Sort, Quick Sort, Merge Sort   |
| Searching          | Find element in data            | Linear Search, Binary Search          |
| Recursion          | Function calls itself           | Factorial, Fibonacci                  |
| Dynamic Programming| Solve problems using subproblems| Knapsack, LCS                         |
| Greedy             | Make locally optimal choice     | Minimum Spanning Tree (Kruskal, Prim)|
| Graph              | Traverse nodes                  | BFS, DFS, Dijkstra                    |

### 5. Big O Notation
**Measures time & space complexity of algorithms**

Examples:

- `O(1)` → Constant time  
- `O(n)` → Linear time  
- `O(log n)` → Logarithmic time  
- `O(n²)` → Quadratic time  

### 6. Tips for Beginners

- Learn arrays and strings first, then linked lists  
- Practice basic sorting & searching problems  
- Solve 1 problem per day consistently  




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

# Valid Palindrome – Notes by Jorge Flores

The **Valid Palindrome** problem is a common string and two-pointer question in Data Structures & Algorithms.

## Problem
Check if a given string reads the same forwards and backwards, ignoring punctuation, spaces, and case sensitivity.

### Approach
- Use two pointers (left, right) starting from both ends of the string.
- Skip over any characters that are not letters or digits.
- Compare characters in lowercase form to ensure case doesn’t matter.
- Move the pointers inward until they meet or cross.
- If a mismatch is found, return `false`; otherwise, return `true`.

### Walkthrough

**Input:** `"madam"`

| Step | left | right | cL  | cR  | Match? | Action               |
| ---- | ---- | ----- | --- | --- | ------ | -------------------- |
| 1    | 0    | 4     | 'm' | 'm' | ✅      | move inward          |
| 2    | 1    | 3     | 'a' | 'a' | ✅      | move inward          |
| 3    | 2    | 2     | 'd' | 'd' | ✅      | pointers meet → stop |


**Output:** Is Palindrome: `true`

---

### Complexity
- **Time:** `O(n)` — each character is checked at most once
- **Space:** `O(1)` — only two pointers are used, no extra data structures


### Key Concept
- Uses the **Two-Pointer Technique**, which is efficient for palindrome, reverse, and comparison problems.
- Can be easily extended for numeric or alphanumeric strings.

---