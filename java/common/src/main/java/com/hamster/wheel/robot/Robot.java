package com.hamster.wheel.robot;

/**
 * Created by Jason on 9/30/2015.
 */
public interface Robot {
    void rotate();
    boolean isEnd();
    boolean move();
    void findEnd();
}