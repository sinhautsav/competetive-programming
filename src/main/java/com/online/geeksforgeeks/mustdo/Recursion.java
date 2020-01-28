package com.online.geeksforgeeks.mustdo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any):
 * Difficulty Level:
 * Status:
 * Description:
 * Created On : 25/01/20
 */
public class Recursion {
    /*
    3
3 4
0 1 1 0 1 1 1 1 0 1 2 3
0 1 5
     */
    public static void main(String[] args) throws IOException {
        floodFillInit();
    }

    private enum FROM {UP, DOWN, LEFT, RIGHT, CENTER}

    private static void floodFillInit() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int tc = Integer.parseInt(reader.readLine());
            while (tc > 0) {
                String dimInput = reader.readLine();
                String arrInput = reader.readLine();
                String progInput = reader.readLine();
                String[] dim = dimInput.split("\\s+");
                int n = Integer.parseInt(dim[0]);
                int m = Integer.parseInt(dim[1]);
                int[][] mainArr = new int[n][m];
                String[] elements = arrInput.split("\\s+");
                int ele = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        mainArr[i][j] = Integer.parseInt(elements[ele++]);
                    }
                }

                String[] xyk = progInput.split("\\s+");
                int x = Integer.parseInt(xyk[0]);
                int y = Integer.parseInt(xyk[1]);
                int k = Integer.parseInt(xyk[2]);
                floodFill(mainArr, x, y, k, mainArr[x][y], FROM.CENTER);
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print(mainArr[i][j] + " ");
                    }
                }
                System.out.println();
                tc--;
            }
        }
    }

    private static void floodFill(int[][] arr, int x, int y, int k, int value, FROM from) {
        if (x < 0 || y < 0 || x > arr.length - 1 || y > arr[0].length - 1) return;
        if (arr[x][y] != value) return;
        arr[x][y] = k;
        switch (from) {
            case CENTER:
                floodFill(arr, x, y - 1, k, value, FROM.RIGHT);
                floodFill(arr, x, y + 1, k, value, FROM.LEFT);
                floodFill(arr, x + 1, y, k, value, FROM.UP);
                floodFill(arr, x - 1, y, k, value, FROM.DOWN);
                break;
            case UP:
                floodFill(arr, x, y - 1, k, value, FROM.RIGHT);
                floodFill(arr, x, y + 1, k, value, FROM.LEFT);
                floodFill(arr, x + 1, y, k, value, FROM.UP);
                break;
            case DOWN:
                floodFill(arr, x, y - 1, k, value, FROM.RIGHT);
                floodFill(arr, x, y + 1, k, value, FROM.LEFT);
                floodFill(arr, x - 1, y, k, value, FROM.DOWN);
                break;
            case LEFT:
                floodFill(arr, x, y + 1, k, value, FROM.LEFT);
                floodFill(arr, x + 1, y, k, value, FROM.UP);
                floodFill(arr, x - 1, y, k, value, FROM.DOWN);
                break;
            case RIGHT:
                floodFill(arr, x, y - 1, k, value, FROM.RIGHT);
                floodFill(arr, x + 1, y, k, value, FROM.UP);
                floodFill(arr, x - 1, y, k, value, FROM.DOWN);
                break;
        }
    }
}