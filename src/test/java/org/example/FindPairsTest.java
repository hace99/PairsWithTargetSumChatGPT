package org.example;


import org.junit.Test;
import static org.junit.Assert.*;

public class FindPairsTest {

    @Test
    public void testFindPairs() {
        // Test case 1: Array with pairs that sum to the target
        int[] array1 = {1, 2, 3, 4, 5};
        int targetSum1 = 7;
        FindPairs.findPairs(array1, targetSum1);

        // Test case 2: Array with no pairs that sum to the target
        int[] array2 = {1, 2, 3, 4, 5};
        int targetSum2 = 10;
        FindPairs.findPairs(array2, targetSum2);

        // Test case 3: Empty array
        int[] array3 = {};
        int targetSum3 = 5;
        FindPairs.findPairs(array3, targetSum3);

        // Test case 4: Array with only one element
        int[] array4 = {6};
        int targetSum4 = 6;
        FindPairs.findPairs(array4, targetSum4);

        int[] array5 = {-1, -2, 3, 4, 5};
        int targetSum5 = 2;
        FindPairs.findPairs(array5, targetSum5);

        // Test case 6: Array with duplicate elements
        int[] array6 = {2, 3, 3, 4, 5};
        int targetSum6 = 6;
        FindPairs.findPairs(array6, targetSum6);

        // Test case 7: Array with pairs at the beginning and end
        int[] array7 = {2, 3, 4, 5, 6, 7};
        int targetSum7 = 9;
        FindPairs.findPairs(array7, targetSum7);
    }

    @Test
    public void testMultiplePairs() {
        // Test case: Array with multiple pairs that sum to the target
        int[] array = {3, 4, 2, 7, 1, 5, 6, 8};
        int targetSum = 10;
        FindPairs.findPairs(array, targetSum);
        // This should print (3, 7) and (4, 6)
    }

    @Test
    public void testRepeatedNumbers() {
        // Test case: Array with repeated numbers that sum to the target
        int[] array = {2, 3, 4, 3, 5, 6, 4};
        int targetSum = 8;
        FindPairs.findPairs(array, targetSum);
        // This should print (4, 4) and (3, 5)
    }

    @Test
    public void testNegativeNumbers() {
        // Test case: Array with negative numbers that sum to the target
        int[] array = {2, -3, 4, -7, 1, 5, -6, 8};
        int targetSum = -1;
        FindPairs.findPairs(array, targetSum);
        // This should print (2, -3) and (-7, 6)
    }
}
