package com.example.lv3.calculator;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number> {
    // 속성
    // 연산 결과를 담는 컬렉션
    private final List<Double> results = new ArrayList<>();

    // 생성자

    // 기능
    // 사칙 연산을 수행하는 메서드
    public double calculate(T num1, T num2, OperatorType operator) {
        double result = 0;

        // 연산을 위해 제네릭을 double로 형변환
        double doubledNum1 = num1.doubleValue();
        double doubledNum2 = num2.doubleValue();

        switch (operator.getSymbol()) {
            case '+':
                result = doubledNum1 + doubledNum2;
                break;
            case '-':
                result = doubledNum1 - doubledNum2;
                break;
            case '*':
                result = doubledNum1 * doubledNum2;
                break;
            case '/':
                if (doubledNum2 == 0) {
                    throw new RuntimeException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = doubledNum1 / doubledNum2;
                break;
            default:
                break;
        }

        // 컬렉션에 연산 결과 저장
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
