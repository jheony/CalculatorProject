package com.example.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int result;

        Calculator calculator = new Calculator();

        // 계산기 실행 중 체크
        boolean isRunning = true;
        while (isRunning) {
            try {
                // 0포함 양의 정수 2개 입력받기
                System.out.print("첫 번째 숫자를 입력하세요: ");
                input = scanner.nextLine();
                int firstNum = Integer.parseInt(input);
                if (firstNum < 0) {
                    throw new Exception("0포함 양의 정수를 입력해주세요.");
                }

                System.out.print("두 번째 숫자를 입력하세요: ");
                input = scanner.nextLine();
                int lastNum = Integer.parseInt(input);
                if (lastNum < 0) {
                    throw new Exception("0포함 양의 정수를 입력해주세요.");
                }

                // 사칙연산 기호 입력받기
                System.out.print("사칙연산 기호를 입력하세요: ");
                input = scanner.nextLine();
                char operator = input.charAt(0);

                // 사칙연산 수행
                result = calculator.calculate(firstNum, lastNum, operator);
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
