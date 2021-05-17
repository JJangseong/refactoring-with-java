package com.refactoring;

import com.refactoring.calculator.Calculator;
import com.refactoring.lotto.Lotto;


public class Main {
    public static void main(String[] args) {
//        int result = Calculator.sum("1,2,3");
//        System.out.println(result);

        int[] arr = {19,28,40,36,27,9};

        for(int i=0; i<10000; i++) {
            Lotto.sortition(arr);
        }


    }
}
