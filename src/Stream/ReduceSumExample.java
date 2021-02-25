package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReduceSumExample {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);


        //intStream
        int sum1 = intList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum1 :"+sum1);

        //stream.collect
        int sum2 = intList.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("sum2 :"+sum2);

        //메서드 참조
        int sum3 = intList.stream().reduce(0,Integer::sum);
        System.out.println("sum3 :"+sum3);

        //람다 표현식
        int sum4 = intList.stream().reduce(0,(x,y) ->x+y);
        System.out.println("sum4 :"+sum4);

        //람다표현식 + 병렬처리
        int sum5 = intList.parallelStream().reduce(0,(x,y)->x+y);
        System.out.println("sum5 :"+sum5);

        //최댓값
        int max = intList.stream().reduce(0,Integer::max);
        System.out.println("max :"+max);

        //최솟값
        int min = intList.stream().reduce(0,Integer::min);
        System.out.println("min :"+min);
    }
}
