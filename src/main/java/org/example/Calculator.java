package org.example;

import java.lang.ArithmeticException;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero blah blah blah");
        }
        return a / b;
    }
}
