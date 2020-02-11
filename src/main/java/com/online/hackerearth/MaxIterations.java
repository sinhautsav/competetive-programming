package com.online.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class MaxIterations {
    public static void main(String args[] ) throws Exception {

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String name = br.readLine();                // Reading input from STDIN
        System.out.println(countIterations("BAONXXOLL"));

    }

    public static int countIterations(String s){
        Map<String, Boolean> str = new HashMap<>();
        str.put("B", false); str.put("A", false); str.put("L", false); str.put("O", false); str.put("N", false);
        Integer count = null;
        char[] arr = s.toCharArray();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(String.valueOf(arr[i]))){
                map.put(String.valueOf(arr[i]), map.get(String.valueOf(arr[i]))+1);
            } else{
                map.put(String.valueOf(arr[i]), 1);
            }
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            String character = entry.getKey();
            switch(character) {
                case "B":
                case "A":
                case "N":
                    str.put(character, true);
                    count = count == null ? entry.getValue() : Math.min(count, entry.getValue());
                    break;
                case "L":
                case "O":
                    if(entry.getValue() > 1) str.put(character, true);
                    count = count == null ? entry.getValue() / 2 : Math.min(count, entry.getValue() / 2);
                    break;
            }
        }

        for(Boolean b : str.values()) {
            if(!b) return 0;
        }
        return count == null ? 0 : count;
    }
}
