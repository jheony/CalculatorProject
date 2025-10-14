// TODO: 1. **Lv 1.**
//    2. 계산기는 exit을 입력할 때까지 계속해서 값을 받고 연산 결과를 반환한다.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: 양의 정수(0 포함)를 입력받기
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int value1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int value2 = sc.nextInt();

        // TODO: 사칙연산 기호(➕,➖,✖️,➗)를 입력받기
        System.out.print("사칙연산 기호를 입력하세요: ");
        char symbol = sc.next().charAt(0);

        // TODO: 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산 후 결과값 출력 _키워드 : `if` `switch`
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
                if(value2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }else {
                    result = value1 / value2;
                }
                break;
        }
        System.out.println("결과: " + result);


        // TODO:    **반복문을 사용하되, 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정하기**
        //       키워드 : 무한으로 반복, 수정하기 (처음부터 무한 반복하는 것이 아니라, 위 스텝별로 진행하며 수정)
        //       반복문을 사용합니다. (예를 들어, for, while…)

    }
}