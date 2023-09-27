package search;

import java.util.Arrays;

public class Search {
    int[] arr;

    Search(int[] arr) {
        this.arr = arr;
    }

    public int linear(int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) return i;
        }

        return -1;
    }

    public int binaryIterative(int item) {
        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        int left = 0;
        int right = sortedArr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (sortedArr[middle] == item) return middle;

            if (sortedArr[middle] < item) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    public int binaryRecursive(int item) {
        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        return binaryRecursiveHelper(sortedArr, item, 0, sortedArr.length - 1);
    }

    private int binaryRecursiveHelper(int[] arr, int item, int left, int right) {
        if (left > right) return -1;

        int middle = (left + right) / 2;
        if (arr[middle] == item) return middle;

        if (arr[middle] < item) {
            return binaryRecursiveHelper(arr, item, middle + 1, right);
        } else {
            return binaryRecursiveHelper(arr, item, left, middle - 1);
        }
    }

    public int ternaryRecursive(int item) {
        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        return ternaryRecursiveHelper(sortedArr, item, 0, sortedArr.length - 1);
    }

    private int ternaryRecursiveHelper(int[] arr, int item, int left, int right) {
        int partition = (right - left) / 3;
        int mid1 = left + partition;
        int mid2 = right - partition;

        if (left > right) return -1;

        if (arr[mid1] == item) return item;

        if (arr[mid2] == item) return item;

        if (arr[mid1] > item) {
            return ternaryRecursiveHelper(arr, item, left, mid1 - 1);
        }

        if (arr[mid2] < item) {
            return ternaryRecursiveHelper(arr, item, mid2 + 1, right);
        }

        return ternaryRecursiveHelper(arr, item, mid1 + 1, mid2 - 1);
    }


}
