//  **Lv 3.**
//  1. 양의 정수만 받을 수 있었지만, 이제부터는 실수도 받을 수 있게 수정한다.
//  2. 결과가 저장되어 있는 컬렉션을 조회하는 기능을 만든다.
//  3. 그 때 특정 값보다 큰 결과 값을 출력할 수 있도록 한다.

package com.example.lv3;

import com.example.lv3.calculator.ArithmeticCalculator;
import com.example.lv3.calculator.OperatorType;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();

        Scanner sc = new Scanner(System.in);
        int value1, value2;

        // "exit" 입력 전까지 무한 계산
        do {
            try {
                // 양의 정수(0 포함)를 입력받기
                System.out.print("첫 번째 숫자를 입력하세요: ");
                value1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                value2 = sc.nextInt();
                if (value1 < 0 || value2 < 0) {
                    throw new Exception("양의 정수(0포함)를 입력해주세요.");
                }

                // 사칙연산 기호(➕,➖,✖️,➗)를 입력받기
                System.out.print("사칙연산 기호를 입력하세요: ");
                char inputOperator = sc.next().charAt(0);

                // 입력받은 기호로 enum 타입 설정하기
                OperatorType operator = OperatorType.matchOperator(inputOperator);

                // 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산 후 결과값 출력 _키워드 : `if` `switch`
                double result = arithmeticCalculator.calculator(value1, value2, operator);
                System.out.println("결과: " + result);

                // 저장된 연산 결과 확인
                System.out.println(arithmeticCalculator.getResults());

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!sc.next().equals("exit"));
        // 수정 전 결과
        System.out.println("수정 전 데이터:\n" + arithmeticCalculator.getResults());

        // 연산 결과 수정
        arithmeticCalculator.setResult(0, 999);
        System.out.println("0번째 인덱스를 999로 수정:\n" + arithmeticCalculator.getResults());

        // 가장 먼저 저장된 데이터 삭제
        arithmeticCalculator.removeFirstResult();
        System.out.println("가장 먼저 저장된 데이터 삭제: \n" + arithmeticCalculator.getResults());
    }
}