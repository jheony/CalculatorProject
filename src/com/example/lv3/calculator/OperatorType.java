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
    public static OperatorType matchOperator(char inputOperator){
        for(OperatorType operator : OperatorType.values()){
            if(operator.getSymbol() == inputOperator){
                return operator;
            }
        }
        throw new RuntimeException("올바른 연산 기호를 입력해주세요.");
    }

    public char getSymbol() {
        return operator;
    }
}
