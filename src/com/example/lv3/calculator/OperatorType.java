package com.example.lv3.calculator;

import java.util.function.DoubleBinaryOperator;

public enum OperatorType {
    ADD('+', (num1, num2) -> num1 + num2),
    SUBTRACT('-', (num1, num2) -> num1 - num2),
    MULTIPLY('*',(num1, num2) -> num1*num2),
    DIVIDE('/', (num1, num2) -> {
        if (num2 == 0) {
            throw new RuntimeException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        } else {
            return num1 / num2;
        }
    });

    private char symbol;
    private DoubleBinaryOperator operation;

    OperatorType(char symbol, DoubleBinaryOperator operation) {
        this.symbol = symbol;
        this.operation = operation;
    }

    public static OperatorType matchOperator(char inputOperator){
        for(OperatorType operator : OperatorType.values()){
            if(operator.getSymbol() == inputOperator){
                return operator;
            }
        }
        throw new RuntimeException("올바른 연산 기호를 입력해주세요.");
    }

    public char getSymbol() {
        return symbol;
    }

    public double calculate(double num1, double num2){
        return  operation.applyAsDouble(num1, num2);
    }
}
