package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamFlatMapExample {
    public static void main(String[] args) {
        String[][] rawdata =new String[][] {
                {"a","b"},{"c","b"},{"e","a"},{"a","h"},{ "i","j"}
        };

        List<String[]> rawList = Arrays.asList(rawdata);

        rawList.stream()
                .flatMap(array -> Arrays.stream(array))
                .filter(data -> "a".equals(data.toString()))
                .forEach(data ->System.out.println(data));
    }
}
