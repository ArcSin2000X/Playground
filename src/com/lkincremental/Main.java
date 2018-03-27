package com.lkincremental;

import java.util.Timer;
import java.util.TimerTask;

/*
*
*
*
*
*
*
*
* */

public class Main {
    public static void main(String[] args){
        System.out.println("Hello");

        TimerPlayground();

        TimerPlayground();
    }

    private static void TimerPlayground(){

        TimerTask timerTask = new MyTimerTask(DummyPublisher.getInstance());

        //running timer task as daemon thread
        Timer timer = new Timer(true);

        timer.scheduleAtFixedRate(timerTask,
                0, 1*1000);
        System.out.println("TimerTask started");
        //cancel after sometime
        try {
            Thread.sleep(12*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask cancelled");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
