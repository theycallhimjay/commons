package com.hamster.wheel.robot.util;

import com.hamster.wheel.robot.Robot;

/**
 * Created by Jason on 9/29/2015.
 */
public abstract class BaseRobot implements Robot {

    private int step = 0;
    private static final int maxSteps = 1000;
    protected int x;
    protected int y;
    private DIRECTION direction;
    private String[] maze;

    private enum DIRECTION{
        UP, DOWN, LEFT, RIGHT;
    }

    public BaseRobot(){
        throw new RuntimeException("Do not call no argument constructor on BaseRobot Class!!");
    }

    public BaseRobot(String[] maze){
        this.direction = DIRECTION.UP;
        this.setMaze(maze);
    }

    public abstract void findEnd();

    public void rotate(){
        validateSteps();
        switch (this.direction) {
            case UP:
                this.direction = DIRECTION.RIGHT;
                break;
            case DOWN:
                this.direction = DIRECTION.LEFT;
                break;
            case LEFT:
                this.direction = DIRECTION.UP;
                break;
            case RIGHT:
                this.direction = DIRECTION.DOWN;
                break;
        }
        printStep("Rotate");
    }

    private void validateSteps(){
        step++;
        if(step > maxSteps)
            throw new RuntimeException("You have Exceeded the maximum number of steps, Try Again...");
    }


    public boolean move(){
        validateSteps();
        if(getFacingChar()=='*' || getFacingChar()=='E'){
            updatePosition();
            return true;
        }else {
            printStep("Move");
            return false;
        }
    }

    public boolean isEnd(){
        validateSteps();
        boolean isEnd = getCharAt(x, y) == 'E';
        if(isEnd){
            System.out.println("SUCCESS!!!");
        }
        printStep("isEnd");
        return isEnd;
    }

    private void updatePosition() {
        switch (this.direction) {
            case UP:
                if(y>0){
                    y--;
                }
                break;
            case DOWN:
                if(y == maze.length-1){
                    break;
                }else{
                    y++;
                }
                break;
            case LEFT:
                if(x == 0){
                    break;
                }else{
                    x--;
                }
                break;
            case RIGHT:
                if(x == maze[y].length()-1){
                    break;
                }else{
                    x++;
                }
                break;
        }
        printStep("Move");
    }

    private Character getFacingChar(){
        Character retVal = null;
        switch (this.direction) {
            case UP:
                if(y>0){
                    retVal = maze[y-1].charAt(x);
                }else retVal = ' ';
                break;
            case DOWN:
                if(y == maze.length-1){
                    retVal = ' ';
                }else{
                    retVal = getCharAt(x, y+1);
                }
                break;
            case LEFT:
                if(x == 0){
                    retVal = ' ';
                }else{
                    retVal = getCharAt(x-1, y);
                }
                break;
            case RIGHT:
                if(x == maze[y].length()-1){
                    retVal = ' ';
                }else{
                    retVal = getCharAt(x+1, y);
                }
                break;
        }
        return retVal;
    }






    public void printMap(){
        for(int y = 0; y < maze.length; y++){
            String row = "";
            for(int x = 0; x < maze[y].length(); x++){
                if(isAtPosition(x, y)){
                    row+=printRobot();
                }else{
                    row += maze[y].charAt(x);
                }
            }
            System.out.println(row);
        }
    }

    private void setMaze(String[] maze){
        this.maze  = maze;
        for(int y = 0; y < maze.length; y++){
            for(int x = 0; x < maze[y].length(); x++){
                if(getCharAt(x, y)==('S')){
                    this.x = x;
                    this.y = y;
                }
            }
        }
    }

    private boolean isAtPosition(int x, int y) {
        return this.x == x && this.y==y;
    }

    private Character getCharAt(int x, int y) {
        return maze[y].charAt(x);
    }

    private Character printRobot(){
        Character retVal = null;
        switch (this.direction) {
            case UP:
                retVal = '^';
                break;
            case DOWN:
                retVal =  'v';
                break;
            case LEFT:
                retVal =  '<';
                break;
            case RIGHT:
                retVal =  '>';
                break;
        }
        return retVal;
    }

    private void printStep(String operation) {
        System.out.println("Step: " + step + "    " + operation);
        printMap();
        System.out.println();
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

}
