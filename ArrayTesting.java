/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytesting;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class ArrayTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String[] bestFriends = {"Mixalis", "Giorgos", "Giannis", "Stefanos"};        
//        printBestFriends(bestFriends);

//        int[] testIntegers = {1, 2, 4, 5, 3};
//        printSum(testIntegers);
//        printLowestNumber(testIntegers);
//        printHighestNumber(testIntegers);
//        printAverageValue(testIntegers);

    }

    public static void printBestFriends(String[] bestFriends) {
        
        System.out.println("The friends are:");
        
        for (String bestFriend : bestFriends) {
            System.out.println(bestFriend);
        }
    }

    public static void printSum(int[] intArray) {
        
        System.out.println("Input array is: "+ Arrays.toString(intArray));

        int sum = 0;
        for (int number : intArray) {
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }

    public static void printLowestNumber(int[] intArray) {

        int minValue = Integer.MAX_VALUE;

        for (int number : intArray) {
            if (number < minValue) {
                minValue = number;
            }
        }

        if (minValue < Integer.MAX_VALUE) {
            System.out.println("The smallest number is " + minValue);
        } else {
            System.out.println("All numbers have theprice " + Integer.MAX_VALUE);
        }
    }

    public static void printHighestNumber(int[] intArray) {

        int minValue = Integer.MIN_VALUE;

        for (int number : intArray) {
            if (number > minValue) {
                minValue = number;
            }
        }

        if (minValue > Integer.MIN_VALUE) {
            System.out.println("The highest number is " + minValue);
        } else {
            System.out.println("All numbers have theprice " + Integer.MIN_VALUE);
        }
    }

    public static void printAverageValue(int[] intArray) {
        int sum = 0;
        for (int number : intArray) {
            sum += number;
        }

        double averagePrice = sum / intArray.length;

        System.out.println("The average price is " + averagePrice);

    }
}
