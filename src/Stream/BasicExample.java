package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class BasicExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");

        Stream<String> stringStream = list.stream();
        System.out.println("Stream 개수 :" + stringStream.count());

        //아래코드는 오류 발생 : 스트림이 이미 처리되었고 종료되었기 때문!
        /* Stream<String> limitedStream = stringStream.limit(5);
        limitedStream.forEach(System.out::println);*/

        stringStream = list.stream();
        Stream<String> limitedStream = stringStream.limit(5);
        limitedStream.forEach(System.out::println);

        //위의 코드를 한줄로 줄여서 표현(파이프라인)
        list.stream().limit(5).forEach(System.out::println);


    }
}
