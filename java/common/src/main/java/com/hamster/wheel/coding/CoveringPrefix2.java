package com.hamster.wheel.coding;

import java.util.Arrays;

/**
 * Created by jason on 4/23/2016.
 */
public class CoveringPrefix2 {
    public int solution(int[] ints){
        if(ints.length == 1){
            return 1;
        }
        for(int i=0; i<ints.length; i++){
            int[] subArray = Arrays.copyOfRange(ints, 0, i+1);
            if(containsAll(subArray, ints)){
                return i;
            }
        }
        return 0;
    }

    private boolean containsAll(int[] a, int[] b){
        for(int i = 0; i<b.length; i++){
            if(!contains(a, b[i])){
                return false;
            }
        }
        return true;
    }

    private boolean contains(int[]a, int b){
        for(int i = 0; i< a.length; i++){
            if (b==a[i]){
                return true;
            }
        }
        return false;
    }
}
