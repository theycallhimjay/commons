package com.hamster.wheel.coding;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jason on 4/24/2016.
 */
public class SameWordTest {

    public SameWord1 sw = new SameWord1();

    @Test
    public void testCase(){
        assertTrue(sw.solution("A2le", "2pl1"));
    }

    @Test
    public void testCase1(){
        assertTrue(sw.solution("A2Le", "2pL1"));
    }

    @Test
    public void testCase2(){
        assertTrue(sw.solution("a10", "10a"));
    }

    @Test
    public void testCase3(){
        assertFalse(sw.solution("ba1", "1Ad"));
    }

    @Test
    public void testCase4(){
        assertFalse(sw.solution("3x2x", "8"));
    }

    @Test
    public void testCase5(){
        assertTrue(sw.solution("", ""));
    }
}
