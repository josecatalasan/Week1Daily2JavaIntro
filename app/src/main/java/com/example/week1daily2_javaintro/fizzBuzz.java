package com.example.week1daily2_javaintro;

public class fizzBuzz {
    public static void fizzBuzzCheck(int i){
        if(i % 3 == 0){
            System.out.print("fizz");
        }
        if(i % 5 == 0){
            System.out.print("buzz");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        for(int i = 0; i < 16; i++){
            System.out.print("" + i + ": ");
            fizzBuzzCheck(i);
        }
    }

}
