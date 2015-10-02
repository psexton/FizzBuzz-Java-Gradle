/*
 * FizzBuzzTest.java, part of the FizzBuzz-Java-Gradle project
 * Created on Oct 1, 2015, 7:54:01 PM
 * GN ReSound Research Group
 */
package net.psexton.fizzbuzz;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PSexton
 */
public class FizzBuzzTest {
    
    public FizzBuzzTest() {
    }

    /**
     * Test when value is a multiple of 3.
     * Should return "Fizz".
     */
    @Test
    public void multipleOf3() {
        Integer value = 3;
        String expResult = "Fizz";
        String result = FizzBuzz.single(value);
        assertThat(result, is(expResult));
    }
    
    /**
     * Test when value is a multiple of 5.
     * Should return "Fizz".
     */
    @Test
    public void multipleOf5() {
        Integer value = 5;
        String expResult = "Buzz";
        String result = FizzBuzz.single(value);
        assertThat(result, is(expResult));
    }
    
    /**
     * Test when value is a multiple of 3.
     * Should return "Fizz".
     */
    @Test
    public void multipleOf3And5() {
        Integer value = 15;
        String expResult = "FizzBuzz";
        String result = FizzBuzz.single(value);
        assertThat(result, is(expResult));
    }
    
    /**
     * Test when value is a multiple of 3.
     * Should return "Fizz".
     */
    @Test
    public void notAMultiple() {
        Integer value = 7;
        String expResult = "7";
        String result = FizzBuzz.single(value);
        assertThat(result, is(expResult));
    }
}
