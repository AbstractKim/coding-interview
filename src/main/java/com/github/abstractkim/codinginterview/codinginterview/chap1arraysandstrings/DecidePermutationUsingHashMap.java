package com.github.abstractkim.codinginterview.codinginterview.chap1arraysandstrings;

import java.util.HashMap;
import java.util.Map;

public class DecidePermutationUsingHashMap implements DecidePermutation {
    @Override
    public Boolean isPermutationEachOther(String str1, String str2) {
        if(str1 == null || str2 == null || (str1.length() != str2.length()))
            return Boolean.FALSE;

        int lengh = str1.length();
        HashMap<Character, Integer> charCountHashMapforStr1 = new HashMap<>();
        HashMap<Character, Integer> charCountHashMapforStr2 = new HashMap<>();
        for(int i = 0; i < lengh; i++){
            final Character c1 = str1.charAt(i);
            final Character c2 = str2.charAt(i);

            charCountHashMapforStr1.put(c1, (charCountHashMapforStr1.get(c1) == null) ? 1 : charCountHashMapforStr1.get(c1) + 1);
            charCountHashMapforStr2.put(c2, (charCountHashMapforStr2.get(c2) == null) ? 1 : charCountHashMapforStr2.get(c2) + 1);
        }

        for(Map.Entry<Character, Integer> entry: charCountHashMapforStr1.entrySet()){
            final Character key1 = entry.getKey();
            final Integer integer1 = entry.getValue();
            final Integer integer2 = charCountHashMapforStr2.get(key1);
            if(integer2 == null)
                return Boolean.FALSE;
            if(!integer1.equals(integer2))
                return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }
}
