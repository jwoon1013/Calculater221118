import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(10);
        System.out.println(cal.getValue());

        // 이 밑으로 (1번문제) UpgradeCalculator 기능테스트 합니다.
        System.out.println("< UpgradeCalculator Check >");
        UpgradeCalculator upgradCal = new UpgradeCalculator();

        System.out.println("+50 : "); // 더하기
        upgradCal.add(50);
        System.out.println(upgradCal.getValue());

        System.out.println("-10 :"); // 빼기
        upgradCal.minus(10);
        System.out.println(upgradCal.getValue());

       //이 밑으로 (2번문제) MaxLimitCalculator 기능 테스트합니다. (*모르겠다 이렇게 하는게 맞나?)
        System.out.println("< MaxLimitCalculator 테스트 >");
        MaxLimitCalculator maxLimitCalculator = new MaxLimitCalculator();
        System.out.println("초기값 : "+ maxLimitCalculator.getValue());
        maxLimitCalculator.add(70);
        System.out.println("+70 :" +  maxLimitCalculator.getValue());
        maxLimitCalculator.add(70);
        System.out.println("+70 :" + maxLimitCalculator.getValue()); // 결과 100 초과하면 메세지 띄우고 value 0으로 바꿔버림.


        // 이 밑으로 (3번문제) Calculator 의 isOdd(홀수면true) 기능테스트합니다.
        System.out.println("< isOdd 테스트 >");
        Calculator calTestisOdd = new Calculator();
        System.out.println("val 30은? " + calTestisOdd.isOdd(30));
        System.out.println("val 25는? " + calTestisOdd.isOdd(25));

        // 이 밑으로 (4번문제) Calculator 의 avg(정수리스트 입력시 평균값반환) 함수 기능 테스트
        System.out.println("< avg 테스트 >");

        Calculator calTestAvg = new Calculator();
        final List<Integer> testList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        final List<Integer> testList2 = new ArrayList<>(Arrays.asList(9,10,18,20,25,27));

        System.out.println("입력한 정수 리스트 : " + testList);
        calTestAvg.avg(testList);
        System.out.println("avg 함수 결 과: " + calTestAvg.getValue());

        calTestAvg.avg(testList2);
        System.out.println("입력한 정수 리스트 : " + testList2);
        System.out.println("avg 함수 결 과: " + calTestAvg.getValue()); // 궁금증 : 당신의 18.16666666666667 , 19로 대체됐다. int가 정수범위여서인건 앎. 1) this.value를 double로 바꾸기..? 그냥두기..?




    }
}