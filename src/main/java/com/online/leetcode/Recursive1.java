package com.online.leetcode;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any): LeetCode
 * Difficulty Level: Easy
 * Status:
 * Description: Practise Problems
 * Created On : 13/5/19
 */
public class Recursive1 {
    public static void main(String[] args) {
        String name = "utsav";
        printStringInReverseRecursively(name);
        System.out.println();
        reverseArrayRecursively(name.toCharArray());
        System.out.println();
        printStringInReverseIteratively(name);
    }

    private static void reverseArrayRecursively(char[] toCharArray) {
        arrayRecursive(toCharArray, toCharArray.length);
    }

    private static void arrayRecursive(char[] arr, int index) {
        char c = arr[index - 1];
        System.out.println(c);
    }


    //Iterative
    static void printStringInReverseIteratively(String name) {
        for(int i = name.length() - 1; i >= 0; i--)
            System.out.print(name.charAt(i));
    }

    //Recursive
    static void printStringInReverseRecursively(String name) {
        goRecursive(name, name.length());
    }

    private static void goRecursive(String name, int index) {
        index = index -1;
        if (index != 0) {
            System.out.print(name.charAt(index));
            goRecursive(name, index);
        } else
            System.out.print(name.charAt(index));
    }
}
