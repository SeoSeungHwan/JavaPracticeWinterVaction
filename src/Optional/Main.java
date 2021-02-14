package Optional;


import java.util.Optional;
import java.util.OptionalInt;

public class Main {

    public static void main(String[] args) {

        /*
        * Optional 객체 생성 및 값 가져오기
        */

        //Optional은 T타입 객체의 래퍼클래스 , 모든 종류의 객체를 저장가능 - Optional<T>
        //null을 직접 다루는것은 위험하고, null체크를 하지않아도됨(코드가 지저분해지지 않는다)
        Optional<String> ex1 = Optional.of("ex1");
        Optional<String> ex2 = Optional.of(null); // nullException 발생
        Optional<String> ex3 = Optional.ofNullable(null); // 정상적인 실행

        Optional<String> ex4 = null; //바람직 하지않음
        Optional<String> ex5 = Optional.<String>empty(); // <String>생략가능

        Optional<Integer> ex6 = ex1.map(s -> s.length());// map을사용하여 변환

        int ex7 = Optional.of("123")  //ex7에는 3이담김
                .filter(x->x.length()>0)
                .map(Integer::parseInt).get();

        int ex8 = Optional.of("") // 길이가 0보다 크지않고 orElse때문에 -1이 저장장
               .filter(x->x.length()>0)
                .map(Integer::parseInt).orElse(-1);


        Optional<String> optStr = Optional.of("Test");
        String str1 = optStr.get(); //null이면 예외 발생
        String str2 = optStr.orElse(""); //null일경우 ""를 반환
        String str3 = optStr.orElseGet(String::new); //람다식 사용가능()->new String()
        String str4 = optStr.orElseThrow(NullPointerException::new); //널이면 예외 발생생


        /*
        * Optional 관련 함수들
        */

        //isPresent() : Optional객체의 값이 null이면 false 아니면 true 반환
        if(Optional.ofNullable(optStr).isPresent()){
            System.out.println(optStr);
        }

        //ifPresnt() : 널이 아닐때만 작업 수행, 널이면 아무일도 안함
        Optional.ofNullable(optStr).ifPresent(System.out::println);


        /*
        * 기본형 값을 감싸는 래퍼클래스 (OptionalInt,OptionalLong,OptionalDouble)
        * 성능을 높일떄 주로 사용용
        */

        OptionalInt opt = OptionalInt.of(0); //0을 저장
        System.out.println(opt.isPresent()); //true
        OptionalInt opt2 = OptionalInt.empty();//0을 저장
        System.out.println(opt.isPresent()); // false

        System.out.println(opt2.getAsInt()); //값 얻기



    }
}
