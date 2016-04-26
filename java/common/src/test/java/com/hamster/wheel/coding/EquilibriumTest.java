package com.hamster.wheel.coding;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jason on 4/23/2016.
 */
public class EquilibriumTest {

    private Equilibrium eq = new Equilibrium();

    @Test
    public void testEmptyArray(){
        int[] empty = new int[0];
        long solution = eq.solution(empty);
        assertEquals(solution, -1);
    }


    @Test
    public void testEquiSmall(){
        int[] small = {0,0};
        long solution = eq.solution(small);
        assertEquals(solution, 0);
    }

    @Test
    public void testBaseCase(){
        int[] base = {-1, 3, -4, 5, 1, -6, 2, 1};
        long solution = eq.solution(base);
        assertEquals(1, solution);
    }
}
