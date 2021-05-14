package com.refactoring;

import com.refactoring.calculator.Calculator;
import com.refactoring.lotto.Lotto;


public class Main {
    public static void main(String[] args) {
//        int result = Calculator.sum("1,2,3");
//        System.out.println(result);

        int[] arr = {35,19,13,9,23,44,38};

        for (int i=0; i<1000; i++){
            Lotto lotto = new Lotto(arr);
            lotto.start();
        }

    }
}
