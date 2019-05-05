package com.online.hacckerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any): HackerRank
 * Difficulty Level: Medium
 * Status:
 * Description: Dynamic Programming
 * Created On : 5/5/19
 */
public class Equal {

    static int max(int[] arr) {
        int max = 0;
        for (int value : arr) {
            if (value > max) max = value;
        }
        return max;
    }

    static int closest(int[] arr, int max) {
        int maxDiff = 0, diff = 0;
        for (int i = 0; i < arr.length; i++) {
            if((diff = max - arr[i]) > maxDiff) maxDiff = diff;
        }
        return maxDiff - 5 >= 0 ? 5 : maxDiff - 2 >= 0 ? 2 : 1;
    }

    static int equal(int[] arr) {
        if(arr.length == 0 || arr.length == 1) return 0;
        int steps = 0;
        while(true) {
            int max = max(arr);
            int closest = closest(arr, max);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != max) arr[i] = arr[i] + closest;
            }
            steps++;
            int allElements = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == max) allElements++;
            }
            if (allElements == arr.length) break;
        }
        return steps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int result = equal(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
