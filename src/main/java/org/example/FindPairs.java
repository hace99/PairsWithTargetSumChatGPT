package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindPairs {

    public static void findPairs(int[] array, int targetSum) {
        if (array == null || array.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int complement = targetSum - array[i];

            if (map.containsKey(complement)) {
                System.out.println("Pair found: (" + array[i] + ", " + complement + ")");
            }

            map.put(array[i], i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int targetSum = scanner.nextInt();

        findPairs(array, targetSum);

        scanner.close();
    }
}
