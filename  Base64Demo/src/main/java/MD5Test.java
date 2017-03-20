import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by a07 on 2017/3/19.
 * md5测试
 */
public class MD5Test {
    private static String MD5(byte[] data) throws UnsupportedEncodingException {
        byte[] result = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(data);//开始加密摘要
            result = md.digest();//生成加密摘要
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String result = null;
        try {
            result = MD5("hello world".getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }

    @Test
    public void test() throws UnsupportedEncodingException {
        byte[] b = "hello world".getBytes("utf-8");
        System.out.println(b.toString());
        System.out.println(new String(b,"utf-8"));
    }
}
