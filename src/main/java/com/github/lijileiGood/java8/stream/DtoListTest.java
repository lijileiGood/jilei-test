package com.github.lijileiGood.java8.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

public class DtoListTest {
    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("Dan", 4));
        peopleList.add(new Person("Andi", 2));
        peopleList.add(new Person("Bob", 42));
        peopleList.add(new Person("Bob", 72));
        peopleList.add(new Person("Bob", 40));
        peopleList.add(new Person("Debby", 3));
        peopleList.add(new Person("Barry", 20));
        peopleList.add(new Person("Barry", 50));
        peopleList.add(new Person("Cathy", 40));

        peopleList.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        for (Person person : peopleList) {
            System.out.println(person);
        }
    }


}
