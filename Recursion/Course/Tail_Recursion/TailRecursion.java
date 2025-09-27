package Recursion.Course.Tail_Recursion;

public class TailRecursion {

    public void tailRecursionFunc(int x) {
        if (x > 0) {
            System.out.println(x);
            tailRecursionFunc(x - 1);
        }
    }

    public static void main(String[] args) {

        TailRecursion tailRecursion = new TailRecursion();
        int a = 3;
        tailRecursion.tailRecursionFunc(a);
    }
}
