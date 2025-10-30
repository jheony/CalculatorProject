package com.example.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int result;
        int selectNum = 0;
        Calculator calculator = new Calculator();


        // 프로그램 실행 중 체크
        boolean isRunning = true;
        while (isRunning) {

            System.out.println("메뉴를 선택해주세요.");
            System.out.println("1. 사칙연산\t\t2. 연산 결과 조회\t\t3. 연산 결과 수정\t\t4. 종료");
            try {
                selectNum = inputNum();
            } catch (Exception ignored) {
            }

            switch (selectNum) {
                case 1:
                    // 계산기 실행 중 체크
                    boolean isCalculatorRunning = true;
                    while (isCalculatorRunning) {
                        try {
                            // 0포함 양의 정수 2개 입력받기
                            System.out.print("첫 번째 숫자를 입력하세요: ");
                            int firstNum = inputNum();

                            System.out.print("두 번째 숫자를 입력하세요: ");
                            int lastNum = inputNum();

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
                                isCalculatorRunning = false;
                                System.out.println("계산을 종료합니다.");
                            }
                        } catch (IllegalArgumentException e) {
                            System.out.println("0포함 양의 정수를 입력해주세요.\n");
                        } catch (Exception e) {
                            System.out.println(e.getMessage() + "\n");
                        }
                    }

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("계산기를 종료합니다.");
                    break;
                default:
                    System.out.println("메뉴에 있는 번호를 선택해주세요.");
            }
        }


    }

    public static int inputNum() throws Exception {
        Scanner sc = new Scanner(System.in);
        int num;
        String input = sc.next();
        num = Integer.parseInt(input);
        if (num < 0) {
            throw new Exception("0포함 양의 정수를 입력해주세요.");
        }
        return num;
    }
}