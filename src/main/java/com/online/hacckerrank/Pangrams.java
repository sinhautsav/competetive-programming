package com.online.hacckerrank;

import java.util.Scanner;

/**
 * Group: HackerRank
 * Problem Code :
 * Submission: Success
 * Author: Utsav Sinha
 * Reviewed By:
 * Created On : 4/15/17
 * Organisation: CustomerXPs Software Private Limited
 */
/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any): HackerRank
 * Difficulty Level:
 * Status:
 * Description:
 * Created On : 4/15/17
 */
public class Pangrams {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str = str.replaceAll(" ", "");
        char[] carr = new char[26];
        int count = 0;
        for (char c : str.toCharArray()) {
            if (count == 26) break;
            c = Character.toUpperCase(c);
            switch (c) {
                case ('A'):
                    if (carr[0] == '\u0000') {
                        carr[0] = c;
                        count++;
                    }
                    break;
                case ('B'):
                    if (carr[1] == '\u0000') {
                        carr[1] = c;
                        count++;
                    }
                    break;
                case ('C'):
                    if (carr[2] == '\u0000') {
                        carr[2] = c;
                        count++;
                    }
                    break;
                case ('D'):
                    if (carr[3] == '\u0000') {
                        carr[3] = c;
                        count++;
                    }
                    break;
                case ('E'):
                    if (carr[4] == '\u0000') {
                        carr[4] = c;
                        count++;
                    }
                    break;
                case ('F'):
                    if (carr[5] == '\u0000') {
                        carr[5] = c;
                        count++;
                    }
                    break;
                case ('G'):
                    if (carr[6] == '\u0000') {
                        carr[6] = c;
                        count++;
                    }
                    break;
                case ('H'):
                    if (carr[7] == '\u0000') {
                        carr[7] = c;
                        count++;
                    }
                    break;
                case ('I'):
                    if (carr[8] == '\u0000') {
                        carr[8] = c;
                        count++;
                    }
                    break;
                case ('J'):
                    if (carr[9] == '\u0000') {
                        carr[9] = c;
                        count++;
                    }
                    break;
                case ('K'):
                    if (carr[10] == '\u0000') {
                        carr[10] = c;
                        count++;
                    }
                    break;
                case ('L'):
                    if (carr[11] == '\u0000') {
                        carr[11] = c;
                        count++;
                    }
                    break;
                case ('M'):
                    if (carr[12] == '\u0000') {
                        carr[12] = c;
                        count++;
                    }
                    break;
                case ('N'):
                    if (carr[13] == '\u0000') {
                        carr[13] = c;
                        count++;
                    }
                    break;
                case ('O'):
                    if (carr[14] == '\u0000') {
                        carr[14] = c;
                        count++;
                    }
                    break;
                case ('P'):
                    if (carr[15] == '\u0000') {
                        carr[15] = c;
                        count++;
                    }
                    break;
                case ('Q'):
                    if (carr[16] == '\u0000') {
                        carr[16] = c;
                        count++;
                    }
                    break;
                case ('R'):
                    if (carr[17] == '\u0000') {
                        carr[17] = c;
                        count++;
                    }
                    break;
                case ('S'):
                    if (carr[18] == '\u0000') {
                        carr[18] = c;
                        count++;
                    }
                    break;
                case ('T'):
                    if (carr[19] == '\u0000') {
                        carr[19] = c;
                        count++;
                    }
                    break;
                case ('U'):
                    if (carr[20] == '\u0000') {
                        carr[20] = c;
                        count++;
                    }
                    break;
                case ('V'):
                    if (carr[21] == '\u0000') {
                        carr[21] = c;
                        count++;
                    }
                    break;
                case ('W'):
                    if (carr[22] == '\u0000') {
                        carr[22] = c;
                        count++;
                    }
                    break;
                case ('X'):
                    if (carr[23] == '\u0000') {
                        carr[23] = c;
                        count++;
                    }
                    break;
                case ('Y'):
                    if (carr[24] == '\u0000') {
                        carr[24] = c;
                        count++;
                    }
                    break;
                case ('Z'):
                    if (carr[25] == '\u0000') {
                        carr[25] = c;
                        count++;
                    }
                    break;
            }
        }
        if (count != 26) System.out.println("not pangram");
        else System.out.println("pangram");
    }
}
