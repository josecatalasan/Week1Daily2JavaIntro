package com.example.week1daily2_javaintro;

public class multiplicationTable {
    public static void printTables(){
        int tableSize = 10;
        int[][] multiplicationTable = new int[tableSize][tableSize];
        for(int i = 1; i <= tableSize; i++){
            for(int j = 1; j <= tableSize; j++){
                multiplicationTable[i-1][j-1] = i*j;
                System.out.print("" + multiplicationTable[i-1][j-1] + " " );
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printTables();
    }
}
