package com.github.lijileiGood;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

public class DayuDownload {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", 41);
        A a = new A("1536920726551110390yangpin");
        map.put("cond", a);
        System.out.println(JSON.toJSONString(map));

       HttpUtil.post("http://10.1.20.171:8090/task/executeFromOut", map);
    }


    public static class A {
        private String mediaId;

        public String getMediaId() {
            return mediaId;
        }

        public void setMediaId(String mediaId) {
            this.mediaId = mediaId;
        }

        public A(String mediaId) {
            this.mediaId = mediaId;
        }

    }
}
