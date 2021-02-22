package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamCollectionExample {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("홍길동1" ,24));
        personList.add(new Person("홍길동2" ,22));
        personList.add(new Person("홍길동3" ,26));
        personList.add(new Person("홍길동4" ,28));

        //collect는  stream을 다시 colletor로 변환해준다.
        List<Person> sortedList = personList.stream().collect(Collectors.toList());

        //List객체로 변환
        List<String> list = personList.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        //TreeSet객체로 변환
        Set<String> set = personList.stream()
                .map(Person::getName)
                .collect(Collectors.toCollection(TreeSet::new));
        for(Person person : sortedList){
            System.out.println(person);
        }
    }
}
