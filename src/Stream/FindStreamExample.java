package Stream;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindStreamExample {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //findAny는 스트림이 가진값중 임의의값을 리턴 , findFirst는 맨앞의 값 리턴
        //아무런 값을 가지고 있지 않을것을 대비해서 Optional로 감싸서 리턴함
        Optional<Integer> result =
                numberList.stream().parallel().filter(num -> num<4). findAny();

        System.out.println(result.get());
    }
}
