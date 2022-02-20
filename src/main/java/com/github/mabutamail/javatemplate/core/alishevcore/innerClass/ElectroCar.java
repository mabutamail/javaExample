package com.github.mabutamail.javatemplate.core.alishevcore.innerClass;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(makeFinal = false, level = AccessLevel.PRIVATE)
public class ElectroCar {
    int id;
    static int test = 444;

    //  вложенный нестатический класс
    private class Motor {
        public void startMotor() {
            log.info("Motor " + id + " is starting...");
        }
    }

    //  вложенный статический класс
    public static class Battery {
        public void charge() {
            log.info("Battery is charging... " + test);
        }
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        int x = 1;

        class SomeClass {
            public void someMethod() {
                log.info("someMethod " + x + " id " + id + " test " + test);
            }
        }
        SomeClass someClass = new SomeClass();
        someClass.someMethod();

        log.info("electrocar " + id + " is starting...");
    }
}