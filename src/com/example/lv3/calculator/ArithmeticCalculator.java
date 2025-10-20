package com.example.lv3.calculator;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator /* TODO: Hint */ {
    // 속성
    private List<Double> results = new ArrayList<>();

    // 생성자

    // 기능
    public double calculator(int num1, int num2, OperatorType operator) {
        // 입력받은 2개의 값으로 enum에 저장된 연산 실행
        double result = operator.calculate(num1, num2);

        results.add(result);
        return result;
    }

    // 저장된 연산 결과 반환
    public List<Double> getResults(){
        return results;
    }

    // 연산 결과 수정
    public void setResult(int idx, double value){
        results.set(idx, value);
    }

    // 가장 먼저 저장된 데이터 삭제
    public void removeFirstResult(){
        results.remove(0);
    }
}
