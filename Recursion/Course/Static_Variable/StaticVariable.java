package Recursion.Course.Static_Variable;

public class StaticVariable {

    static int x = 0;

    int fun(int n) {

        if (n > 0) {
            x++;
            return fun(n - 1) + x;
        }
        return 0;
    }

    public static void main(String[] args) {

        StaticVariable staticVariable = new StaticVariable();
        int a = 5;
        System.out.println(staticVariable.fun(a));

    }
}
