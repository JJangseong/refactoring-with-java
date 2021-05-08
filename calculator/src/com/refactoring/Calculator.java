package com.refactoring;

import java.util.Arrays;

public class Calculator {
    public static int sum(String str) {
        if(isBlank(str)) return 0;
        return sumByStringArray(stringToArray(str));
    }

    private static Boolean isBlank(String str) {
        return str.equals("") || str.equals(",");
    }

    private static String[] stringToArray(String str) {
        return removeBlank(str).split(",");
    }

    private static String removeBlank(String str) {
        return str.replaceAll(" ", "");
    }

    private static Integer sumByStringArray(String[] str) {
        return Arrays.stream(str)
                .filter(s -> !isBlank(s))
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
    }
}
