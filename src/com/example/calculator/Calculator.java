package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final List<Integer> results = new ArrayList<>();

    public int calculate(int firstNum, int lastNum, char operator) throws Exception {

        int result;
        // 사칙연산을 기호에 맞게 수행 후 result에 결과 저장
        switch (operator) {
            case '+':
                result = firstNum + lastNum;
                break;
            case '-':
                result = firstNum - lastNum;
                break;
            case '*':
                result = firstNum * lastNum;
                break;
            case '/':
                if (lastNum == 0) {
                    throw new Exception("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = firstNum / lastNum;
                }
                break;
            default:
                throw new Exception("올바른 연산 기호를 입력해주세요.");
        }
        results.add(result);
        return result;
    }

    // 연산 결과 리스트 반환
    public List<Integer> getResults() {
        return new ArrayList<>(results);
    }

    // 연산 결과 조회
    public void showResults() {
        for (int i = 0; i < results.size(); i++) {
            System.out.println(i + ". " + results.get(i));
        }
    }

    // 연산 결과 수정
    public void setResult(int idx, int result) {
        this.results.set(idx, result);
    }

    public boolean isResultsEmpty() {
        return this.results.isEmpty();
    }
}
