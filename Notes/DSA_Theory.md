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


### **5. Big O Notation**
Measures time & space complexity of algorithms

Examples:

O(1) → Constant time

O(n) → Linear time

O(log n) → Logarithmic time

O(n²) → Quadratic time

### **6. Tips for Beginners**

Learn arrays and strings first, then linked lists

Practice basic sorting & searching problems

Solve 1 problem per day consistently

Keep updating your Notes/DSA_Theory.md

