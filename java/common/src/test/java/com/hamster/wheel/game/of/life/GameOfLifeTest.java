package com.hamster.wheel.game.of.life;

import com.hamster.wheel.game.of.life.GameOfLife;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Jason on 6/21/2015.
 */
public class GameOfLifeTest {

    private GameOfLife gof = null;

    @Before
    public void setUp(){
        gof = new GameOfLife();
    }

    @Test
    public void testEmptyDish() {
        String[] dish = {"___",
                         "___",
                         "___"};

        String[] after = gof.live(dish);
        assertEquals(dish, after);
    }

    @Test
    public void testDishWithOneLivingCell(){
        String[] dish = {"*__",
                        "___",
                        "___"};

        String[] expected = {"___",
                            "___",
                            "___"};

        String[] actual = gof.live(dish);
        assertEquals(expected, actual);
    }

    @Test
    public void testDishWithCellWithOneNeighborSameRow(){
        String[] dish = {"**_",
                        "___",
                        "___"};

        String[] expected = {"___",
                            "___",
                            "___"};

        String[] actual = gof.live(dish);
        assertEquals(expected, actual);
    }

    @Test
    public void testDishWithCellWithOneNeighborDifferentRow(){
        String[] dish = {"*__",
                        "*__",
                        "___"};

        String[] expected = {"___",
                            "___",
                            "___"};

        String[] actual = gof.live(dish);
        assertEquals(expected, actual);
    }

    @Test
    public void testDishWithCellWithTwoNeighborsSameRow(){
        String[] dish = {"***",
                        "___",
                        "___"};

        String[] expected = {"_*_",
                            "___",
                            "___"};

        String[] actual = gof.live(dish);
        assertEquals(expected, actual);
    }

    @Test
    public void testDishWithCellWithTwoNeighborsDifferentRows(){
        String[] dish = {"_*_",
                        "_*_",
                        "_*_"};

        String[] expected = {"___",
                            "_*_",
                            "___"};

        String[] actual = gof.live(dish);
        assertEquals(expected, actual);
    }

    @Test
    public void testDishWithCellWithTreeNeighbors(){
        String[] dish = {"_*_",
                        "**_",
                        "_*_"};

        String[] expected = {"___",
                            "_*_",
                            "___"};

        String[] actual = gof.live(dish);
        assertEquals(expected, actual);
    }

    @Test
    public void testDishWithCellWithFourNeighbors(){
        String[] dish = {"_*_",
                        "***",
                        "_*_"};

        String[] expected = {"___",
                            "___",
                            "___"};

        String[] actual = gof.live(dish);
        assertEquals(expected, actual);
    }

    @Test
    public void testDishWithDeadCellWithThreeLiveNeighbors(){
        String[] dish = {"_*_",
                        "*__",
                        "_*_"};

        String[] expected = {"___",
                            "_*_",
                            "___"};

        String[] actual = gof.live(dish);
        assertEquals(expected, actual);
    }

    @Test
    public void testDishWithThreeLiveNeighborsDiagonal(){
        String[] dish = {"*__",
                        "_*_",
                        "*_*"};

        String[] expected = {"___",
                            "_*_",
                            "___"};

        String[] actual = gof.live(dish);
        assertEquals(expected, actual);
    }
}
