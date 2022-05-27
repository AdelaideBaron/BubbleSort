package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    @DisplayName("check that I can run a test")
    void simpleTest(){
      //  assertEquals(true, 5==5);
       Assertions.assertEquals(1,1);
    }

    @Test
    @DisplayName("Check that an array of integer is output")
    void checkAnArrayOutputs(){
        int[] expected = {1,2,3,4};
        int[] actual = {1,2,3,4};
        App.bubbleSort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Check that the array of integer is sorted into ascending order")
    void checkAnArrayOutputsAscending(){
        int[] expected = {2, 3, 4, 6};
        int[] actual = {6,2,3,4};
        App.bubbleSort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Check that negative numbers are sorted")
    void checkAnArraySortsNegativeNumbers(){
        int[] expected = {-6, -3, 2, 4};
        int[] actual = {-6,2,-3,4};
        App.bubbleSort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }






}
