package com.github.mabutamail.javatemplate.streamapi.LambdaTemplate;


@FunctionalInterface
public interface Converter<F, T> {
    T convert(F f);
}