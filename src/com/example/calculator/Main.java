package com.example.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int result;
        int selectNum;
        Calculator calculator = new Calculator();


        // 프로그램 실행 중 체크
        boolean isRunning = true;
        while (isRunning) {

            System.out.println("메뉴를 선택해주세요.");
            System.out.println("1. 사칙연산\t\t2. 연산 결과 조회\t\t3. 연산 결과 수정\t\t4. 첫번째 연산 결과 삭제\t\t5. 종료");
            try {
                selectNum = inputNum();
                if (2 <= selectNum && selectNum <= 4) {
                    if (calculator.isResultsEmpty()) {
                        throw new Exception("연산 결과가 없습니다.");
                    }
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
                        calculator.showResults();
                        break;
                    case 3:
                        calculator.showResults();
                        System.out.print("수정할 인덱스를 입력해주세요: ");
                        int idx = inputNum();
                        System.out.print("수정할 결과값을 입력해주세요: ");
                        int inputResult = inputNum();
                        calculator.setResult(idx, inputResult);

                        System.out.println(idx + "번째의 결과값이 " + inputResult + "로 수정되었습니다.");
                        break;
                    case 4:
                        System.out.println("정말 첫 번째 결과값을 삭제하시겠습니까?");
                        System.out.println("1. 확인\t\t2. 취소");
                        int selctNum = inputNum();
                        if (selctNum == 1) {
                            calculator.removeFirstResult();
                            System.out.println("첫번째 결과값이 삭제되었습니다.");
                        }
                        break;
                    case 5:
                        isRunning = false;
                        System.out.println("계산기를 종료합니다.");
                        break;
                    default:
                        throw new Exception("메뉴에 있는 번호를 선택해주세요.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("0포함 양의 정수를 입력해주세요.\n");
            } catch (Exception e) {
                System.out.println(e.getMessage());
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