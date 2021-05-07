package com.refactoring;

public class Calculator {
    public static int sum(String str) {
        int result = 0;

        if(str.equals("") || str.equals(",")) {
            return 0;
        } else {
            str = str.replaceAll(" ", "");
            String[] numbers = str.split(",");
            for(String num : numbers) {
                if(!num.equals("")) {
                    int numToInt = Integer.parseInt(num);
                    result += numToInt;
                }
            }
        }

        return result;
    }
}
