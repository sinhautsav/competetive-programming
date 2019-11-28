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
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length > 2) {
            int firstSum = cost[0] + Math.min(cost[1], cost[2]);
            int secondSum = cost[1] + Math.min(cost[2], cost.length > 3 ? cost[3] : 0);
            int idx = firstSum >= secondSum ? 1 : 0;
            return min(idx, cost);
        } else {
            return Math.min(cost[0], cost[1]);
        }
    }

    private int min(int idx, int[] cost){
        int len = cost.length;
        int localCost = cost[idx];
        if(idx == len-1 || idx == len -2) return localCost;
        int idxPlusOne = idx+1;
        int idxPlusTwo = idxPlusOne+1;
        return localCost + ((cost[idxPlusOne] >= cost[idxPlusTwo]) ? min(idxPlusTwo, cost) : min(idxPlusOne, cost));
    }

    public static void main(String[] args) {
        MinCostClimbingStairs mccs = new MinCostClimbingStairs();
        System.out.println(mccs.minCostClimbingStairs(new int[]{10, 15, 20}));
        System.out.println(mccs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
        System.out.println(mccs.minCostClimbingStairs(new int[]{0,0,1,1}));
        System.out.println(mccs.minCostClimbingStairs(new int[]{0,1,2,2}));
    }
}
