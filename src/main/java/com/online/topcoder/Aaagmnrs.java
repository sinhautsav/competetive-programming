package com.online.topcoder;

import java.util.Arrays;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any): TopCoder
 * Difficulty Level:
 * Status:
 * Description:
 * Created On : 7/16/18
 */
public class Aaagmnrs {

    public String[] anagrams(String[] phrases){
        int count = 0;
        for (int i = 0; i < phrases.length; i++) {
            String sorted = sort(phrases[i]);
            for (int j = i+1; j < phrases.length; j++) {
                String check = sort(phrases[j]);
                if(check.equals("")) continue;
                if(sorted.equals(check)) {
                    phrases[j] = "";
                    count++;
                }
            }
        }
        String[] newPhrases = new String[phrases.length - count];
        int k = 0;
        for(String str : phrases){
            if(!"".equals(str)) newPhrases[k++] =str;
        }
        return newPhrases;
    }

    private static String sort(String str) {
        if(str.equals("")) return str;
        char[] array = str.toLowerCase().toCharArray();
        Arrays.sort(array);
        return String.valueOf(array).trim();
    }
}
