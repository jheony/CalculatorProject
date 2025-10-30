package com.example.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        Number result;
        int selectNum;
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();


        // 프로그램 실행 중 체크
        boolean isRunning = true;
        while (isRunning) {

            System.out.println("메뉴를 선택해주세요.");
            System.out.println("1. 사칙연산\t\t2. 연산 결과 조회\t\t3. 연산 결과 수정\t\t4. 첫번째 연산 결과 삭제\t\t5. 종료");
            try {
                selectNum = inputNum().intValue();
                if (2 <= selectNum && selectNum <= 4) {
                    if (arithmeticCalculator.isResultsEmpty()) {
                        throw new Exception("연산 결과가 없습니다.");
                    }
                }

                switch (selectNum) {
                    case 1:
                        // 계산기 실행 중 체크
                        boolean isCalculatorRunning = true;
                        while (isCalculatorRunning) {
                            try {
                                // 타입 상관 없이 숫자 2개 입력받기
                                System.out.print("첫 번째 숫자를 입력하세요: ");
                                Number firstNum = inputNum();

                                System.out.print("두 번째 숫자를 입력하세요: ");
                                Number lastNum = inputNum();

                                // 사칙연산 기호 입력받기
                                System.out.print("사칙연산 기호를 입력하세요: ");
                                input = scanner.nextLine();
                                char inputOperator = input.charAt(0);
                                OperatorType operator = OperatorType.findSymbol(inputOperator);

                                // 사칙연산 수행
                                result = arithmeticCalculator.calculate(firstNum, lastNum, operator);
                                System.out.println("결과: " + result);

                                // 종료 여부 체크
                                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                                input = scanner.nextLine();
                                if (input.equals("exit")) {
                                    isCalculatorRunning = false;
                                    System.out.println("계산을 종료합니다.");
                                }
                            } catch (IllegalArgumentException e) {
                                System.out.println("올바른 값을 입력해주세요.\n");
                            } catch (Exception e) {
                                System.out.println(e.getMessage() + "\n");
                            }
                        }
                        break;
                    case 2:
                        arithmeticCalculator.showResults();
                        break;
                    case 3:
                        arithmeticCalculator.showResults();
                        System.out.print("수정할 인덱스를 입력해주세요: ");
                        int idx = inputNum().intValue();

                        System.out.print("수정할 결과값을 입력해주세요: ");
                        Double inputResult = inputNum().doubleValue();
                        arithmeticCalculator.setResult(idx, inputResult);

                        System.out.println(idx + "번째의 결과값이 " + inputResult + "로 수정되었습니다.");
                        break;
                    case 4:
                        System.out.println("정말 첫 번째 결과값을 삭제하시겠습니까?");
                        System.out.println("1. 확인\t\t2. 취소");
                        selectNum = inputNum().intValue();
                        if (selectNum == 1) {
                            arithmeticCalculator.removeFirstResult();
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
                System.out.println("숫자를 입력해주세요.\n");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static Number inputNum() {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        // 소수점을 포함하고 있으면 double 형식으로 반환
        return (input.contains(".") ? Double.parseDouble(input) : Integer.parseInt(input));
    }
}