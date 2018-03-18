package com.o_meu_cao_comeu_o_TPC.app;

import static java.lang.Math.abs;

/**
 * Hello world!
 *
 */
class FindTheDiffChar
{
    private FindTheDiffChar(){}

    private static final String ALPHABET  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    static char findDifCharInTwoStrings1( String str1, String str2 )
    {
        int[] counter = new int [26]; //initialized on 0 by default
        char charDiff='@';

        //strings are equals
        if (str1.equals(str2))
            return charDiff;

        //strings differs in more than one char
        if (abs(str1.length() - str2.length())!= 1)
            return  charDiff;

        for (char c : str1.toUpperCase().toCharArray()){
            int index = ALPHABET.indexOf(c);
            counter[index]++;
        }

        for (char c : str2.toUpperCase().toCharArray()){
            int index = ALPHABET.indexOf(c);
            counter[index]++;
        }

        //look for an odd nbr on counter - it will represent the diff char
        for (int n=0 ; n < counter.length; n++){
            if(counter[n]%2 != 0)
                charDiff=ALPHABET.charAt(n);
        }

    return charDiff;
    }

    static char findDifCharInTwoStrings2( String str1, String str2 ) {

        char charDiff='@';

        //strings are equals
        if (str1.equals(str2))
            return charDiff;

        //strings differs in more than one char
        if (abs(str1.length() - str2.length())!= 1)
            return  charDiff;

        int len1=str1.length();
        int len2=str2.length();

        String strBigger;
        String strSmaller;

        if (len1>len2){
            strBigger=str1.toUpperCase();
            strSmaller=str2.toUpperCase();

        }else{
            strBigger=str2.toUpperCase();
            strSmaller=str1.toUpperCase();
        }

        for (int i=0; i<=strBigger.length()-1; i++){

            StringBuilder str = new StringBuilder(strBigger);
            str.deleteCharAt(i);

            if(strSmaller.equals(str.toString()))
                charDiff = new StringBuilder(strBigger).charAt(i);
        }


    return charDiff;
    }



}
