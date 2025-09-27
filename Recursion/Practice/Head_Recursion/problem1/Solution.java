package Recursion.Practice.Head_Recursion.problem1;

public class Solution {

    public void funA(int n) {
        if (n > 0) {
            funA(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int a = 5;
        solution.funA(a);
    }
}
