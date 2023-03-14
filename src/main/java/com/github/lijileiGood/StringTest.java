package com.github.lijileiGood;


import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class StringTest {


    private final static List<String> preSet = Arrays.asList( "号", "号楼", "号铺", "路", "街", "楼", "店", "门面", "中心",
            "园", "园区", "单元", "期", "大学", "广场", "栋", "公司", "道", "室", "公寓", "城");

    public static void main(String[] args) {
        String originName = "，";
        String[] split = originName.split("，");
        for (String s : split) {
            System.out.println("---------" + s);
        }
        if(originName.contains("（")){
            int begin = originName.indexOf("（");
            if(begin == 0){
                System.out.println(originName.replace("（", "").replace("）", ""));
            }else {
                System.out.println(originName.substring(0, begin));
            }
        }


    }
    private static String method(String detail ){
        int lastIndex = detail.lastIndexOf("*");
        if (lastIndex == -1 || lastIndex >= detail.length() - 2) {
            return null;
        }
        String originName = detail.substring(lastIndex + 1);
        for (String pre : preSet) {
            if(originName.startsWith(pre)){
                return originName.replace(pre, "");
            }
        }
        return originName;
    }
}
