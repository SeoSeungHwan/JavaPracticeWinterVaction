package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");

        //filter에 함수형 인터페이스를 통해 비교조건 넣어줌
        list.stream().filter(s ->
                s.equals("3"))
                .forEach(System.out::println);

        List<String> list2 = new ArrayList<String>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("3");
        list2.add("4");
        list2.add("4");
        list2.add("5");

        //distinct는 중복을 제거한다 (성능을 저하시킬 수 있음)
        //string이 아닌 객체를 비교할때는 equals메서드를 override하여 구현해야함
        List<String> distinctElements = list2.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctElements);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("홍길동1" ,24));
        personList.add(new Person("홍길동2" ,22));
        personList.add(new Person("홍길동3" ,26));
        personList.add(new Person("홍길동4" ,28));


        personList.stream().sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);

        //기본형을 알고있을경우 InstStream등을 사용
        personList.stream().map((Person p) -> p.toString()).forEach(System.out::println);
    }
}


class Person{
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name"+name+"  Age"+age;
    }

    String name;
    int age;
}