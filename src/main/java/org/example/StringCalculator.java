package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    int add(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] values = text.split(",");

        return sum(values);
    }

    private int sum(String[] values) {
        int sum = 0;

        for (String value : values) {
            sum += Integer.parseInt(value);
        }

        return sum;
    }
}
