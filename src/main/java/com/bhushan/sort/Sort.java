package com.bhushan.sort;

public interface Sort {
    void sort(int[] ar);
    
    default void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
