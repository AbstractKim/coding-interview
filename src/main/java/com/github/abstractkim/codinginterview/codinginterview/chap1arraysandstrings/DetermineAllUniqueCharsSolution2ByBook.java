package com.github.abstractkim.codinginterview.codinginterview.chap1arraysandstrings;

public class DetermineAllUniqueCharsSolution2ByBook implements DetermineAllUniqueChars{
    /**
     *
     * @param str : we assume the input's set is ASCII and lower case alphabet
     * @return
     *
     * regex, shift operation, bit operation
     */
    final static private int NUMBER_OF_ASCII_LOWER_CASE = 32;
    @Override
    public Boolean isUniqueChars(String str) {
        //1.check constraints: 'only lowercase alphabet and length'
        int length = str.length();
        if(length > NUMBER_OF_ASCII_LOWER_CASE || !str.matches("[a-z]+"))
            return Boolean.FALSE;
        int flagOfEachAsciiForLowerCase = 0;
        for(int i =0 ; i < length; i++){
            final int movedOffset = 1 << (str.charAt(i) - 'a');
            int oneBitFlag = flagOfEachAsciiForLowerCase & movedOffset;
            if(oneBitFlag > 0)
                return Boolean.FALSE;
            flagOfEachAsciiForLowerCase = flagOfEachAsciiForLowerCase | movedOffset;
        }

        return Boolean.TRUE;
    }
}
