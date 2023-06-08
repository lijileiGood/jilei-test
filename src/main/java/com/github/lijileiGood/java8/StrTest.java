package com.github.lijileiGood.java8;

import java.util.HashSet;
import java.util.Set;

public class StrTest {

    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("万交稿出错印刷");
        strings.add("万交稿出错印刷");
        System.out.println(deleteThisPicture(strings));
    }

    private static boolean deleteThisPicture(Set<String> ocrWordSet) {
        boolean containsD = false;
        boolean containsY = false;
        for (String word : ocrWordSet) {
            if (word.contains("定稿")) {
                containsD = true;
            }
            if (word.contains("印刷")) {
                containsY = true;
            }
            // 在wordSet中同时存在，才回true
            if (containsD && containsY) {
                return true;
            }
            if (word.contains("万能定稿凭证") || word.contains("文字信息容易出错")) {
                return true;
            }
        }
        return false;
    }
}
