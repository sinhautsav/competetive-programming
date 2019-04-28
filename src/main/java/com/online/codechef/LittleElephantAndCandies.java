package online.codechef;

import java.util.Scanner;

/**
 * Author: Utsav Sinha of House Sinha. First of his name. King In The East.
 * Reviewed By:
 * Project:
 * Created On : 6/12/18
 * Organisation: CustomerXPs Software Private Limited
 */
public class LittleElephantAndCandies {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            byte elephants = s.nextByte();
            long candies = s.nextLong();
            int[] array = new int[elephants+1];
            for (int i = 1; i < array.length; i++)
                array[i] = s.nextInt();

            for (int i = 1; i <= elephants; i++)
                candies = candies - array[i];
            if (candies < 0) System.out.println("No");
            else System.out.println("Yes");
            t--;
        }
    }
}
