
# **Head Recursion Tracing**

Let's trace the execution of the `headRecursionFunc` method step by step. This is **head recursion** because the recursive call happens **before** other processing (printing).

Given:

* `headRecursionFunc(3)` is called from `main`

---

## **Step-by-Step Execution**

### **Step 1: headRecursionFunc(3) is called**

* `n = 3` (which is > 0) → condition true
* Calls `headRecursionFunc(2)` before printing
* **Stack state** : `headRecursionFunc(3)` paused before `System.out.println(3)`

### **Step 2: headRecursionFunc(2) is called**

* `n = 2` (> 0) → condition true
* Calls `headRecursionFunc(1)` before printing
* **Stack state** :
* `headRecursionFunc(2)` paused before `System.out.println(2)`
* `headRecursionFunc(3)` paused before `System.out.println(3)`

### **Step 3: headRecursionFunc(1) is called**

* `n = 1` (> 0) → condition true
* Calls `headRecursionFunc(0)` before printing
* **Stack state** :
* `headRecursionFunc(1)` paused before `System.out.println(1)`
* `headRecursionFunc(2)` paused before `System.out.println(2)`
* `headRecursionFunc(3)` paused before `System.out.println(3)`

### **Step 4: headRecursionFunc(0) is called**

* `n = 0` (not > 0) → condition false
* Function returns immediately (base case reached)

### **Step 5: Return to headRecursionFunc(1)**

* After `headRecursionFunc(0)` returns
* `headRecursionFunc(1)` executes `System.out.println(1)`
* **Output so far:**

**text**

```
1
```

### **Step 6: Return to headRecursionFunc(2)**

* `headRecursionFunc(2)` executes `System.out.println(2)`
* **Output so far:**

```
1
2
```

### **Step 7: Return to headRecursionFunc(3)**

* `headRecursionFunc(3)` executes `System.out.println(3)`
* **Final output:**

```
1
2
3
```

---

## **Tracing Tree Representation**

```
headRecursionFunc(3)
  n=3>0 → call headRecursionFunc(2)
    n=2>0 → call headRecursionFunc(1)
      n=1>0 → call headRecursionFunc(0)
        n=0 → base case, return
      print 1
    print 2
  print 3
```

---

## **Final Output**

```
1
2
3
```

---

 **Explanation** :
In  *head recursion* , the recursive call happens **before** any other processing. All calls are stacked up first, then the operations (printing) happen during the **unwinding phase** after the base case returns. This results in ascending order output (1, 2, 3) even though the function receives descending values (3, 2, 1).
