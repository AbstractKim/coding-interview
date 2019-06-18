package com.github.abstractkim.codinginterview.codinginterview.chap1arraysandstrings;

import java.util.HashMap;

public class DetermineAllUniqueCharsUsingHashMap implements  DetermineAllUniqueChars{
    //if suppose that collision is zero, O(n)
    @Override
    public Boolean isUniqueChars(String str) {
        HashMap<Character, Object> checkingDuplicatedMap = new HashMap<>();
        for(int i = 0; i < str.length() ; i++){
            Character ch = str.charAt(i);
            if(checkingDuplicatedMap.get(ch) != null) // duplicated => False
                return Boolean.FALSE;
            else
                checkingDuplicatedMap.put(ch, new Object());
        }
        return Boolean.TRUE;
    }
}
