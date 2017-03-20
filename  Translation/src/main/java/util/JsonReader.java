package util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * Created by a07 on 2017/3/15.
 */
public class JsonReader {
    public static List<String> readJson(String input) {
//        String jsonString=JSON.toJSONString(input);
        JSONObject obj = JSON.parseObject(input);
        List<String> list = JSON.parseArray(input, String.class);
        return list;
    }
}
