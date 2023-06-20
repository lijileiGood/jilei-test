package com.github.lijileiGood.java8.fastjson;

import com.alibaba.fastjson2.JSON;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class People {
    private String name;
    private List<String> dogList;

    private void getDogSize(){
        System.out.println(dogList.get(0));
    }

    public static void main(String[] args) {
        System.out.println(new Date().getTime());
        System.out.println(System.currentTimeMillis());
        JsonTest jsonTest = new JsonTest();
        System.out.println(JSON.toJSONString(jsonTest));
    }

}
