package com.hamster.wheel.coding;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jason on 4/23/2016.
 */
public class CoveringPrefix3Test {


    private CoveringPrefix3 cp = new CoveringPrefix3();

    @Test
    public void testBaseCase(){
        int[] base = {2,2,1,0,1};
        long solution = cp.solution(base);
        assertEquals(solution, 3);
    }

    @Test
    public void testBaseCase87(){
        int[] base = {0,1};
        long solution = cp.solution(base);
        assertEquals(solution, 1);
    }

    @Test
    public void testBaseCase847(){
        int[] base = {0};
        long solution = cp.solution(base);
        assertEquals(solution, 0);
    }

    @Test
    public void testCaseAllSame(){
        int[] base = {2,2,2,2,2,2,2,2,2,2,2,2};
        long solution = cp.solution(base);
        assertEquals(solution, 0);
    }

    @Test
    public void testCaseAllSame2(){
        int[] base = {2,1,2,2,2,2,2,2,2,2,2,1};
        long solution = cp.solution(base);
        assertEquals(solution, 1);
    }

    @Test
    public void testCaseAllSame3(){
        int[] base = {2,2,2,2,2,2,2,2,2,1,2,1};
        long solution = cp.solution(base);
        assertEquals(solution, 9);
    }

}
