// TODO: 1. **Lv 1.**
//    1. 계산기는 2개의 숫자를 받을 수 있고 사칙연산 될 문자를 받을 수 있다.
//    2. 계산기는 exit을 입력할 때까지 계속해서 값을 받고 연산 결과를 반환한다.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: **양의 정수(0 포함)를 입력받기**
        //  Scanner를 사용하여 양의 정수 2개(0 포함)를 전달 받을 수 있습니다.
        //  양의 정수는 각각 하나씩 전달 받습니다.
        //  양의 정수는 적합한 타입으로 선언한 변수에 저장합니다.
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int value1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int value2 = sc.nextInt();

        // TODO:    **사칙연산 기호(➕,➖,✖️,➗)를 입력받기**
        //       Scanner를 사용하여 사칙연산 기호를 전달 받을 수 있습니다.
        //       사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다. (`charAt(0)`)
        System.out.print("사칙연산 기호를 입력하세요: ");
        char symbol = sc.next().charAt(0);
//        System.out.println(value1 +" "+ symbol +" "+ value2);

        // TODO:    **위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기**
        //       키워드 : `if` `switch`
        //       사칙연산 기호에 맞는 연산자를 사용하여 연산을 진행합니다.
        //       입력받은 연산 기호를 구분하기 위해 제어문을 사용합니다. (예를 들면 if, switch)
        //       연산 오류가 발생할 경우 해당 오류에 대한 내용을 정제하여 출력합니다.
        //           ex) “나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.“


        // TODO:    **반복문을 사용하되, 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정하기**
        //       키워드 : 무한으로 반복, 수정하기 (처음부터 무한 반복하는 것이 아니라, 위 스텝별로 진행하며 수정)
        //       반복문을 사용합니다. (예를 들어, for, while…)

    }
}