package main.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Отсортировать объекты по восрастанию, а nulls в конце
 */

public class Sort {
    public static void main(String[] args) {
        List<Human> list = Arrays.asList(
                new Human("A", 18),
                new Human("B", 5),
                new Human("C", 35),
                new Human("D", null),
                new Human("E", 40),
                new Human("F", 4)
        );

        list.stream()
                .sorted(Comparator.comparing(Human::getAge, Comparator.nullsLast(Comparator.naturalOrder())))
                .forEach(System.out::println);
    }
}
class Human {
    private String name;
    private Integer age;

    public Human(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
