package com.jubayir;

public class ForEach {

    public static void main(String[] args) {
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            for (int p : arr) {
                System.out.println("Output: " + p);
            }
        }
    }

}
