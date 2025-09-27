package Recursion.Course.Head_Recursion;

public class HeadRecursion {

    void headRecursionFunc(int n) {
        if (n > 0) {
            headRecursionFunc(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        HeadRecursion headRecursion = new HeadRecursion();

        int x = 3;
        headRecursion.headRecursionFunc(x);
    }
}
