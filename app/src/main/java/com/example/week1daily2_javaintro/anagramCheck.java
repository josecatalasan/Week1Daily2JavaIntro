package com.example.week1daily2_javaintro;

import java.util.Arrays;

public class anagramCheck {

    public static boolean checkAnagrams(String word1, String word2){
        String tempstring1 = word1.toLowerCase();
        String tempstring2 = word2.toLowerCase();
        char []tempArray1 = tempstring1.toCharArray();
        char []tempArray2 = tempstring2.toCharArray();

        Arrays.sort(tempArray1);
        Arrays.sort(tempArray2);

        return Arrays.equals(tempArray1, tempArray2);
    }

    public static void main(String[] args) {

        System.out.println("" + checkAnagrams("TACO", "COAT"));
        System.out.println("" + checkAnagrams("JIST", "GIST"));
        System.out.println("" + checkAnagrams("water", "tearw"));
        System.out.println("" + checkAnagrams("rita", "Tira"));

    }
}
