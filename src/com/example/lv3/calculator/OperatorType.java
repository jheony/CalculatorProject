package com.example.lv3.calculator;

public enum OperatorType {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public static OperatorType fromSymbol(char symbol) {
        for (OperatorType operator : OperatorType.values()) {
            if (operator.getSymbol() == symbol) {
                return operator;
            }
        }
        throw new RuntimeException("올바른 연산 기호를 입력해주세요.");
    }

    public char getSymbol() {
        return symbol;
    }
}