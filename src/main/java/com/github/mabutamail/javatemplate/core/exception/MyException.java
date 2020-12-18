package com.github.mabutamail.javatemplate.core.exception;

//  создаем собственный тип ошибок
public class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
}
