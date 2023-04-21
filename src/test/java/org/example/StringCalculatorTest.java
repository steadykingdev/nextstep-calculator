package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class StringCalculatorTest {
    private StringCalculator cal;

    @BeforeEach
    public void setup() {
        cal = new StringCalculator();
    }

    @Test
    public void add_null_or_empty() {
        assertThat(cal.add(null)).isEqualTo(0);
        assertThat(cal.add("")).isEqualTo(0);
    }

    @Test
    public void add_return_one_number() {
        assertThat(cal.add("1")).isEqualTo(1);
    }

    @Test
    public void add_comma_separator() {
        assertThat(cal.add("1,2")).isEqualTo(3);
    }

}