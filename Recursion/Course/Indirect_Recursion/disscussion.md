
# **Indirect Recursion Tracing**

**Indirect Recursion** occurs when two or more functions call each other in a circular manner, creating a chain of recursive calls between different functions.

---

## **Step-by-Step Execution for n = 20**

### **Step 1: funA(20) is called from main**

* `n = 20` (which is > 0) → condition true
* **Print:** `funA ->20`
* Calls `funB(19)`
* **Stack state:** `funA(20)` paused

### **Step 2: funB(19) is called from funA(20)**

* `n = 19` (> 1) → condition true
* **Print:** `funB ->19`
* Calls `funA(9)` (since 19/2 = 9 in integer division)
* **Stack state:**
  * `funB(19)` paused
  * `funA(20)` paused

### **Step 3: funA(9) is called from funB(19)**

* `n = 9` (> 0) → condition true
* **Print:** `funA ->9`
* Calls `funB(8)`
* **Stack state:**
  * `funA(9)` paused
  * `funB(19)` paused
  * `funA(20)` paused

### **Step 4: funB(8) is called from funA(9)**

* `n = 8` (> 1) → condition true
* **Print:** `funB ->8`
* Calls `funA(4)` (since 8/2 = 4)
* **Stack state:**
  * `funB(8)` paused
  * `funA(9)` paused
  * `funB(19)` paused
  * `funA(20)` paused

### **Step 5: funA(4) is called from funB(8)**

* `n = 4` (> 0) → condition true
* **Print:** `funA ->4`
* Calls `funB(3)`
* **Stack state:**
  * `funA(4)` paused
  * `funB(8)` paused
  * `funA(9)` paused
  * `funB(19)` paused
  * `funA(20)` paused

### **Step 6: funB(3) is called from funA(4)**

* `n = 3` (> 1) → condition true
* **Print:** `funB ->3`
* Calls `funA(1)` (since 3/2 = 1)
* **Stack state:**
  * `funB(3)` paused
  * `funA(4)` paused
  * `funB(8)` paused
  * `funA(9)` paused
  * `funB(19)` paused
  * `funA(20)` paused

### **Step 7: funA(1) is called from funB(3)**

* `n = 1` (> 0) → condition true
* **Print:** `funA ->1`
* Calls `funB(0)`
* **Stack state:**
  * `funA(1)` paused
  * `funB(3)` paused
  * `funA(4)` paused
  * `funB(8)` paused
  * `funA(9)` paused
  * `funB(19)` paused
  * `funA(20)` paused

### **Step 8: funB(0) is called from funA(1)**

* `n = 0` (not > 1) → condition false
* Function returns immediately to `funA(1)`

### **Step 9: Return to funA(1)**

* After `funB(0)` returns
* `funA(1)` completes and returns to `funB(3)`

### **Step 10: Return to funB(3)**

* After `funA(1)` returns
* `funB(3)` completes and returns to `funA(4)`

### **Step 11: Return to funA(4)**

* After `funB(3)` returns
* `funA(4)` completes and returns to `funB(8)`

### **Step 12: Return to funB(8)**

* After `funA(4)` returns
* `funB(8)` completes and returns to `funA(9)`

### **Step 13: Return to funA(9)**

* After `funB(8)` returns
* `funA(9)` completes and returns to `funB(19)`

### **Step 14: Return to funB(19)**

* After `funA(9)` returns
* `funB(19)` completes and returns to `funA(20)`

### **Step 15: Return to funA(20)**

* After `funB(19)` returns
* `funA(20)` completes
* Program ends

---

## **Call Chain Representation**

```
funA(20)
│
├── Print: funA ->20
│
└── funB(19)
    │
    ├── Print: funB ->19
    │
    └── funA(9)
        │
        ├── Print: funA ->9
        │
        └── funB(8)
            │
            ├── Print: funB ->8
            │
            └── funA(4)
                │
                ├── Print: funA ->4
                │
                └── funB(3)
                    │
                    ├── Print: funB ->3
                    │
                    └── funA(1)
                        │
                        ├── Print: funA ->1
                        │
                        └── funB(0) → Base case (n ≤ 1)
```

---

## **Final Output**

```
funA ->20
funB ->19
funA ->9
funB ->8
funA ->4
funB ->3
funA ->1
```

---

## **Pattern Analysis**

* **Recursion Pattern** : `funA` → `funB` → `funA` → `funB` → ...
* **Parameter Reduction** :
* `funA` reduces `n` by 1 when calling `funB`
* `funB` halves `n` (integer division) when calling `funA`
* **Termination Condition** : The recursion stops when `funB` receives `n ≤ 1`
* **Total function calls** : 15 (including both functions)
* **Output sequence** : Alternates between funA and funB with decreasing values

 **Time Complexity** : O(log n) - values are halved each cycle
 **Space Complexity** : O(log n) - proportional to the depth of recursion chain
