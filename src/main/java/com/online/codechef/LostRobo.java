package com.online.codechef;

import java.util.Scanner;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any): CodeChef(ICPC16A)
 * Difficulty Level:
 * Status:
 * Description:
 * Created On : 4/15/17
 */
class LostRobo {

    public static void main(String[] args) {

        int tc, x1, y1, x2, y2;
        String dir;
        Scanner s = new Scanner(System.in);
        tc = s.nextInt();
        while(tc > 0){
            dir = "";
            x1 = s.nextInt();
            y1 = s.nextInt();
            x2 = s.nextInt();
            y2 = s.nextInt();
            if(x2-x1 != 0 && y2-y1 !=0)
                dir = "sad";
            else {
                if(x2-x1 == 0 && y2-y1 != 0)
                    dir = y2-y1 > 0 ? "up" : "down";
                if(x2-x1 !=0 && y2-y1 == 0)
                    dir = x2-x1 > 0 ? "right" : "left";
            }
            System.out.println(dir);
            tc--;
        }
    }
}
