package execute;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import util.PostUtil;

/**
 * Created by a07 on 2017/3/15.
 * 有道翻译api
 */
public class YouDaoTransLation {

    private static final String APIPATH = "http://fanyi.youdao.com/openapi.do";

    private static String param = "keyfrom=translation996&key=882237243&type=data&doctype=json&version=1.1&q=";

    private static String trans = "hello";

    public static void main(String[] args) {
        String result = PostUtil.connTool(param + trans, APIPATH);//返回类型为json
        JSONObject obj=JSON.parseObject(result);
        System.out.println(obj);
        System.out.println(obj.getString("translation"));
    }
}


