package com.github.lijileiGood.java8.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StrListTest {
  public static void main(String[] args) {
    String[] array = { "Apple", "Orange", "Banana", "Lemon" };
    Stream<Integer> integerStream = Arrays.stream(array).map(String::length);
  }
}