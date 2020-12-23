package com.github.mabutamail.javatemplate.core.classtempl;


//  три типа вложенных (Inner) классов
public class ElectroCar {
    private int id;
    private static final int voltage = 220;

    //  нестатический вложенный класс
    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " is starting");
        }
    }

    //  статический вложенный класс не имеет доступа к полям
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging " + voltage);
        }
    }

    public ElectroCar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        final int x = 111;

        //  класс вложенный в метод
        class SomeClass {
            public void someMethod() {
                System.out.println(x + " " + voltage);
            }
        }

        System.out.println("ElectroCar " + id + " is starting...");
    }

}