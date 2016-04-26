package com.hamster.wheel.coding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by jason on 4/23/2016.
 */
public class CoveringPrefix3 {

    public int solution(int[] ints){
        List<Integer> intsList = IntStream.of(ints).boxed().collect(Collectors.toList());
        Set<Integer> covered = new HashSet<Integer>();
        int coveringIndex = 0;
        for(int i=0; i<intsList.size(); i++){
            if(!covered.contains(intsList.get(i))){
                covered.add(intsList.get(i));
                coveringIndex = i;
            }
        }
        return coveringIndex;
    }
}
