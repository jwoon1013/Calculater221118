//2번 문제 위 Calculator클래스를 활용해서,
// 멤버 필드인 value의 크기 제한이 있는 MaxLimitCalculator클래스 만들기
// 멤버 필드 value의 크기가 100보다 큰 값은 가질 수 없다.

public class MaxLimitCalculator extends Calculator {
    int getValue() {
        if (this.value > 100) {
            System.out.println("결과가 100을 초과합니다.");
            return 0;

        } return this.value;


    }
}
