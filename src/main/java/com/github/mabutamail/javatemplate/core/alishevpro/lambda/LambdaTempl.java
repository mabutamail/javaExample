package com.github.mabutamail.javatemplate.core.alishevpro.lambda;

import lombok.extern.slf4j.Slf4j;

interface Executable {
    int execute(int x, int y);
}

@Slf4j
class Runner {
    public void run(Executable e) {
        log.info("\treturn\t" + e.execute(10, 15));
//        log.info("==========Runner Executable==========\n" + e);
    }
}

@Slf4j
class ExecutableImpl implements Executable {
    @Override
    public int execute(int x, int y) {
        log.info("\tаргумент метода\t" + (x + y) + "\t1 способ: Создаём класс, имплементирующий интерфейс Executable с 1 методом");
        return 1;
    }
}

@Slf4j
public class LambdaTempl {
    public static void main(String[] args) {
        Runner runner = new Runner();
        // 1 способ
        runner.run(new ExecutableImpl());
        // 2 способ
        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                log.info("\tаргумент метода\t" + (x + y) + "\t2 способ: Создаём Анонимный класс");
                return 2;
            }
        });
        // 3 способ
//        runner.run(x -> x + 3);
        final int a = 0;
//        a = 99; //  Variable used in lambda expression should be final or effectively final
        //  у лямбд нет своей области видимости
        runner.run((x, y) -> {
            log.info("\tаргумент метода\t" + (x + y) + "\t3 способ: С помощью Lambda выражений");
            return 3;
        });

//        Thread thread = new Thread(() -> {
//            log.info("Hello");
//        });
//        thread.start();
    }
}