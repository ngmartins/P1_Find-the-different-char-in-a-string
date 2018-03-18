package com.o_meu_cao_comeu_o_TPC.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;

import static com.o_meu_cao_comeu_o_TPC.app.FindTheDiffChar.findDifCharInTwoStrings1;
import static com.o_meu_cao_comeu_o_TPC.app.FindTheDiffChar.findDifCharInTwoStrings2;

/**
 * Unit test for simple App.
 */
public class FindTheDiffCharTest
    extends TestCase
{

    private static final ArrayList <String[]> testSamples = new ArrayList <String[]>();

    private void buildTestSample(){

        testSamples.add(new String[] {"a","","A"} );
        testSamples.add(new String[] {"qwerty","aqwerty","a"});
        testSamples.add(new String[] {"qwerty","qwertyy","y"});
        testSamples.add(new String[] {"qwwerty","qwerty","w"});
        testSamples.add(new String[] {"a","aa","a"} );
        testSamples.add(new String[] {"","","@"} );
        //testSamples.add(new String[] {"","",""} );
        //testSamples.add(new String[] {"","",""} );
        //testSamples.add(new String[] {"","",""} );
        //testSamples.add(new String[] {"","",""} );
        //testSamples.add(new String[] {"","",""} );
        //testSamples.add(new String[] {"","",""} );


    }


    public void testFindDifCharInTwoStrings1(){

        buildTestSample();
        char charDiff;

        for (String[] sample : testSamples){
            charDiff = findDifCharInTwoStrings1(sample[0],sample[1]);
            assertEquals(sample[2].toUpperCase().charAt(0),charDiff);
        }

        }

    public void testFindDifCharInTwoStrings2(){

        buildTestSample();
        char charDiff;

        for (String[] sample : testSamples){
            charDiff = findDifCharInTwoStrings2(sample[0],sample[1]);
            assertEquals(sample[2].toUpperCase().charAt(0),charDiff);
        }

    }


}
