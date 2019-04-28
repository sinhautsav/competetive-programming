package online.codechef;

import java.util.Scanner;

/**
 * Group : CodeChef
 * Problem Code : ICPC16B
 * Submission: Failed
 * Author: Utsav Sinha
 * Reviewed By:
 * Created On : 4/15/17
 * Organisation: CustomerXPs Software Private Limited
 */
public class BeautifulArray {
    public static void main(String[] args) {
        int tc, size, i, j, k, mul;
        boolean brek = false;
        Scanner s = new Scanner(System.in);
        tc = s.nextInt();
        while (tc > 0) {
            size = s.nextInt();
            int[] a = new int[size+1];
            for (i = 1; i <=size; i++)
                a[i] = s.nextInt();

            for(i = 1; i <=size ; i ++) {
                for (j = i + 1; j <=size && i != j; j++) {
                    mul = a[i] * a[j];
                    for(k=1; k <=size ; k++) {
                        brek = a[k] == mul;
                        if(brek) break;
                    }
                    if(brek) break;
                }
                if(brek) break;
            }
            if(brek) System.out.println("yes");
            else System.out.println("no");
            tc--;
        }
    }

    /*
    Lessons learnt:
        -Do not think convention always. Try bizarre .
        -Think of all the boundary conditions and handle them separately.
        -Its OK if the code grows bigger in number of lines. Avoid increase in time
         computation.
     */
}
