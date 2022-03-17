package com.github.mabutamail.javatemplate.actual.timerAndTimerTask;

import lombok.extern.slf4j.Slf4j;

import java.util.Timer;
import java.util.TimerTask;

@Slf4j
public class Countdown {
    public static void main(String[] args) {
//        JFrame jframe = new JFrame();
//        JLabel jLabel = new JLabel();
//        jframe.setLayout(new FlowLayout());
//        jframe.setBounds(500, 300, 400, 100);
//
//        jframe.add(jLabel);
//        jframe.setVisible(true);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 5;
            public void run() {
//                jLabel.setText("Time left: " + i);
                log.info("ща кааак... " + i--);

                if (i < 0) {
                    timer.cancel();
//                    jLabel.setText("Time Over");
                    log.info("БУМ!!!");
                }
            }
        }, 1000, 500);
    }
}