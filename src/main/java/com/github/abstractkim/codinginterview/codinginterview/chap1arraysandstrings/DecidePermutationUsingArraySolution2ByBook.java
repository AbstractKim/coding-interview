package com.github.abstractkim.codinginterview.codinginterview.chap1arraysandstrings;

public class DecidePermutationUsingArraySolution2ByBook implements DecidePermutation {
    private static final int NUMBER_OF_ASCII_SET = 128;

    @Override
    public Boolean isPermutationEachOther(String str1, String str2) {
        if(!isValid(str1, str2))
            return Boolean.FALSE;
        ///
        //If we consider upper case and space, we need to add transforming logic
        ///

        //two arrays vs one arrays

        int[] staateofChars = new int[NUMBER_OF_ASCII_SET];

        int length = str1.length();

        for(int i = 0; i < length ; i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            staateofChars[ch1] += 1;
            staateofChars[ch2] -= 1;
        }

        for(int i = 0; i < NUMBER_OF_ASCII_SET; i++){
            if(staateofChars[i] != 0)
                return Boolean.FALSE;
        }

//        int[] numberOfCharsForStr1 = new int[NUMBER_OF_ASCII_SET];
//        int[] numberOfCharsForStr2 = new int[NUMBER_OF_ASCII_SET];
//
//        int lenth = str1.length();
//har ch1 = str1.charAt(i);
////            char ch2 = str2.charAt(i);
//        for(int i = 0 ; i < lenth ; i++){
//            c
//            numberOfCharsForStr1[ch1] += 1;
//            numberOfCharsForStr2[ch2] += 1;
//        }
//
//        for(int i = 0 ; i < NUMBER_OF_ASCII_SET ; i++){
//            if(numberOfCharsForStr1[i] != numberOfCharsForStr2[i])
//                return Boolean.FALSE;
//        }

        return Boolean.TRUE;
    }
}
