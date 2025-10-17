package com.example.lv3.calculator;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator /* TODO: Hint */ {
    // 속성
    private List<Integer> results = new ArrayList<>();

    // 생성자

    // 기능
    public int calculator(int num1, int num2, char operator) {
        // 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산 후 결과값 출력 _키워드 : `if` `switch`
        int result;

        switch (operator) {
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
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                throw new RuntimeException("올바른 연산 기호를 입력해주세요.");
        }

        results.add(result);
        return result;
    }

    // 저장된 연산 결과 반환
    public List<Integer> getResults(){
        return results;
    }

    // 연산 결과 수정
    public void setResult(int idx, int value){
        results.set(idx, value);
    }

    // 가장 먼저 저장된 데이터 삭제
    public void removeFirstResult(){
        results.remove(0);
    }
}
