package lesson02.task2_3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = fillArray(1_00);
        System.out.println(Arrays.toString(quickSort(arr)));
    }


    private static int[] mergeSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        mergesort(arr, 0, arr.length - 1);
        return arr;
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

    private static int[] bubbleSort(int[] arr) {
        int[] newArr = Arrays.copyOf(arr, arr.length);
        int len = newArr.length;
        for (int j = 0; j < len; j++) {
            for (int i = 1; i < len - j; i++) {
                if (newArr[i] < newArr[i - 1]) {
                    int tmp = newArr[i - 1];
                    newArr[i - 1] = newArr[i];
                    newArr[i] = tmp;
                }
            }
        }
        return newArr;
    }

    private static int[] insertionSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);

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
        return arr;
    }

    private static int[] selectionSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
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
        return arr;
    }

    private static int[] quickSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        int first = 0;
        int last = arr.length - 1;
        sort(arr, first, last);
        return arr;
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
}
