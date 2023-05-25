package com.github.lijileiGood.userLabel;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

public class DayuDownload {

    public static void main(String[] args) {
        demo demo = new demo("1536920726551110390yangpin");
        Map<String, Object> map = new HashMap<>();
        map.put("id", 41);
        map.put("cond", demo);
        System.out.println(JSON.toJSONString(map));

        HttpUtil.post("http://10.1.20.171:8090/task/executeFromOut", map);
    }

    @Data
    @AllArgsConstructor
    public static class demo {
        private String mediaId;
    }
}
