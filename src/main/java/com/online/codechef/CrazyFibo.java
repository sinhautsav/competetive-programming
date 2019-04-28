package com.online.codechef;

import java.util.Scanner;

/**
 * Group : CodeChef
 * Problem Code : CHNO8
 * Submission : Successful
 * Author: Utsav Sinha
 * Reviewed By:
 * Created On : 4/14/17
 * Organisation: CustomerXPs Software Private Limited
 */
public class CrazyFibo {

    public static void main(String[] args) {

        int mod = 1000000007;
        int tc, i, n, arr[] = new int[6];
        Scanner s = new Scanner(System.in);
        tc = s.nextInt();
        while(tc > 0){
            arr[0] = s.nextInt();
            arr[1] = s.nextInt();
            n = s.nextInt();

            for(i = 2; i <6; i++)
                arr[i] = arr[i-1] - arr[i-2];
            n = n-1; n=n%6;
            int res = arr[n] >= 0 ? arr[n]%mod : (mod + arr[n]%mod);
            System.out.println(res);
            tc--;
        }
    }

    /*
      Lesson learnt
          -if an equation gets expanded more and more try to reduce it by modifying equations
          -look for cyclic pattern to reduce iterations
          -do the math on paper first, then try to change it in code.
          -it is not necessary that code and solution on paper matches.
     */
}
