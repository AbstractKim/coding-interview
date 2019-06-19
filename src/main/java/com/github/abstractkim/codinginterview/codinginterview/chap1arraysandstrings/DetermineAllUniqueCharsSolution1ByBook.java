package com.github.abstractkim.codinginterview.codinginterview.chap1arraysandstrings;

public class DetermineAllUniqueCharsSolution1ByBook implements DetermineAllUniqueChars {
    /**
     * @param str : we assume the input's set is ASCII whose number is 128
     * @return BOOLEAN
     */
    private static int NUMBER_OF_ASCII = 128;
    @Override
    public Boolean isUniqueChars(String str) {
        final int length = str.length();
        if(length > NUMBER_OF_ASCII)
            return Boolean.FALSE;
        //COMPLETE: checking the state of initialization on debug mode
        int[] numbersOfEachChar = new int[NUMBER_OF_ASCII];
        for(int i = 0; i < length; i++){
            char character = str.charAt(i);
            numbersOfEachChar[character] = numbersOfEachChar[character] + 1;
            if(numbersOfEachChar[character] > 1)
                return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
