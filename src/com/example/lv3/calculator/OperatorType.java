package com.example.lv3.calculator;

public enum OperatorType {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private char operator;

    OperatorType(char operator) {
        this.operator = operator;
    }
    public char getOperator() {
        return operator;
    }
}
