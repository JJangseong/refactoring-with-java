package com.refactoring;

import com.refactoring.calculator.Calculator;


public class Main {
    public static void main(String[] args) {
        int result = Calculator.sum("1,1,2,3,4,1,");
        System.out.println(result);
    }
}
