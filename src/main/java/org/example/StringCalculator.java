package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    int add(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

//        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
//
//        if (m.find()) {
//            String customDelimeter = m.group(1);
//            String[] tokens = m.group(2).split(customDelimeter);
//        }


        return Integer.parseInt(text);
    }
}
