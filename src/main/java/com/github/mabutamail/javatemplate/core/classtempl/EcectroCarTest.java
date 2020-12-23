package com.github.mabutamail.javatemplate.core.classtempl;

public class EcectroCarTest {
    public static void main(String[] args) {
        ElectroCar electroCar = new ElectroCar(1);
        electroCar.start();

        ElectroCar.Battery battery = new ElectroCar.Battery();
    }
}