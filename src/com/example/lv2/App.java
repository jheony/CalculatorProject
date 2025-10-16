//  **Lv 2.**
//  1. 계산된 결과 값들을 기록하는 컬렉션을 만든다.
//  2. 컬렉션의 가장 먼저 저장된 데이터를 삭제하는 기능을 만든다.

package com.example.lv2;
import com.example.lv2.calculator.Calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

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
                char symbol = sc.next().charAt(0);

                // 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산 후 결과값 출력 _키워드 : `if` `switch`
                int result = calc.calculate(value1, value2, symbol);
                System.out.println("결과: " + result);

                // 저장된 연산 결과 확인
                System.out.println(calc.getResults());

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!sc.next().equals("exit"));
        // 수정 전 결과
        System.out.println("수정 전 데이터:\n"+calc.getResults());

        // 연산 결과 수정
        calc.setResults(0, 999);
        System.out.println("0번째 인덱스를 999로 수정:\n"+calc.getResults());

        // 가장 먼저 저장된 데이터 삭제
        calc.removeResult();
        System.out.println("가장 먼저 저장된 데이터 삭제: \n"+calc.getResults());
    }
}

// 예외 질문 -> 오류 던질때? throw 쓸 때 예외 코드? Exeption or Illig~Argu~Exception? 어떻게 선택해야 하나요?