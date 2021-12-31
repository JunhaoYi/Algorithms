package com.company;

public class MergeSort {
    public void sort(int[] array) {
        if (array.length < 2) {
            return;
        }
        //Divide array into half
        var middleIndex = array.length / 2;
        var left = new int[middleIndex];
        for (var i = 0; i < middleIndex; i++) {
            left[i] = array[i];
        }

        var right = new int[array.length - middleIndex];
        for (var i = middleIndex; i < array.length; i++) {
            right[i - middleIndex] = array[i];
        }

        //Sort each half
        sort(left);
        sort(right);
        //Merge the result
        merge(left, right, array);
    }

    public void merge(int[] left, int[] right, int[] result) {
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                result[resultIndex] = left[leftIndex];
                resultIndex++;
                leftIndex++;
            } else {
                result[resultIndex] = right[rightIndex];
                resultIndex++;
                rightIndex++;
            }
        }
        while (leftIndex < left.length) {
            result[resultIndex++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            result[resultIndex++] = right[rightIndex++];
        }
    }
}
