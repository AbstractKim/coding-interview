package com.github.abstractkim.codinginterview.codinginterview.chap1arraysandstrings;

import java.util.Arrays;

public class DecidePermutationUsingSortSSolution1ByBook implements DecidePermutation {
    @Override
    public Boolean isPermutationEachOther(String str1, String str2) {
        if(!isValid(str1, str2))
            return Boolean.FALSE;

        final char[] chars1 = str1.toCharArray();
        final char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        final String sortedStr1 = String.copyValueOf(chars1);
        final String sortedStr2 = String.copyValueOf(chars2);

        return sortedStr1.equals(sortedStr2) ? Boolean.TRUE : Boolean.FALSE;
    }
}
