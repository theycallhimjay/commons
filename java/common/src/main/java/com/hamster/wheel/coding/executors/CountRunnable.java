package com.hamster.wheel.coding.executors;

/**
 * Created by jason on 4/26/2016.
 */
public class CountRunnable implements Runnable {
    private int count;

    public CountRunnable(int i) {
        this.count = i;
    }

    @Override
    public void run() {
        System.out.println("New Thread!!!");
        int i =0 ;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");
//        while(i<count){
//            System.out.println("Counting: " + i);
//            i++;
//        }
    }
}
