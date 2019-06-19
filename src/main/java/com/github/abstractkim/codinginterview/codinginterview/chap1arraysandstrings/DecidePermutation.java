package com.github.abstractkim.codinginterview.codinginterview.chap1arraysandstrings;

public interface DecidePermutation {
    public Boolean isPermutationEachOther(String str1, String str2);

    default Boolean isValid(String str1, String str2) {
        if(str1 == null || str2 == null || (str1.length() != str2.length()))
            return Boolean.FALSE;
        return Boolean.TRUE;
    }
}
