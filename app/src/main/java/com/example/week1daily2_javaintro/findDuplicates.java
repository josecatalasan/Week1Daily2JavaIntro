package com.example.week1daily2_javaintro;

import java.util.*;

public class findDuplicates {

    public static void findDuplicatesCheck(List<String> strings){
        List<String> listCopy = new ArrayList<String>(strings);

        for(String s : strings){
            listCopy.remove(s); //removes 1 instance of s from listCopy
            if(listCopy.contains(s)){ //checks if there is another instance of s
                System.out.println(s); //print duplicate
                while(listCopy.contains(s)){ //remove all duplicate instances in listCopy
                    listCopy.remove(s);
                }
            }
        }

    }

    public static void main(String[] args) {
        List<String> testList = new ArrayList<String>();
        testList.add("cat");
        testList.add("dog");
        testList.add("parrot");
        testList.add("cat");
        testList.add("cat");
        testList.add("dog");
        testList.add("shark"); //unique
        testList.add("kappa"); //unique
        testList.add("parrot");
        testList.add("cat");
        testList.add("java"); //unique

        findDuplicatesCheck(testList); //should print cat, dog, parrot

    }
}
