import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = Calculator.instance.get();

    @Test
    @DisplayName("Тест сложения")
    public void plus() {
        int x = 2;
        int y = 2;
        int expected = 4;
        int actual = calc.plus.apply(x, y);
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Тест вычитания")
    public void minus() {
        int x = 2;
        int y = 1;
        int expected = 1;
        int actual = calc.minus.apply(x, y);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Тест умножения")
    public void multiply() {
        int x = 2;
        int y = 2;
        int expected = 4;
        int actual = calc.multiply.apply(x, y);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Тест деления")
    public void devide() {
        int x = 2;
        int y = 2;
        int expected = 1;
        int actual = calc.devide.apply(x, y);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Тест деления на ноль")
    public void devideByZero() {
        int x = 2;
        int y = 0;
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.devide.apply(x, y));
    }

    @Test
    @DisplayName("Тест возведения в степень")
    public void pow() {
        int x = 2;
        int expected = 4;
        int actual = calc.pow.apply(x);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Тест возвращаемого модуля числа")
    public void abs() {
        int x = -4;
        int expected = 4;
        int actual = calc.abs.apply(x);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Тест на положительность числа")
    public void isPositive() {
        int x = 5;
        boolean actual = calc.isPositive.test(x);
        assertTrue(actual);
    }
}