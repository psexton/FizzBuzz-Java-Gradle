/*
 * FizzBuzz.java, part of the FizzBuzz-Java-Gradle project
 * Created on Oct 1, 2015, 7:47:08 PM
 */
package net.psexton.fizzbuzz;

/**
 * FizzBuzz class.
 * @author PSexton
 */
public class FizzBuzz {
    
    /**
     * Computes the FizzBuzz value for a single integer.
     * If value is a multiple of 3, return "Fizz"
     * If value is a multiple of 5, return "Buzz"
     * If value is a multiple of 3 and 5, return "FizzBuzz"
     * Otherwise, return value#toString
     * @param value Integer value
     * @return String result of FizzBuzz
     */
    public static String single(Integer value) {
        if(value % 15 == 0) { // 3 and 5
            return "FizzBuzz";
        }
        else if(value % 3 == 0) { // 3 only
            return "Fizz";
        }
        else if(value % 5 == 0) { // 5 only
            return "Buzz";
        }
        else { // Neither 3 nor 5
            return value.toString();
        }
    }
}
