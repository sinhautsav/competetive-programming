package com.online.geeksforgeeks.mustdo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any):
 * Difficulty Level:
 * Status:
 * Description:
 * Created On : 10/01/20
 */
public class StacksAndQueues {
    public static void main(String[] args) throws IOException {
        nextLargerElement();
    }

    private static void parenthesisCheck() throws IOException {
        Map<Character, Character> oppMap = new HashMap<>();
        oppMap.put('[', ']');
        oppMap.put('{', '}');
        oppMap.put('(', ')');
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            {
                int tc = Integer.parseInt(reader.readLine());
                while (tc != 0) {
                    String input = reader.readLine();
                    char[] arr = input.toCharArray();
                    Stack<Character> stack = new Stack<>();
                    for (Character value : arr) {
                        if (stack.empty()) stack.push(value);
                        else {
                            if (value == oppMap.get(stack.peek())) stack.pop();
                            else stack.push(value);
                        }
                    }
                    if (stack.empty()) System.out.println("balanced");
                    else System.out.println("not balanced");
                    tc--;
                }
            }
        }
    }

    private static void nextLargerElement() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int tc = Integer.parseInt(reader.readLine());
            while (tc > 0) {
                //taking input
                int size = Integer.parseInt(reader.readLine());
                String input = reader.readLine();
                String[] array = input.split(" ");
                int[] arr = new int[size];
                for (int i = 0; i < size; i++) {
                    arr[i] = Integer.parseInt(array[i]);
                }

                //solution
                Stack<Integer> stack = new Stack<>();
                Stack<Integer> output = new Stack<>();
                stack.push(arr[arr.length - 1]);
                output.push(-1);
                for (int i = arr.length - 2; i >= 0; i--) {
                    int top = stack.peek();
                    int curr = arr[i];
                    if (curr <= top) {
                        output.push(top);
                        stack.push(curr);
                    } else {
                        stack.pop();
                        while (!stack.empty() && curr > (top = stack.peek())) stack.pop();
                        if (stack.empty()) output.push(-1);
                        else output.push(top);
                        stack.push(curr);
                    }
                }
                while (!output.empty())
                    System.out.print(output.pop() + " ");
                System.out.println();
                tc--;
            }
        }
    }

    static void solve() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int tc = Integer.parseInt(reader.readLine());
            while (tc > 0) {
                int k = Integer.parseInt(reader.readLine());
                String A = reader.readLine();
                String B = reader.readLine();
                int n = A.length(), m = B.length();
                int count = 0, i, j;
                for (i = 0; i < n; i++) {
                    for (j = 0; j < m; j++) {
                        if (i + j >= n)
                            break;
                        else if (A.charAt(i + j) != B.charAt(j))
                            break;
                    }
                    if (j == m) count++;
                }
                if(count == 0) System.out.println(-1);
                else System.out.println((count - k));
                tc--;
            }
        }
    }
}
