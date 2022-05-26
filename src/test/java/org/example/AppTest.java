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
    @DisplayName("check that I can output an array of integers")
    void checkICanInputAnArray(){
        Assertions.assertEquals(1, App.main(1); //cannot perfect the test
    }

    @Test
    @DisplayName("Check that I can input an array of integers into the method")

    @Test
    @DisplayName("Check that I can sort... ")
}
