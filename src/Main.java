//  **Lv 1.**
//  계산기는 2개의 숫자를 받을 수 있고 사칙연산 될 문자를 받을 수 있다.
//  계산기는 exit을 입력할 때까지 계속해서 값을 받고 연산 결과를 반환한다.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value1, value2;

        // "exit" 입력 전까지 무한 계산
        while (true) {
            // 양의 정수(0 포함)를 입력받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            value1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            value2 = sc.nextInt();

            // 사칙연산 기호(➕,➖,✖️,➗)를 입력받기
            System.out.print("사칙연산 기호를 입력하세요: ");
            char symbol = sc.next().charAt(0);

            // 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산 후 결과값 출력 _키워드 : `if` `switch`
            int result = 0;

            switch (symbol) {
                case '+':
                    result = value1 + value2;
                    break;
                case '-':
                    result = value1 - value2;
                    break;
                case '*':
                    result = value1 * value2;
                    break;
                case '/':
                    if (value2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    } else {
                        result = value1 / value2;
                    }
                    break;
            }
            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (sc.next().equals("exit")) {
                break;
            }
        }
    }
}