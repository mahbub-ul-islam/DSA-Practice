package Recursion.Practice.Indirect_Recursion.problem_1;

public class Solution {

    public void funA(int n, int x) {
        if (x <= n) {
            System.out.println(x);
            x = x + 2;
            funB(n, x);
        }
    }

    public void funB(int n, int x) {
        if (x <= n) {
            System.out.println(x);
            x = x + 2;
            funA(n, x);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int a = 10;
        solution.funA(a, 1);
    }

}
