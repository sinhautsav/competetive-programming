package com.online.hackerearth;

import java.util.Scanner;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any):
 * Difficulty Level:
 * Status:
 * Description:
 * Created On : 2/7/19
 */
public class GCD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b = s.nextLong();
        int count = 1;
        long smaller = a < b ? a : b;
        long bigger = a > b ? a : b;
        long loopInvariant = smaller / 2;
        for (int i = 2; i <= loopInvariant; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        if (bigger % smaller == 0) count++;
        System.out.println(count);

    }
}
