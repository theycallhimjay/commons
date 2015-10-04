package com.hamster.wheel.robot;

import com.hamster.wheel.robot.util.BaseRobot;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by Jason on 9/29/2015.
 */
public class RobotTest{

    BaseRobot robot = null;


    @Test
    public void testPrintRobot(){


        String[] maze = {"*S***",
                         "*   *",
                         "*E***"};

        robot = new RobotImpl(maze);
    }

    @Test
    public void testRotate(){
        String[] maze = {"*S***",
                "*   *",
                "*E***"};

        robot = new RobotImpl(maze);
        robot.rotate();
        robot.rotate();
        robot.rotate();
        robot.rotate();
    }

    @Test
    public void testIsEnd(){
        String[] maze = {"*S***",
                "*   *",
                "*E***"};

        robot = new RobotImpl(maze);
        assertFalse(robot.isEnd());

        robot.setX(1);
        robot.setY(2);
        assertTrue(robot.isEnd());
    }
//
//    @Test
//    public void testFacingChar(){
//        String[] maze = {"oSt**",
//                "*4  *",
//                "*E***"};
//
//        robot = new BaseRobot(maze);
//        assertEquals(robot.getFacingChar(), new Character(' '));
//        robot.rotate();
//        assertEquals(robot.getFacingChar(), new Character('t'));
//        robot.rotate();
//        TestCase.assertEquals(robot.getFacingChar(), new Character('4'));
//        robot.rotate();
//        TestCase.assertEquals(robot.getFacingChar(), new Character('o'));
//    }
//
//    @Test
//         public void testFacingCharLeft(){
//        String[] maze = {"St**",
//                "4 *",
//                "*E**"};
//
//        robot = new BaseRobot(maze);
//        assertEquals(robot.getFacingChar(), new Character(' '));
//        robot.rotate();
//        assertEquals(robot.getFacingChar(), new Character('t'));
//        robot.rotate();
//        TestCase.assertEquals(robot.getFacingChar(), new Character('4'));
//        robot.rotate();
//        TestCase.assertEquals(robot.getFacingChar(), new Character(' '));
//    }
//
//    @Test
//    public void testFacingCharRigt(){
//        String[] maze = {"**dS",
//                "***r",
//                "*E**"};
//
//        robot = new BaseRobot(maze);
//        assertEquals(robot.getFacingChar(), new Character(' '));
//        robot.rotate();
//        assertEquals(robot.getFacingChar(), new Character(' '));
//        robot.rotate();
//        TestCase.assertEquals(robot.getFacingChar(), new Character('r'));
//        robot.rotate();
//        TestCase.assertEquals(robot.getFacingChar(), new Character('d'));
//    }
//
//    @Test
//    public void testFacingCharDown(){
//        String[] maze = {"**dE",
//                "*g*r",
//                "eSf*"};
//
//        robot = new BaseRobot(maze);
//        assertEquals(robot.getFacingChar(), new Character('g'));
//        robot.rotate();
//        assertEquals(robot.getFacingChar(), new Character('f'));
//        robot.rotate();
//        TestCase.assertEquals(robot.getFacingChar(), new Character(' '));
//        robot.rotate();
//        TestCase.assertEquals(robot.getFacingChar(), new Character('e'));
//    }
//
    @Test
    public void testMoveFailed(){


        String[] maze = {"*S***",
                "*   *",
                "*E***"};

        robot = new RobotImpl(maze);
        assertFalse(robot.move());
    }

    @Test
    public void testMoveRight(){


        String[] maze = {"*S***",
                "*   *",
                "*E***"};

        robot = new RobotImpl(maze);
        robot.rotate();
        assertTrue(robot.move());
    }

    @Test
    public void testMoveLeft(){


        String[] maze = {"*S***",
                "*   *",
                "*E***"};

        robot = new RobotImpl(maze);
        robot.rotate();
        robot.rotate();
        robot.rotate();
        assertTrue(robot.move());
    }

    @Test
    public void testMoveLeftFailed(){


        String[] maze = {"*S***",
                "*   *",
                "*E***"};

        robot = new RobotImpl(maze);
        robot.rotate();
        robot.rotate();
        robot.rotate();
        assertTrue(robot.move());
        assertFalse(robot.move());
    }

    @Test
    public void testMoveDownFailed(){


        String[] maze = {"*S***",
                "*   *",
                "*E***"};

        robot = new RobotImpl(maze);
        robot.rotate();
        robot.rotate();
        assertFalse(robot.move());
    }

    @Test
    public void testMoveRightFailed(){


        String[] maze = {"***S*",
                "*   *",
                "*E***"};

        robot = new RobotImpl(maze);
        robot.rotate();
        assertTrue(robot.move());

        assertFalse(robot.move());
    }
}
