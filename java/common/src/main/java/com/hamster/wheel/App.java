package com.hamster.wheel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        GameOfLife gol = new GameOfLife();
        String[] dish = {
                        "_______",
                        "__*____",
                        "___*___",
                        "_***___",
                        "_______",
                        "_______"
                        };
        while(!gol.isDead(dish)){
            gol.print(dish);
            dish = gol.live(dish);
            System.out.println("*************");
        }
    }
}
