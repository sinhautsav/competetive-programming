package com.online.codechef;

import java.util.Scanner;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any): CodeChef
 * Difficulty Level:
 * Status:
 * Description:
 * Created On : 6/13/18
 */
public class ChefNoteBooks {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int poetryPages = s.nextInt();
                int pagesLeft = s.nextInt();
                int rubles = s.nextInt();
                int booksShown = s.nextInt();

                int[] pages = new int[booksShown];
                int[] price = new int[booksShown];

                for (int i = 0; i < booksShown; i++) {
                    pages[i] = s.nextInt();
                    price[i] = s.nextInt();
                }

                boolean canBuy = false;
                for (int i = 0; i < booksShown; i++) {
                    if (pages[i] >= (poetryPages - pagesLeft) && price[i] <= rubles) {
                        canBuy = true;
                        break;
                    }
                }
                if (canBuy) System.out.println("LuckyChef");
                else System.out.println("UnluckyChef");
                t--;
            }
        }
    }
}
