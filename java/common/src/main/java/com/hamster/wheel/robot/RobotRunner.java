package com.hamster.wheel.robot;

import com.hamster.wheel.robot.util.*;

/**
 * Created by Jason on 9/30/2015.
 */
public class RobotRunner {

    public static void main(String[] args) {
        Robot robot = new RobotImpl(new MazeA().getMaze());
        robot.findEnd();
    }
}
