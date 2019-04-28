package com.online.codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Group : CodeChef
 * Problem Code : SIMDISH
 * Submission : Successful
 * Author: Utsav Sinha
 * Created On : 4/22/17
 * Organisation: CustomerXPs Software Private Limited
 */
public class SimDishes {
    public static void main(String[] args) {

        int tc;
        Scanner s = new Scanner(System.in);
        List<String> d1 = new ArrayList<String>();
        List<String> d2 = new ArrayList<String>();
        tc = s.nextInt();
        while(tc > 0){
            d1.add(s.next()); d1.add(s.next()); d1.add(s.next()); d1.add(s.next());
            d2.add(s.next()); d2.add(s.next()); d2.add(s.next()); d2.add(s.next());
            String outcome = d1.removeAll(d2)
                    ? (d1.size() <=2 ? "similar" : "dissimilar") : "dissimilar";
            System.out.println(outcome);
            d1.clear(); d2.clear();
            tc--;
        }
    }
}
