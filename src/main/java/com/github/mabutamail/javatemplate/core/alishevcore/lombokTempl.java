package com.github.mabutamail.javatemplate.core.alishevcore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class lombokTempl {
    public static void main(String[] args) {
        log.info("Program start");
//        Dog dog = new Dog();
//        Dog dog1 = Dog.builder()
////                .name("Gosha")
//                .age(10)
//                .build();
//        log.info(dog + " " );
    }
}

@EqualsAndHashCode(callSuper = true)
@Data
//@AllArgsConstructor
//@NoArgsConstructor
@SuperBuilder
class Dog extends Animal {

}

//@Data
//@AllArgsConstructor
@NoArgsConstructor
//@Builder
@SuperBuilder
abstract class Animal {
    String name;
    int age;
}