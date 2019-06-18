package com.github.abstractkim.codinginterview.codinginterview.chap1arraysandstrings;

public class DetermineAllUniqueCharsBruthForce implements DetermineAllUniqueChars {
    // O(n^2)
    public  Boolean isUniqueChars(String str) {
        int length = str.length();
        for(int i=0; i < length; i++){
            for(int j= i + 1; j <length ; j++){
                if ( str.charAt(i) == str.charAt(j))
                    return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
