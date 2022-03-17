package com.github.mabutamail.javatemplate.actual.timerAndTimerTask;

import java.util.TimerTask;

public class Helper extends TimerTask {
    public static int i = 1;

    // TimerTask.run() method will be used to perform the action of the task
    public void run() {
        System.out.println("This is called " + i++ + " time");
    }
}