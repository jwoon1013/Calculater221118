//1번문제 클래스 이름 Calculator
//위 Calculator 클래스를 상속하는 UpgradeCalculator를 만든다.
//빼기기능 구현, 메서드 명 minus

public class UpgradeCalculator extends Calculator {
    void minus(int val) {
        this.value -= val;
    }
}
