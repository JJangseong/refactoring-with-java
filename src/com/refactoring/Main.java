package com.refactoring;

import com.refactoring.calculator.Calculator;


public class Main {
    public static void main(String[] args) {
        int result = Calculator.sum("1,2,3");
        System.out.println(result);
    }
}
