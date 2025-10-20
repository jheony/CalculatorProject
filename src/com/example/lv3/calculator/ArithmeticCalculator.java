package com.example.lv3.calculator;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator /* TODO: Hint */ {
    // 속성
    private final List<Double> results = new ArrayList<>();

    // 생성자

    // 기능
    public double calculator(double num1, double num2, OperatorType operator) {
        double result = 0;
        // 입력받은 2개의 값으로 enum에 저장된 연산 실행
        switch (operator.getSymbol()) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new RuntimeException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = num1 / num2;
                break;
            default:
                break;
        }

        results.add(result);

        return result;
    }

    // 저장된 연산 결과 반환
    public List<Double> getResults() {
        return results;
    }

    // 연산 결과 수정
    public void setResult(int idx, double num) {
        results.set(idx, num);
    }

    // 가장 먼저 저장된 데이터 삭제
    public void removeFirstResult() {
        results.remove(0);
    }
}
