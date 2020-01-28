package com.online.geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any):
 * Difficulty Level:
 * Status:
 * Description:
 * Created On : 05/01/20
 */
public class CountTriplets {
    public static void main(String[] args) throws IOException {
        int[] numbers = new int[100000];
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int tc = Integer.parseInt(reader.readLine());
            while (tc > 0) {
                int size = Integer.parseInt(reader.readLine());
                String array = reader.readLine();
                String[] arrEle = array.split(" ");
                int max = 0;
                for (int i = 0; i < size; i++) {
                    int idx = Integer.parseInt(arrEle[i]);
                    max = Math.max(max, idx);
                    numbers[idx] = idx;
                }
                solve(numbers, max);
                tc--;
            }
        }
    }

    private static void solve(int[] numbers, int max) {
        int count = 0;
        for(int i = 1; i < max; i++){
            if(numbers[i] == 0) continue;
            for(int j = i+1; j < max; j++){
                if(numbers[j] == 0) continue;
                int idx = numbers[i] + numbers[j];
                if(numbers[idx] != 0) count++;
            }
        }
        if(count == 0) System.out.println(-1);
        else System.out.println(count);
    }
}
