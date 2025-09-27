# **Tree Recursion Tracing**

**Tree Recursion** occurs when a function makes more than one recursive call within its execution, creating a tree-like structure of recursive calls. Each call branches out into multiple subsequent calls.

---

## **Step-by-Step Execution for n = 3**

### **Step 1: treeRecursionFunc(3) is called**

* `n = 3` (which is > 0) → condition true
* **Print:** `3`
* Calls `treeRecursionFunc(2)` (first call)
* **Stack state:** `treeRecursionFunc(3)` paused before second `treeRecursionFunc(2)`

### **Step 2: treeRecursionFunc(2) is called** (first call from treeRecursionFunc(3))

* `n = 2` (> 0) → condition true
* **Print:** `2`
* Calls `treeRecursionFunc(1)` (first call)
* **Stack state:**
  * `treeRecursionFunc(2)` paused before second `treeRecursionFunc(1)`
  * `treeRecursionFunc(3)` paused before second `treeRecursionFunc(2)`

### **Step 3: treeRecursionFunc(1) is called** (first call from treeRecursionFunc(2))

* `n = 1` (> 0) → condition true
* **Print:** `1`
* Calls `treeRecursionFunc(0)` (first call)

### **Step 4: treeRecursionFunc(0) is called** (first call from treeRecursionFunc(1))

* `n = 0` (not > 0) → condition false
* Function returns immediately (base case reached)

### **Step 5: Return to treeRecursionFunc(1)** (first call)

* After `treeRecursionFunc(0)` returns
* Calls `treeRecursionFunc(0)` again (second call)

### **Step 6: treeRecursionFunc(0) is called** (second call from treeRecursionFunc(1))

* `n = 0` (not > 0) → condition false
* Function returns immediately
* `treeRecursionFunc(1)` (first call) completes

### **Step 7: Return to treeRecursionFunc(2)** (first call)

* After first `treeRecursionFunc(1)` returns
* Calls `treeRecursionFunc(1)` again (second call)

### **Step 8: treeRecursionFunc(1) is called** (second call from treeRecursionFunc(2))

* `n = 1` (> 0) → condition true
* **Print:** `1`
* Calls `treeRecursionFunc(0)` (first call) → base case, returns
* Calls `treeRecursionFunc(0)` (second call) → base case, returns
* `treeRecursionFunc(1)` (second call) completes

### **Step 9: Return to treeRecursionFunc(2)** (first call)

* After second `treeRecursionFunc(1)` returns
* `treeRecursionFunc(2)` (first call) completes

### **Step 10: Return to treeRecursionFunc(3)**

* After first `treeRecursionFunc(2)` returns
* Calls `treeRecursionFunc(2)` again (second call)

### **Step 11: treeRecursionFunc(2) is called** (second call from treeRecursionFunc(3))

* `n = 2` (> 0) → condition true
* **Print:** `2`
* Calls `treeRecursionFunc(1)` (first call)

### **Step 12: treeRecursionFunc(1) is called** (third call overall)

* `n = 1` (> 0) → condition true
* **Print:** `1`
* Calls `treeRecursionFunc(0)` → base case, returns
* Calls `treeRecursionFunc(0)` → base case, returns
* `treeRecursionFunc(1)` (third call) completes

### **Step 13: Return to treeRecursionFunc(2)** (second call)

* After first `treeRecursionFunc(1)` returns
* Calls `treeRecursionFunc(1)` again (second call)

### **Step 14: treeRecursionFunc(1) is called** (fourth call overall)

* `n = 1` (> 0) → condition true
* **Print:** `1`
* Calls `treeRecursionFunc(0)` → base case, returns
* Calls `treeRecursionFunc(0)` → base case, returns
* `treeRecursionFunc(1)` (fourth call) completes

### **Step 15: Return to treeRecursionFunc(2)** (second call)

* After second `treeRecursionFunc(1)` returns
* `treeRecursionFunc(2)` (second call) completes

### **Step 16: Return to treeRecursionFunc(3)**

* After second `treeRecursionFunc(2)` returns
* `treeRecursionFunc(3)` completes
* Program ends

---

## **Tracing Tree Representation**

```
treeRecursionFunc(3)
├── Print 3
├── treeRecursionFunc(2) [First call]
│   ├── Print 2
│   ├── treeRecursionFunc(1) [First call]
│   │   ├── Print 1
│   │   ├── treeRecursionFunc(0) → Base case (nothing)
│   │   └── treeRecursionFunc(0) → Base case (nothing)
│   └── treeRecursionFunc(1) [Second call]
│       ├── Print 1
│       ├── treeRecursionFunc(0) → Base case (nothing)
│       └── treeRecursionFunc(0) → Base case (nothing)
└── treeRecursionFunc(2) [Second call]
    ├── Print 2
    ├── treeRecursionFunc(1) [First call]
    │   ├── Print 1
    │   ├── treeRecursionFunc(0) → Base case (nothing)
    │   └── treeRecursionFunc(0) → Base case (nothing)
    └── treeRecursionFunc(1) [Second call]
        ├── Print 1
        ├── treeRecursionFunc(0) → Base case (nothing)
        └── treeRecursionFunc(0) → Base case (nothing)
```

---

## **Final Output**

```
3 2 1 1 2 1 1
```

---

## **Pattern Analysis**

* **Total function calls** : 15 (including base cases)
* **Total prints** : 7
* **Output pattern** : The sequence follows a **pre-order traversal** of the recursion tree
* Each number `k` appears **2^(3-k)** times in the output:
  * 3 appears 2⁰ = 1 time
  * 2 appears 2¹ = 2 times
  * 1 appears 2² = 4 times

 **Time Complexity** : O(2ⁿ) - exponential growth
 **Space Complexity** : O(n) - maximum depth of recursion stack
