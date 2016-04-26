package com.hamster.wheel.coding;

import org.junit.Test;

/**
 * Created by jason on 4/23/2016.
 */
public class IntersectingDisksTests {

    IntersectingDisks id = new IntersectingDisks();

    @Test
    public void test(){
        int[] array = {1,5,2,1,4,0};

        id.solution(array);
    }
}
