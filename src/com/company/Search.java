package com.company;

public class Search {
    public int linearSearch(int[] array, int target) {
        for (var i = 0; i < array.length; i++) {
            if (array[i] == target)
                return i;
        }
        return -1;
    }

    public int binarySearchRec(int[] array, int target) {
        return binarySearchRec(array, target, 0, array.length - 1);
    }

    private int binarySearchRec(int[] array, int target, int left, int right) {
        if (left >= right)
            return -1;

        int middle = (left + right) / 2;
        if (array[middle] == target) {
            return middle;
        }
        if (target > array[middle]) {
            binarySearchRec(array, target, middle, array.length - 1);
        }
        return binarySearchRec(array, target, left, middle - 1);
    }

    private int binarySearchIte(int[] array, int target) {
        var start = 0;
        var end = array.length-1;
        while (start <= end){
            var middle = (start + end) /2;
            if(array[middle] == target)
                return middle;
            if(array[middle] < target){
                start = middle + 1;
            }
            else {
                end = middle -1;
            }
        }
        return -1;
    }
}
