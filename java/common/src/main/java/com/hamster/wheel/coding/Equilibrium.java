package com.hamster.wheel.coding;

import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

/**
 * Created by jason on 4/23/2016.
 */
public class Equilibrium {

    public long solution(int ints[]){
        if(ints.length == 0){
            return -1;
        }
        else{
            for(int i=0; i<ints.length; i++){
                long leftSum = getSum(copyOfRange(ints, 0, i));
                long rightSum = getSum(copyOfRange(ints, i+1, ints.length));
                if(leftSum == rightSum){
                    return i;
                }
            }
        }
        return -1;
    }

    private long getSum(int ints[]){
        long sum = 0;
        for(int i=0; i< ints.length; i++){
            sum += ints[i];
        }
        return sum;
    }

}
