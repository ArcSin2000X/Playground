package com.lkincremental;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.apache.log4j.Logger;

/*
    Interview questions for C# resource

    The interview should have a time limit on each question.


    Purpose of lock statement
    What is an object
    How you debug threads
    What is static class
    How can you create a static code constructor
    Are the method parameters passed by value or reference
    How can you make a read only class and how would you initialise the values
    Why is a singleton class
    In which case would you use the finally block of which could be part of the try-catch
    What is a difference between class field and property
    Difference between property and method
    When would you use an abstract class class and when interface
    What is a mutable object
    How can you update ui object through a different thread
    What is a delegate

    SQL
    Join types
    Join predicate vs where predicate
    Cross apply with xml (query, nodes and value)
    Distinct top group by and having
    Difference between group by and partition by
    Data types (sting - varchar)

Dependency Injection
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
    }

    private static void TimerPlayground(){

        TimerTask timerTask = new MyTimerTask();

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
