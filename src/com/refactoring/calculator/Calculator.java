package com.refactoring.calculator;

import java.util.Arrays;

/*
    요구사항

    String으로 된 문자열을 받아, 덧셈을 해서 결과값을 반환해주는 함수를 구현한다.

    이때, 숫자와 숫자를 구분할때는 , 로 구분을 하고 음수가 들어올수 없다. 따라서 결과값은 무조건 양수이다.

    예 )
    1. "1" => 1
    2. "1,2" => 3
    3. "1,2,3" => 6
    4. "1, 2, 3" => 6
    6. "1, 1 2 3 4, 5," => 1240
    7. ",,,1,2" => 3
    8. "" => 0
*/
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
