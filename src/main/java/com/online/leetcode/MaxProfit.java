package com.online.leetcode;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any): LeetCode
 * Difficulty Level: Easy
 * Status: Success
 * Description:
 * Created On : 25/11/19
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        int cp = 0, diff = 0;
        cp = prices[0];
        for(int i = 1; i < prices.length; i++){
            int price = prices[i];
            if(price <= cp) cp = price;
            else if(price - cp > diff) {
                diff = price - cp;
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        MaxProfit mp = new MaxProfit();
        System.out.println(mp.maxProfit(new int[]{10,7,5,3,6,2,1}));
        System.out.println(mp.maxProfit(new int[]{10,7,5,3,6,2,14}));
        System.out.println(mp.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(mp.maxProfit(new int[]{7,6,4,3,1}));
    }
}
