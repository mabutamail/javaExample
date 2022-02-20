package com.github.mabutamail.javatemplate.core.alishevcore.innerClass;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AppStart {
    public static void main(String[] args) {
        log.info("Program start\n");
        ElectroCar electroCar = new ElectroCar(22);
        electroCar.start();
        ElectroCar.Battery battery = new ElectroCar.Battery();
        battery.charge();
    }
}