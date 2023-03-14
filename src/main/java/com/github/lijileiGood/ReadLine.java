package com.github.lijileiGood;

import cn.hutool.core.util.StrUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * 读取文本文件的每一行
 */
public class ReadLine {
    private final static Pattern IS_CHINESE_A = Pattern.compile("[A-Za-z]");


    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader br = new BufferedReader(new FileReader(new File("/home/leo/desktop/workspace/jilei_test/src/stringtest/b.txt")));
        String s = null;
        Set<String> labelSet = new HashSet<>();
        // 使用readLine方法，一次读一行
        while ((s = br.readLine()) != null) {
            if(StrUtil.isEmpty(s)){
                continue;
            }
            labelSet.add(s);
        }
        br.close();


        BufferedReader br2 = new BufferedReader(new FileReader(new File("/home/leo/desktop/workspace/jilei_test/src/stringtest/a.txt")));
        String s2 = null;
        // 使用readLine方法，一次读一行
        while ((s2 = br2.readLine()) != null) {
            if(!labelSet.contains(s2)){
                System.out.println(s2);
            }
        }
        br2.close();

    }
}
