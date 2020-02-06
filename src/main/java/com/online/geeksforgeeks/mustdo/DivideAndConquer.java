package com.online.geeksforgeeks.mustdo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any): GeeksForGeeks
 * Difficulty Level: Basic
 * Status:
 * Description:
 * Created On : 04/02/20
 */
public class DivideAndConquer {

    public static void main(String[] args) throws IOException {
        elementThatAppearsOnceInSortedArray();
    }

    /**
     * Link: https://practice.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array/0
     */
    public static void elementThatAppearsOnceInSortedArray() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int tc = Integer.parseInt(reader.readLine());
            while (tc > 0) {
                int size = Integer.parseInt(reader.readLine());
                String arrInput = reader.readLine();
                String[] elements = arrInput.split("\\s+");
                int[] array = new int[size];
                for (int i = 0; i < size; i++) {
                    array[i] = Integer.parseInt(elements[i]);
                }
                elementThatAppearsOnceInSortedArray(array);
                tc--;
            }
        }
    }

    private static void elementThatAppearsOnceInSortedArray(int[] array) {
        int start = 0, end = array.length - 1, mid = 0;
        while (start != end) {
            mid = (start + end) / 2;
            if((mid & 1) == 0){
                if(array[mid] == array[mid + 1]) start = mid + 2;
                else end = mid;
            } else {
                if(array[mid] == array[mid - 1]) start = mid + 1;
                else end = mid - 1;
            }
        }
        System.out.println(array[start]);
    }

    /**
     * link: https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array/0/
     */
    public static void elementThatAppearsAtKthPositionInTwoSortedArrays() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int tc = Integer.parseInt(reader.readLine());
            while (tc > 0) {

                String[] nmk = reader.readLine().split("\\s+");
                String[] nArr = reader.readLine().split("\\s+");
                String[] mArr = reader.readLine().split("\\s+");

                int n = Integer.parseInt(nmk[0]);
                int m = Integer.parseInt(nmk[1]);
                int k = Integer.parseInt(nmk[2]);

                int[] arrOne = new int[n];
                int[] arrTwo = new int[m];

                for (int i = 0; i < n; i++) arrOne[i] = Integer.parseInt(nArr[i]);
                for (int i = 0; i < m; i++) arrTwo[i] = Integer.parseInt(mArr[i]);
                System.out.println(findKthElement(arrOne, arrTwo, k));
                tc--;
            }
        }
    }

    private static int findKthElement(int[] arrOne, int[] arrTwo, int k) {
        if(arrOne[arrOne.length - 1] <= arrTwo [0]) return arrTwo[k];
        if(arrTwo[arrTwo.length - 1] <= arrOne [0]) return arrOne[k];
        int i = 0;
        while(i != k) {
            while(i < arrOne.length && arrOne[i] < arrTwo[i]){
                i++;
            }
            while(i < arrTwo.length && arrTwo[i] < arrOne[i]){
                i++;
            }
        }
        return (Math.min(arrOne[i], arrTwo[i]));
    }
}
