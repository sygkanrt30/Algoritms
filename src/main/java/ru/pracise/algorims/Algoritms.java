package ru.pracise.algorims;

import java.util.ArrayList;

public class Algoritms {
    /**
     * This method searches for an element{@code item} in a sorted array{@code arr}.
     * O(log n) - run time
     *
     * @param arr  sort array of element
     * @param item the element to be found
     * @return indexOfElement
     */
    public static int binarySearch(int[] arr, int item) {
        int low = 0;
        int high = arr.length - 1;
        int mid, guess;
        while (low <= high) {
            mid = (low + high) / 2;
            guess = arr[mid];
            if (guess == item) {
                return mid;
            } else if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }

    /**
     * This method searches min element in an array{@code arr}.
     * O(n) - run time
     *
     * @param arr unsorted array of element
     * @return indexOfMinElement
     */
    public static int findMinElement(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    /**
     * This method sort array{@code arr}.
     * O(n^2) - run time
     *
     * @param arr unsorted array of element
     * @return sorted array
     */
    public static int[] selectionSort(int[] arr) {
        int[] newArr = new int[arr.length];
        int[] copiedArr = arr.clone();
        int min;
        for (int i = 0; i < copiedArr.length; i++) {
            min = findMinElement(copiedArr);
            newArr[i] = copiedArr[min];
            copiedArr[min] = Integer.MAX_VALUE;
        }
        return newArr;
    }

    /**
     * This method find factorial for number{@code n}
     *
     * @param n any number >= 0
     * @return n! - factorial of number
     */
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * @param arr array of int numbers
     * @return sum of array element
     */
    public static int sum(ArrayList<Integer> arr) {
        int sum = 0;
        if (arr.size() == 1) {
            return arr.get(0);
        }
        return arr.remove(0) + sum(arr);
    }

}

