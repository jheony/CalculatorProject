package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {
    private List<Number> results = new ArrayList<>();

    public <T extends Number, U extends Number> Number calculate(T num1, U num2, OperatorType operator) throws Exception {

        Number result;
        double firstNum = num1.doubleValue();
        double lastNum = num2.doubleValue();

        // 사칙연산을 기호에 맞게 수행 후 result에 결과 저장
        switch (operator.name()) {
            case "ADD":
                result = firstNum + lastNum;
                break;
            case "SUB":
                result = firstNum - lastNum;
                break;
            case "MUL":
                result = firstNum * lastNum;
                break;
            case "DIV":
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
    public List<Number> getResults() {
        return new ArrayList<>(results);
    }

    // 연산 결과 조회
    public void showResults() {
        for (int i = 0; i < results.size(); i++) {
            System.out.println(i + ". " + results.get(i));
        }
    }

    // 연산 결과 수정
    public void setResult(int idx, Number result) {
        this.results.set(idx, result);
    }

    // 첫번째 결과 삭제
    public void removeFirstResult() {
        this.results.remove(0);
    }

    // 선택한 인덱스가 results의 길이를 넘지 않는지
    public boolean isInResultsSize(int num){
        return num < this.results.size() && num >= 0;
    }

    public boolean isResultsEmpty() {
        return this.results.isEmpty();
    }
}
