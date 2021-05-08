package com.refactoring;

public class Calculator {
    public static int sum(String str) {
        int result = 0;

        if(isBlank(str)) return 0;

        for(String num : stringToArray(str)) {
            if(!num.equals("")) {
                int numToInt = Integer.parseInt(num);
                result += numToInt;
            }
        }

        return result;
    }

    private static Boolean isBlank(String str) {
        return str.equals("") || str.equals(",");
    }

    private static String[] stringToArray(String str) {
        str = str.replaceAll(" ", "");
        return str.split(",");
    }
}
