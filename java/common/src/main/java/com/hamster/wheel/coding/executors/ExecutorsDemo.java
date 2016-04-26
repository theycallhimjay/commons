package com.hamster.wheel.coding.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<Future> futures = new ArrayList<Future>();
        for(int i =0; i< 10; i++){
            futures.add(executor.submit(new CountRunnable(100)));
        }
        boolean stillRunning = true;
        while(stillRunning){
            stillRunning = false;
            for(Future future: futures){
                if(future.get()!=null){
                    stillRunning = true;
                }
            }
        }
        System.exit(0);
    }
}
