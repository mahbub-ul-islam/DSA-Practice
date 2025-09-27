package Recursion.Course.Returning_Recursion;

public class ReturningRecursion {

    public void returningRecursionFunc(int x) {
        if (x > 0) {
            returningRecursionFunc(x - 1);
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        ReturningRecursion recursion = new ReturningRecursion();

        int x = 3;
        recursion.returningRecursionFunc(x);
    }
}
