package com.github.mabutamail.javatemplate.actual.timerAndTimerTask;

import java.util.Timer;
import java.util.TimerTask;

public class AppStart {
    public static void main(String[] args) {
        Timer timer = new Timer();
        // Helper class extends TimerTask
        TimerTask task = new Helper();
        TimerTask task1 = new MapCleaner();
        /*
         *  Schedule() method calls for timer class.
         *  void schedule(TimerTask task, Date firstTime, long period)
         */

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("===========METHOD 2 RUN============");
            }
        }, 2 * 1000, 500);

        timer.schedule(task, 60 * 60 * 1000, 15 * 1000);    //  запуск через(мс), повторять через(мс)
        timer.schedule(task1, 0, 5 * 1000);
    }
}