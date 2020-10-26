package com.github.mabutamail.javatemplate.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calc = new Calculator();

    @Test
    void add() {
        assertEquals(6, calc.add(4, 2));
    }

    @Test
    void div() {
        assertEquals(6, calc.div(12, 2));
    }

    @Test
    void minus() {
        assertEquals(5, calc.minus(7, 2));
    }

    @Test
    void divByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> calc.div(12, 0));
    }

    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }

//    @ParameterizedTest(name = "{0} + {1} = {2}")
//    @CsvSource({
//            "0,    1,   1",
//            "1,    2,   3",
//            "49,  51, 100",
//            "1,  100, 101"
//    })
    void add(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.add(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }


}

//        assertEquals(Object expecteds, Object actuals) — проверяет, равны ли передаваемые обьекты.
//        assertTrue(boolean flag) — проверяет, возвращает ли переданное значение — true.
//        assertFalse(boolean flag) — проверяет, возвращает ли переданное значение — false.
//        assertNull(Object object) – проверяет, является ли объект нулевым (null).
//        assertSame(Object firstObject, Object secondObject) — проверяет, ссылаются ли передаваемые значения на один и тот же обьект.
//        assertThat(T t, Matcher<T> matcher) — проверяет, удовлетворяет ли t условию, указанному в matcher.