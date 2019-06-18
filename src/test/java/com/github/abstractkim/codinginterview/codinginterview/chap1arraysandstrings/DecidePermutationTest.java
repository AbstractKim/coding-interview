package com.github.abstractkim.codinginterview.codinginterview.chap1arraysandstrings;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class DecidePermutationTest {
    HashMap<PairOfString, Boolean> isTestingMap = new HashMap<>();
    class PairOfString{
        public PairOfString(String str1, String str2) {
            this.str1 = str1;
            this.str2 = str2;
        }

        String str1;
        String str2;
    }
    @Before
    public void preStep(){
        isTestingMap.put(new PairOfString("hello", "olleh"), Boolean.TRUE);
        isTestingMap.put(new PairOfString("olleh", "ooleh"), Boolean.FALSE);
        isTestingMap.put(new PairOfString("aabb", "baab"), Boolean.TRUE);
        isTestingMap.put(new PairOfString("12344", "44321"), Boolean.TRUE);
        isTestingMap.put(new PairOfString("12344", "1234"), Boolean.FALSE);
    }

    @Test
    public void isPermutationEachOther(){

        DecidePermutation decidePermutation = new DecidePermutationUsingHashMap();

        for(Map.Entry<PairOfString, Boolean> entry: isTestingMap.entrySet()){
            final PairOfString key = entry.getKey();
            final Boolean value = entry.getValue();
            final Boolean permutationEachOther = decidePermutation.isPermutationEachOther(key.str1, key.str2);
            assertThat(permutationEachOther).isEqualTo(value);
        }

        final Boolean permutationEachOther = decidePermutation.isPermutationEachOther("hello", "olleh");
        assertThat(permutationEachOther).isTrue();
    }

}