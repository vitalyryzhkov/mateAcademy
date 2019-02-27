package lesson02.newsort;

import java.util.Arrays;
import java.util.Random;

public class SortUtil {
    public static void main(String[] args) {
        int[] arr = fillArray(1_00);
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }


    public static int[] mergeSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        mergesort(arr, 0, arr.length - 1);
        return arr;
    }

    public static void mergesort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergesort(arr, low, middle);
            mergesort(arr, middle + 1, high);
            int[] tempArr = new int[arr.length];

            for (int i = low; i <= high; i++) {
                tempArr[i] = arr[i];
            }

            int i = low;
            int j = middle + 1;
            int k = low;
            while (i <= middle && j <= high) {
                if (tempArr[i] <= tempArr[j]) {
                    arr[k] = tempArr[i];
                    i++;
                } else {
                    arr[k] = tempArr[j];
                    j++;
                }
                k++;
            }
            while (i <= middle) {
                arr[k] = tempArr[i];
                k++;
                i++;
            }
        }
    }

    public static int[] fillArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = new Random().nextInt(1000);
        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        int[] newArr = Arrays.copyOf(arr, arr.length);
        int len = newArr.length;
        for (int j = 0; j < len; j++) {
            for (int i = 1; i < len - j; i++) {
                if (newArr[i] < newArr[i - 1]) {
                    swap(newArr, i - 1, i);
                }
            }
        }
        return newArr;
    }

    public static int[] insertionSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                    i--;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
        return arr;
    }

    public static int[] quickSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        int first = 0;
        int last = arr.length - 1;
        sort(arr, first, last);
        return arr;
    }

    public static void sort(int[] arr, int first, int last) {
        int firstValue = first;
        int lastValue = last;
        int middle = arr[(first + last) / 2];

        do {
            while (arr[firstValue] < middle) {
                firstValue++;
            }

            while (arr[lastValue] > middle) {
                lastValue--;
            }

            if (firstValue <= lastValue) {
                int tmp = arr[firstValue];
                arr[firstValue] = arr[lastValue];
                arr[lastValue] = tmp;
                firstValue++;
                lastValue--;
            }
        } while (firstValue < lastValue);

        if (firstValue < last) {
            sort(arr, firstValue, last);
        }

        if (lastValue > first) {
            sort(arr, first, lastValue);
        }
    }

    private static void swap(int[] arr, int leftValue, int rightValue) {
        int tmp = arr[leftValue];
        arr[leftValue] = arr[rightValue];
        arr[rightValue] = tmp;
    }
}
