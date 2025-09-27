# *Tail Recursion*

Let's trace the execution of the `tailRecursionFunc` method step by step. This is a tail recursion because the recursive call is the last operation in the function.

Given:

* `tailRecursionFunc(3)` is called.

We'll trace each call:

### Step 1: `tailRecursionFunc(3)` is called

* `x = 3` (which is > 0)
* Print `3`
* Call `tailRecursionFunc(2)`

**Output so far:**

```
3
```

### Step 2: `tailRecursionFunc(2)` is called

* `x = 2` (> 0)
* Print `2`
* Call `tailRecursionFunc(1)`

**Output so far:**

```
3
2
```

### Step 3: `tailRecursionFunc(1)` is called

* `x = 1` (> 0)
* Print `1`
* Call `tailRecursionFunc(0)`

**Output so far:**

```
3
2
1
```

### Step 4: `tailRecursionFunc(0)` is called

* `x = 0` (not > 0) -> condition fails, so nothing is printed and no recursive call is made.
* The function returns.

Since there are no more operations after the recursive calls, the recursion unwinds without any further output.

### Final Output:

```
3
2
1
```

### Tracing Tree Representation:

```
tailRecursionFunc(3)
  x=3>0 -> print 3
  call tailRecursionFunc(2)
    x=2>0 -> print 2
    call tailRecursionFunc(1)
      x=1>0 -> print 1
      call tailRecursionFunc(0)
        x=0 -> do nothing, return
      return
    return
  return
```

This is a classic example of tail recursion. The recursive call is the last thing done by the function. In such cases, the compiler can optimize it to avoid building up a large call stack (though Java generally does not perform tail call optimization). However, for this input (n=3), the stack depth is manageable.

The output is simply the numbers from 3 down to 1 printed in descending order.
