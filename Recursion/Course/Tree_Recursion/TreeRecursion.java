package Recursion.Course.Tree_Recursion;

public class TreeRecursion {

    public void treeRecursionFunc(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            treeRecursionFunc(n - 1);
            treeRecursionFunc(n - 1);
        }
    }

    public static void main(String[] args) {

        TreeRecursion treeRecursion = new TreeRecursion();
        int x = 3;
        treeRecursion.treeRecursionFunc(x);
    }
}
