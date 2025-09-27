package Recursion.Course.Indirect_Recursion;

public class IndirectRecursion {

    public void funA(int n) {
        if (n > 0) {
            System.out.println("funA ->" + n);
            funB(n - 1);
        }
    }

    public void funB(int n) {
        if (n > 1) {
            System.out.println("funB ->" + n);
            funA(n / 2);
        }
    }

    public static void main(String[] args) {

        IndirectRecursion indirectRecursion = new IndirectRecursion();
        int a = 20;
        indirectRecursion.funA(a);
    }
}
