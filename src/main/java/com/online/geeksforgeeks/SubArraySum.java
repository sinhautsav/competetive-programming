package com.online.geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any): GFG
 * Difficulty Level: Easy
 * Status:
 * Description: Given an unsorted array A of size N of non-negative integers,
 * find a continuous sub-array which adds to a given number S.
 * Created On : 04/01/20
 */
public class SubArraySum {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int tc = Integer.parseInt(reader.readLine());
            while (tc > 0) {
                String sizeAndSum = reader.readLine();
                String array = reader.readLine();
                String[] arr = sizeAndSum.split(" ");
                String[] arrEle = array.split(" ");
                int N = Integer.parseInt(arr[0]);
                int S = Integer.parseInt(arr[1]);
                int[] mainArr = new int[N];
                for (int i = 0; i < N; i++) {
                    mainArr[i] = Integer.parseInt(arrEle[i]);
                }
                solve(mainArr, S);
                tc--;
            }
        }
    }

    private static void solve(int[] mainArr, int s) {
        int length = mainArr.length;
        int sum = 0, startIdx = 0;
        for (int i = 0; i < length; i++) {
            sum = sum + mainArr[i];
            while (sum > s) {
                sum = sum - mainArr[startIdx];
                startIdx++;
            }
            if (sum == s) {
                System.out.println((startIdx + 1) +" "+ (i + 1));
                return;
            }
        }
        System.out.println(-1);
    }
}
