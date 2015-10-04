package com.hamster.wheel.game.of.life;

/**
 * Created by Jason on 6/21/2015.
 */
public class GameOfLife {
    public String[] live(String[] dish) {
        String[] newDish = dish.clone();
        for(int y = 0; y < dish.length; y++){
            for(int x = 0; x < dish[y].length(); x++){
                if(isCellAlive(y, x, dish)){
                    int neighbors = getNeighbors(dish, y, x);
                    if(neighbors < 2 || neighbors > 3) {
                        newDish = toggleCell(y, x, newDish);
                    }
                }
                else{
                    int neighbors = getNeighbors(dish, y, x);
                    if(neighbors == 3) {
                        newDish = toggleCell(y, x, newDish);
                    }
                }
            }
        }
        return newDish;
    }

    private int getNeighbors(String[] dish, int y, int x) {
        int neighbors = getHorizontalNeighbors(y, x, dish);
        neighbors += getVerticalNeighbors(y, x, dish);
        neighbors += getDiagonalNeighbors(y, x, dish);
        return neighbors;
    }

    private int getDiagonalNeighbors(int y, int x, String[] dish) {
        int neighbors = getHorizontalNeighbors(y, x, dish);
        if(y != 0){
            String topRow = dish[y-1];
            if(x !=0){
                char c = topRow.charAt(x - 1);
                if(c == '*'){
                    neighbors++;
                }
            }
            if(x != dish[y].length()-1){
                char c = topRow.charAt(x + 1);
                if(c == '*'){
                    neighbors++;
                }
            }
        }
        if(y != dish.length-1){
            String bottomRow = dish[y+1];
            if(x !=0){
                char c = bottomRow.charAt(x - 1);
                if(c == '*'){
                    neighbors++;
                }
            }
            if(x != dish[y].length()-1){
                char c = bottomRow.charAt(x + 1);
                if(c == '*'){
                    neighbors++;
                }
            }
        }
        return neighbors;
    }

    private boolean isCellAlive(int y, int x, String[] newDish) {
        return newDish[y].charAt(x) == '*';
    }

    private String[] toggleCell(int y, int x, String[] dish) {
        String row = dish[y];
        char[] chars = row.toCharArray();
        if(chars[x] == '*')
            chars[x] = '_';
        else
            chars[x] = '*';
        row = String.valueOf(chars);
        dish[y] = row;
        return dish;
    }

    private int getHorizontalNeighbors(int y, int x, String[] dish) {
        int numOfNeighbors = 0;
        if(x != 0){//is onthe left edge of dish
            if(dish[y].charAt(x - 1) == '*'){
                numOfNeighbors++;
            }

        }
        if(x != dish[y].length()-1){
            if(dish[y].charAt(x+1) == '*'){
                numOfNeighbors++;
            }
        }
        return numOfNeighbors;
    }

    private int getVerticalNeighbors(int y, int x, String[] dish){
        int numOfNeighbors = 0;
        if(y != 0){
            if(dish[y-1].charAt(x) == '*'){
                numOfNeighbors++;
            }
        }if(y != dish.length - 1){
            if(dish[y+1].charAt(x) == '*'){
                numOfNeighbors++;
            }
        }
        return numOfNeighbors;
    }

    public void print(String[] dish) {
        for(String string: dish){
            System.out.println(string);
        }
    }

    public boolean isDead(String[] dish) {
        for(String row: dish){
            if(row.contains("*")){
                return false;
            }
        }
        return true;
    }
}
