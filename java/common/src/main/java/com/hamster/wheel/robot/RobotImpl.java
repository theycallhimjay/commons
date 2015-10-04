package com.hamster.wheel.robot;

import com.hamster.wheel.robot.Robot;
import com.hamster.wheel.robot.util.BaseRobot;

/**
 * Created by Jason on 9/30/2015.
 */
public class RobotImpl extends BaseRobot implements Robot {

    public RobotImpl(String[] maze) {
        super(maze);
    }

    @Override
    public void findEnd() {
        while(!isEnd()){
            if (!move()){
                rotate();
                if(!move()){
                    rotate();
                    rotate();
                }
            }
        }
    }
}
