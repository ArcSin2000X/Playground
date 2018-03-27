package com.lkincremental;

import java.util.Random;

public class DummyPublisher {

    private static int executionCounter;

    private static DummyPublisher ourInstance = new DummyPublisher();

    public static DummyPublisher getInstance() {
        return ourInstance;
    }

    private DummyPublisher() {
    }

    public void operation()
    {
        try {
            //assuming it takes 0.2 secs to complete the task
            Thread.sleep(1000 + getRandomTimeToWaste( 750 ));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private int getRandomTimeToWaste(int timeToWaste){
        return new Random().nextInt(timeToWaste) + 1;
    }
}
