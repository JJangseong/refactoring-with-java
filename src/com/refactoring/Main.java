package com.refactoring;

import com.refactoring.calculator.Calculator;
import com.refactoring.lotto.Lotto;


public class Main {
    public static void main(String[] args) {
//        int result = Calculator.sum("1,2,3");
//        System.out.println(result);

        int[] arr = {3,7,13,22,23,44,9};
        Lotto.sortition(arr);

    }
}
