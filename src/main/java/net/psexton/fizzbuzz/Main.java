/*
 * Main.java, part of the FizzBuzz-Java-Gradle project
 * Created on Oct 1, 2015, 6:48:56 PM
 */

package net.psexton.fizzbuzz;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            System.out.println(FizzBuzz.single(i));
        }
    }
}
