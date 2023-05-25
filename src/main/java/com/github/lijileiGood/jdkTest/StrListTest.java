package com.github.lijileiGood.jdkTest;

import java.util.Arrays;

public class StrListTest {
  public static void main(String[] args) {
    String[] array = new String[] { "Apple", "Orange", "Banana", "Lemon" };
    Arrays.sort(array, (o1, o2) -> o1.compareTo(o2) );
    Arrays.sort(array, String::compareTo);
    System.out.println(String.join(", ", array));
  }

  static int cmp(String s1, String s2) {
    return s1.compareTo(s2);
  }
}