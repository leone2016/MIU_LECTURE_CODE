package ALGORITHM.lectureCode.DP;

/**
 * Given an integer n, representing the number of steps in a staircase, write a function climbStairs that returns
 * the number of distinct ways to climb to the top of the staircase. Each time you can either climb 1 step or 2 steps.
 * You may assume that n is a non-negative integer.
 */
public class ClimbingStairs {
    public static int climbStairs(int n) {

        return climbStairs(n-1)+climbStairs(n-2);
    }
    public static void main(String[] args) {
        int i = climbStairs(4);
        System.out.println(i);
    }
}
