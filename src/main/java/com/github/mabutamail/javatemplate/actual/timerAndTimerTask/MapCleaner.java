package com.github.mabutamail.javatemplate.actual.timerAndTimerTask;

import java.util.TimerTask;

public class MapCleaner extends TimerTask {
    @Override
    public void run() {
        System.out.println("запуск метода очистки мапы ");
    }
}