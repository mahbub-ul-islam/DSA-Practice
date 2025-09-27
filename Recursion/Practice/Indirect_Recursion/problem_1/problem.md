### **Problem 1: Print numbers from 1 to n in such a pattern:**

* If current number ≤ n, print it, then call another function which adds 1 and calls the first function again, but skip one number in between.

Example:
`A(1)` prints 1, calls `B(3)`,
`B(3)` prints 3, calls `A(5)`,
… until n is reached.
