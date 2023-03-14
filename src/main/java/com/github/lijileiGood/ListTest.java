package com.github.lijileiGood;

import java.util.*;
import java.util.stream.Collectors;

public class ListTest {

    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("Dan", 4));
        peopleList.add(new Person("Andi", 2));
        peopleList.add(new Person("Bob", 42));
        peopleList.add(new Person("Bob", 72));
        peopleList.add(new Person("Bob", 40));
        peopleList.add(new Person("Debby", 3));
        peopleList.add(new Person("Barry", 20));

        peopleList.add(new Person("Cathy", 40));
        peopleList.add(new Person("Barry", 50));
        peopleList.add(new Person("Barry", 50));
        peopleList.add(new Person("Barry", 50));
        peopleList.add(new Person("Barry", 50));

        peopleList.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        for (Person person : peopleList) {
            System.out.println(person);
        }

    }


    public static class Person {
        public Person(String name, int age) {
            this.age = age;
            this.name = name;
        }


        public String name;
        public int age;

        @Override
        public String toString() {
            if (name == null) return super.toString();
            else return String.format("%s : %d", this.name, this.age);
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
    }
}
