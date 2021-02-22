package Stream;

import java.util.stream.Stream;

public class StreamBuilderExample {
    public static void main(String[] args) {

        //accept는 생성한 스트림 빌더 객체에 데이터를 계속 누적해서 쌓는다.
        Stream.Builder<String> acceptBuilder = Stream.builder();
        acceptBuilder.accept("1");
        acceptBuilder.accept("2");
        acceptBuilder.accept("3");
        acceptBuilder.accept("4");
        acceptBuilder.build().forEach(System.out::println);

        //add메서드가 리턴하는 스트림 빌더 객체는 새롭게 생성되는 객체가아니라 자기 자신이다.
        Stream.Builder<String> addBuilder = Stream.builder();
        addBuilder.add("1")
        .add("2")
        .add("3")
        .add("4");
        addBuilder.build().forEach(System.out::println);
    }
}
