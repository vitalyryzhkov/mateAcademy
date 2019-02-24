package lesson01;

import java.util.Arrays;
import java.util.Random;

public class Task1_5 {
    public static void main(String[] args) {
        int[] arr = fillArray(1_000_000);
        long startSort = System.currentTimeMillis();
//        bubbleSort(arr);
//        insertionSort(arr);
//        selectionSort(arr);
//        quickSort(arr);
//        mergeSort(arr);
        long finishSort = System.currentTimeMillis() - startSort;
        System.out.println(Arrays.toString(arr));
        System.out.println(finishSort);

    }

    private static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int j = 0; j < len; j++) {
            for (int i = 1; i < len - j; i++) {
                if (arr[i] < arr[i - 1]) {
                    int tmp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    int old = arr[i];
                    arr[i] = arr[j];
                    arr[j] = old;
                    i--;
                }
            }
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    private static void quickSort(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        sort(arr, first, last);
    }

    private static void sort(int[] arr, int first, int last) {
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


    private static void mergeSort(int[] arr) {
        mergesort(arr, 0, arr.length - 1);
    }

    private static void mergesort(int[] arr, int low, int high) {
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

    private static int[] fillArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = new Random().nextInt(1000);
        }
        return arr;
    }
}
