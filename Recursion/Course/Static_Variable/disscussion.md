# ***Static Variable and Global variable in Recursion.***



Let's trace the execution using a recursion tree. We'll track the value of the static variable `x` at each step and the return value of each function call.

**Initial state:** `x = 0`

We are calling `fun(5)`.

### Step 1: `fun(5)` is called

* `n = 5` (which is > 0)
* Increment `x`: `x = 1`
* Now call `fun(4)` and wait for its return. Then return `fun(4) + x`

### Step 2: `fun(4)` is called

* `n = 4` (> 0)
* Increment `x`: `x = 2`
* Call `fun(3)` and wait. Then return `fun(3) + x`

### Step 3: `fun(3)` is called

* `n = 3` (> 0)
* Increment `x`: `x = 3`
* Call `fun(2)` and wait. Then return `fun(2) + x`

### Step 4: `fun(2)` is called

* `n = 2` (> 0)
* Increment `x`: `x = 4`
* Call `fun(1)` and wait. Then return `fun(1) + x`

### Step 5: `fun(1)` is called

* `n = 1` (> 0)
* Increment `x`: `x = 5`
* Call `fun(0)` and wait. Then return `fun(0) + x`

### Step 6: `fun(0)` is called

* `n = 0` (not > 0) -> returns `0`

Now we unwind the recursion:

* **`fun(1)`** returns: `fun(0) + x` = `0 + 5` = `5` (x is 5)
* **`fun(2)`** returns: `fun(1) + x` = `5 + 5` = `10` (x is 5)
* **`fun(3)`** returns: `fun(2) + x` = `10 + 5` = `15` (x is 5)
* **`fun(4)`** returns: `fun(3) + x` = `15 + 5` = `20` (x is 5)
* **`fun(5)`** returns: `fun(4) + x` = `20 + 5` = `25` (x is 5)

### Tracing Tree Representation:

> ```
> fun(5)
>   n=5>0 -> x becomes 1
>   call fun(4)
>     n=4>0 -> x becomes 2
>     call fun(3)
>       n=3>0 -> x becomes 3
>       call fun(2)
>         n=2>0 -> x becomes 4
>         call fun(1)
>           n=1>0 -> x becomes 5
>           call fun(0)
>             n=0 -> return 0
>           return fun(0) + x = 0 + 5 = 5
>         return fun(1) + x = 5 + 5 = 10
>       return fun(2) + x = 10 + 5 = 15
>     return fun(3) + x = 15 + 5 = 20
>   return fun(4) + x = 20 + 5 = 25
> ```
> ### Final Output:
>
> `25`
>
> **Key Point:** The static variable `x` is shared across all recursive calls. It is incremented to 5 during the recursive descent. Then, during the return, each call adds the current value of `x` (which is 5) to the result of the recursive call. Hence, every level adds 5, leading to a total of 25.
