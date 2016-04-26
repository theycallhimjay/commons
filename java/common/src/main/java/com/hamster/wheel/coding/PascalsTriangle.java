package com.hamster.wheel.coding;

import java.util.Scanner;

/**
 * Created by jason on 4/26/2016.
 */
class PascalTriangle {

    public static void print(int n) {
        int[] current = {1};
        int[] previous;
        printArray(current);
        previous = current;
        for(int i=2; i<=n; i++){
            current = new int[i];
            current[0] = 1;
            current[i-1] = 1;
            for(int j=0; j<=i-3; j++){
                current[j+1] = previous[j] + previous[j+1];
            }
            printArray(current);
            previous = current;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        doIt(4);
    }




    public static void doIt(int n){
        int[] current = {1};
        int[] previous;
        printArray(current);
        previous = current;
        for(int i = 2; i<=n; i++){
            current = new int[i];
            current[0] = 1;
            current[i-1] = 1;
            for(int j = 0; j<= i-3; j++){
                current[j+1] = previous[j+1] + previous[j];
            }
            printArray(current);
            previous = current;
        }
    }

}
