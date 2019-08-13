package com.example.week1daily2_javaintro;

public class palindromeCheck {

    public static boolean checkPalindrome(String word) {
        int wordLength = word.length() - 1;
         for(int i = 0; i < wordLength / 2; i++){
             if(word.charAt(i) == word.charAt(wordLength-i)) { }
             else {
                 return false;
             }
         }

         return true;

    }

    public static void main(String[] args) {
        String palindrome = "level";
        String notPalindrome = "pastasauce";
        String palindrome2 = "abcdefgfedcba";

        System.out.println(palindrome + ": " + checkPalindrome(palindrome));
        System.out.println(notPalindrome + ": " + checkPalindrome(notPalindrome));
        System.out.println(palindrome2 + ": " + checkPalindrome(palindrome2));
    }
}
