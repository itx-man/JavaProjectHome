package com.example;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 11041730 on 2017/6/24.
 */

public class TestCachedThreadPool {
    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newCachedThreadPool();
        //ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++){
            executorService.execute(new TestRunnable());
            System.out.println("******** a" + i + "********");
        }
        executorService.shutdown();
    }
}

class TestRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Thread has been called.");
    }
}