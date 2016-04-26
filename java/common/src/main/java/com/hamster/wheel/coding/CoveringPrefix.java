package com.hamster.wheel.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by jason on 4/23/2016.
 */
public class CoveringPrefix {

    public int solution(int[] ints){
        List<Integer> intsList = IntStream.of(ints).boxed().collect(Collectors.toList());
        if(ints.length == 1){
            return 1;
        }
        for(int i=0; i<intsList.size(); i++){
            List subArray = intsList.subList(0, i+1);
            if(subArray.containsAll(intsList)){
                return i;
            }
        }
        return 0;
    }
}
