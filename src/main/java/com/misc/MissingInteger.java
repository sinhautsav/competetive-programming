package com.misc;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any):
 * Difficulty Level: Easy
 * Status: Done
 * Description: Given an array of unsorted integers in a given range, find the missing integer.
 * For ex: in {3,6,2,1,7,4} => 5 is the missing integer.
 * Created On : 15/09/19
 */
public class MissingInteger {
    private int[] arr;
    private int diff;

    public MissingInteger(int low, int high) {

        Random r = new Random();
        OptionalInt rr = r.ints(low+1, high).findFirst();
        int missing;
        if(rr.isPresent())
            missing = rr.getAsInt();
        else
            missing = high-low;
        System.out.println("The missing number is ["+missing+"]. Let's see if it can be found out.");

        IntStream stream = IntStream.range(low, high+1);
        this.arr = new int[(high - low)];
        AtomicInteger index = new AtomicInteger(0);
        stream.parallel().forEach(key-> { if(key != missing) arr[index.getAndIncrement()] = key;});
    }

    private long findWithoutSorting() {
        long now = System.currentTimeMillis();
        int min, max;
        long sum = 0;
        if(arr.length <= 1) System.out.println("Does not make sense.");
        min = arr[0];
        max = min;
        sum = sum + arr[0];
        for(int i = 1; i < arr.length; i++) {
            int arrayOfI = arr[i];
            sum = sum + arrayOfI;
            if (arrayOfI >= max) max = arrayOfI;
            if (arrayOfI < min) min = arrayOfI;
        }

        long total = (long) (arr.length+1) * (max + min) / 2;
        this.diff = (int) (System.currentTimeMillis() - now);
        return total - sum;
    }

    private int findWithSorting() {
        long now = System.currentTimeMillis();
        int missing = 0;
        if(arr.length <= 1) System.out.println("Does not make sense.");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i+1] - arr[i] > 1) {
                missing = arr[i] + 1;
                break;
            }
        }
        this.diff = (int) (System.currentTimeMillis() - now);
        return missing;
    }

    public static void main(String[] args) {
        MissingInteger mi;
        try(Scanner s = new Scanner(System.in)) {
            int low = s.nextInt();
            int high = s.nextInt();
            mi = new MissingInteger(low, high);
        }
        System.out.println("Time taken to find ["+mi.findWithoutSorting()+"] is ["+mi.diff+"] ms, without sorting.");
        System.out.println("Time taken to find ["+mi.findWithSorting()+"] is ["+mi.diff+"] ms, after sorting.");
    }
}
