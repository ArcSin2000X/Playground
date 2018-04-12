package com.lkincremental.perf;

import java.util.Date;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

    private DummyPublisher dm;

    public MyTimerTask(DummyPublisher dm) {
        this.dm = dm;
    }

    @Override
    public void run() {
        System.out.println("Timer task started at:"+new Date());
//        completeTask();
        dm.operation();
        System.out.println("Timer task finished at:"+new Date());
    }

}
