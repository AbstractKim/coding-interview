package com.github.abstractkim.codinginterview.codinginterview.chap1arraysandstrings;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


public class DetermineAllUniqueCharsTest {
    HashMap<String, Boolean> isUniqueMap = new HashMap<>();
    @Before
    public void preStep(){
        isUniqueMap.put("hello", Boolean.FALSE);
        isUniqueMap.put("abcdef", Boolean.TRUE);
        isUniqueMap.put("ooabaskldfjaklsdjf", Boolean.FALSE);
        isUniqueMap.put("akjdflkasjdfkloo", Boolean.FALSE);
        isUniqueMap.put("abcdefghijklmnop", Boolean.TRUE);
        isUniqueMap.put("qwertyuiop", Boolean.TRUE);
        isUniqueMap.put("anna", Boolean.FALSE);
    }

    @Test
    public void isUniqueChars(){
//        final DetermineAllUniqueChars determineAllUniqueChars = new DetermineAllUniqueCharsBruthForce();
//        final DetermineAllUniqueChars determineAllUniqueChars = new DetermineAllUniqueCharsUsingHashMap();
//        final DetermineAllUniqueChars determineAllUniqueChars = new DetermineAllUniqueCharsSolution1ByBook();
        final DetermineAllUniqueChars determineAllUniqueChars = new DetermineAllUniqueCharsSolution2ByBook();
        for(Map.Entry<String, Boolean> entry: isUniqueMap.entrySet()){
            assertThat(determineAllUniqueChars.isUniqueChars(entry.getKey())).isEqualTo(entry.getValue());
        }
    }

    @Test
    public void test(){
        for(Map.Entry<String, Boolean> entry: isUniqueMap.entrySet()){
            System.out.println(entry.getKey().matches("[a-z]+"));
        }
    }

}