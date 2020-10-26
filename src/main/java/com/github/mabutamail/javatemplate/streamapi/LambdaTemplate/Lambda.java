package com.github.mabutamail.javatemplate.streamapi.LambdaTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lambda {
    public static void main(String[] args) {

//        Predicate <Boolean> b = x -> {
//            x % 13 == 0;
//        }

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//        list.add(1);
        System.out.println(list.toString());


        int sum = list.stream()
                .map(x -> x * x)
                .reduce((x, y) -> x + y).get();
        System.out.println(sum);


        list.stream()
                .map((x) -> x * x)
                .forEach(System.out::println);


        System.out.print("Выводит все числа: ");
        evaluate(list, (n) -> true);

        System.out.print("Не выводит ни одного числа: ");
        evaluate(list, (n) -> false);

        System.out.print("Вывод четных чисел: ");
        evaluate(list, (n) -> n % 2 == 0);

        System.out.print("Вывод нечетных чисел: ");
        evaluate(list, (n) -> n % 2 == 1);

        System.out.print("Вывод чисел больше 5: ");
        evaluate(list, (n) -> n > 5);


        list.forEach(n -> System.out.print(n));
        // Новый способ с использованием ссылки на метод ::
        list.forEach(System.out::print);


        // вызов метода doSomeWork через анонимный класс
        // (классический способ)
//        execute(new SomeFunctionalInterface() {
//            @Override
//            public void doSomeWork() {
//                System.out.println("\nWorker вызван через анонимный класс");
//            }
//        });

        // вызов метода doSomeWork через Lambda-выражения
        // (нововведение Java 8)
        execute(() -> System.out.println("Worker вызван через Lambda"));


        Consumer<Integer> c = (Integer x) -> System.out.println(x);
        BiConsumer<Integer, String> b = (Integer x, String y) -> System.out.println(x + " : " + y);
        Predicate<String> p = (String s) -> s == null;
        Runnable r = () -> System.out.println("hello world");
        Callable<Integer> c1 = () -> 42;
//        a -> return a*a


        System.out.println("Stream " + Stream.of(1, 2, 3).count());
        System.out.println("Stream \n" + c + "\n" + b + "\n" + p + "\n" + r);

//        List<LocalTime> localTime = new ArrayList<>();
//        localTime.add(LocalTime.of(10, 0));
//        localTime.add(LocalTime.of(11, 0));
//        localTime.add(LocalTime.of(12, 0));
//        localTime.add(LocalTime.of(13, 0));
//        localTime.add(LocalTime.of(14, 0));
//
//        List<LocalTime> stream = localTime
//                .stream()
//                .filter(localTime1 -> localTime1.isAfter(startTime) && localTime1.isBefore(endTime))
////                .map(n -> n * n)
////                .sorted((o1, o2) -> -o1.compareTo(o2))
////                .limit(2)
//                .collect(toList());
//        System.out.println(localTime);
//        System.out.println(stream);
    }

    public static void execute(SomeFunctionalInterface worker) {
        worker.doSomeWork();
    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n : list) {
            if (predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

}