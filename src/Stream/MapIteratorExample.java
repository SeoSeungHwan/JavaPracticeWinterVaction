package Stream;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteratorExample {
    public static void main(String[] args) {
        Map<String,Person> map = new HashMap<>();
        map.put("1",new Person("홍길동1",45));
        map.put("2",new Person("홍길동2",42));
        map.put("3",new Person("홍길동3",47));
        map.put("4",new Person("홍길동4",48));
        map.put("5",new Person("홍길동5",43));

        //Iterator 방식
        System.out.println("Iterator 방식");
        Iterator<String> keys = map.keySet().iterator();
        while(keys.hasNext()){
            String key = keys.next();
            System.out.println(
                    String.format("Key : %s, Value : %s",key,map.get(key))
            );
        }

        //Map의 Entry를 이용하여 처리
        System.out.println("Map의 Entry 방식");
        for(Map.Entry<String,Person> element : map.entrySet()){
            System.out.println(
                    String.format("Key : %s, Value : %s",element.getKey(),element.getValue())
            );
        }

        //Map의 KeySet을 이용하여 처리
        System.out.println("Map의 KeySet 방식");
        for(String key : map.keySet()){
            System.out.println(
                    String.format("Key : %s, Value : %s",key,map.get(key))
            );
        }

        //foreach이용
        System.out.println("Foreach 방식");
        map.forEach((key,value)->
                String.format("Key : %s, Value : %s",key,value)
        );
    }
}
