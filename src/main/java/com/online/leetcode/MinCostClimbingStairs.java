package com.online.leetcode;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any):
 * Difficulty Level:
 * Status:
 * Description:
 * Created On : 28/11/19
 */
public class MinCostClimbingStairs {
    private static int minCostClimbingStairs(int[] cost) {
        int costOne = cost[0];
        int costTwo = cost[1];
        if(cost.length == 2) return Math.min(costOne, costTwo);
        for(int i = 2; i < cost.length; i++) {
            int stepCost = cost[i] + Math.min(costOne, costTwo);
            costOne = costTwo;
            costTwo = stepCost;
        }
        return Math.min(costOne, costTwo);
    }

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{0,0,1,1}));
    }
}
