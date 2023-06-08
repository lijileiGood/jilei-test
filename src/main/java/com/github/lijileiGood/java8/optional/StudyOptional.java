package com.github.lijileiGood.java8.optional;

import com.github.lijileiGood.java8.stream.Person;

import java.security.MessageDigest;
import java.util.Optional;
import java.util.OptionalInt;

public class StudyOptional {
    public static void main(String[] args) {
//        Person person = new Person("Tom", 18);
        Person person = null;
        boolean flag = Optional.ofNullable(person).isPresent();
        System.out.println(flag);
        Optional.ofNullable(person).ifPresent(u ->  System.out.println(u.getName()));
//        System.out.println(present);
    }
}
