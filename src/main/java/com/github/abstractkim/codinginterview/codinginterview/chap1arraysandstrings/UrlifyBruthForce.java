package com.github.abstractkim.codinginterview.codinginterview.chap1arraysandstrings;

public class UrlifyBruthForce implements Urlify{
    /***
     *
     * Time complexity = O(nm) [n: size of input, m: size of space'
     * Space complexity = O(n) + 0(n+m)  => 2 * O(n)
     */
    @Override
    public String transfrom(String str, int length) {
        char[] outChars = new char[length + (getSpaceCount(str, length) * 2)];
        final char[] inputChars = str.toCharArray();
        String filling = "%20";
        int indexOfOutChar = 0;
        for(int i = 0 ; i < length; i++){
            char ch = inputChars[i];
            if(ch == ' '){
                for(int j = 0 ; j < 3; j++){
                    outChars[indexOfOutChar++] = filling.charAt(j);
                }
            }else{
                outChars[indexOfOutChar] = ch;
                indexOfOutChar++;
            }

        }
        return new String(outChars);
    }

    static int getSpaceCount(String str, int length) {
        int strlength  =  (str.length() > length) ? length : str.length();
        int countOfSpace = 0;
        for(int i=0; i< strlength ; i++){
            char ch = str.charAt(i);
            if(ch == ' ')
                countOfSpace++;
        }
        return countOfSpace;
    }
}
