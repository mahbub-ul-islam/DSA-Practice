package Recursion.Course.Calling_Recursion;

public class CallingRecursion {

    public void callingRecursionFunc(int x) {
        if (x > 0) {
            System.out.println(x);
            callingRecursionFunc(x - 1);
        }

    }

    public static void main(String[] args) {

        CallingRecursion recursion = new CallingRecursion();
        int a = 3;

        recursion.callingRecursionFunc(a);
    }
}
