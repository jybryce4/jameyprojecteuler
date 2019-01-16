/*
 * Project Euler Problem 2 
 * @ http://projecteuler.net/problem=2
 * 
 * This program finds the sum of the even-valued
 * Fibonacci numbers under four million
 * 
 * Solution by Jamey Bryce
 */

package com.brycejamey.problem2;

public class EvenFibo {

    public static void main(String[] args) {
        final int FOUR_MIL = 4000000;

        int num1;
        int num2;
        int fibNum = 0;

        int sum = 0; // will hold the answer
        while (fibNum < FOUR_MIL) {
            num1 = fibNum;
            num2 = num1 + 1;
            fibNum = num1 + num2;

            if (fibNum % 2 == 0) {
                sum += fibNum;
            }
        }

        System.out.println(sum);

    }

}