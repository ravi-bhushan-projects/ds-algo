package com.bhushan.sort;

public class BubbleSort implements Sort {
    @Override
    public void sort(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length - i - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    swap(ar, j, j + 1);
                }
            }
        }
    }
}
