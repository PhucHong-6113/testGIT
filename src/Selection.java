/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Selection {

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void selectionSort(int a[], int n) {
        int i, j, k;
        int min;
        for (i = 0; i < n - 1; i++) {
            min = a[i];
            k = i;
            for (j = i + 1; j < n; j++) {
                if (a[j] < min) {
                    k = j;
                    min = a[j];
                }
            }
            if (k != i) {
                swap(a, i, k);
            }
        }
    }

    public static void insertSort(int a[], int n) {
        int i, j, x;
        for (i = 1; i < n; i++) {
            x = a[i];
            j = i;
            while (j > 0 && x < a[j - 1]) {
                a[j] = a[j - 1];
                j--;
            };
            a[j] = x;
        }
    }

    public static void bubbleSort(int a[], int n) {
        int i;
        boolean swapped;
        do {
            swapped = false;
            for (i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 9, 6, 3};
        int n = a.length;

        printArray(a, n);
        System.out.println("\n");
        bubbleSort(a, n);
        printArray(a, n);

    }
}
