import java.util.Enumeration;
import java.util.List;
import java.util.stream.Stream;

//3번문제  위 Calculator클래스에서 짝수인지, 홀수인지 판별해주는 메서드 추가
//짝수 홀수 판별 메서드 : isOdd 홀수이면 true 반환, 짝수이면 false 반환
//4번문제 위 Calculator클래스에서 평균값 구하는 메서드 추가
//정수의 리스트 입력시, 입력받은 리스트의 평균값을 반환하는 avg 메서드 구현
public class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    // 3번 문제 홀짝판단
    boolean isOdd(int val) {
        if (val % 2 == 1) {
            return true;
        }
        return false;
    }

    // 4번 문제 평균값 구하기
    int avg(List<Integer> list) {
        int count = list.size();

        Stream<Integer> stream = list.stream();
        this.value = stream.reduce(value, Integer::sum) / count;
        return this.value;
    }

    int getValue() {
        return this.value;
    }
}
