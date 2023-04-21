package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class CalculatorTest {
    private Calculator cal;

    @BeforeEach
    public void setup() {
        cal = new Calculator();
    }

    @Test
    public void add() {
        assertThat(cal.add(6, 3)).isEqualTo(9);
    }

    @Test
    public void subtract() {
        assertThat(cal.subtract(6, 3)).isEqualTo(3);
    }

    @Test
    public void multiply() {
        assertThat(cal.multiply(6, 3)).isEqualTo(18);
    }

    @Test
    public void divide() {
        assertThat(cal.divide(6, 3)).isEqualTo(2);
    }
}