package com.example.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        Calculator calculator = new Calculator();
        // 계산기 실행 중 체크
        boolean isRunning = true;
        while (isRunning) {
            try {
                // 입력 및 사칙연산 수행
                int result = calculator.calculate();
                System.out.println("결과: " + result);

                // 종료 여부 체크
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                input = scanner.nextLine();
                if (input.equals("exit")) {
                    isRunning = false;
                    System.out.println("계산기를 종료합니다.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("0포함 양의 정수를 입력해주세요.\n");
            } catch (Exception e) {
                System.out.println(e.getMessage() + "\n");
            }
        }
    }
}
