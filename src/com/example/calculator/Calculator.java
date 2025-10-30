package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        try {
            // 0포함 양의 정수 2개 입력받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            input = scanner.nextLine();
            int firstNum = Integer.parseInt(input);
            if(firstNum < 0){
                throw new Exception("0포함 양의 정수를 입력해주세요.");
            }

            System.out.print("두 번째 숫자를 입력하세요: ");
            input = scanner.nextLine();
            int lastNum = Integer.parseInt(input);
            if(lastNum < 0){
                throw new Exception("0포함 양의 정수를 입력해주세요.");
            }

            // 사칙연산 기호 입력받기
            System.out.print("사칙연산 기호를 입력하세요: ");
            input = scanner.nextLine();
            char operator = input.charAt(0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
