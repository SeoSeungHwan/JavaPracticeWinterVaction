package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamMatchExample {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,3,5,7,9,11);

        //allmatch
        boolean answer1 = numberList.stream().allMatch(number ->number <10);
        System.out.printf("10보다 모두 작은지 : %s\n", answer1);

        //anymatch
        boolean answer2 = numberList.stream().anyMatch(number ->number %3 ==0);
        System.out.printf("3의 배수가 있는지 : %s\n", answer2);

        //nonemmatch
        boolean answer3 = numberList.stream().noneMatch(number ->number%2 ==0);
        System.out.printf("짝수가 없는가 : %s\n", answer3);

    }
}
