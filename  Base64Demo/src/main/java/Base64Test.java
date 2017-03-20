import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * Created by a07 on 2017/3/19.
 * base64测试
 */
public class Base64Test {

    /**
     * 加密
     *
     * @param msg
     * @return
     */
    private static String encode(String msg) {
        byte[] bytes = msg.getBytes();
        return new BASE64Encoder().encode(bytes);
    }

    /**
     * 解密
     *
     * @param msg
     * @return
     */
    private static String decode(String msg) {
        byte[] result = null;
        try {
            result = new BASE64Decoder().decodeBuffer(msg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new String(result);
    }

    public static void main(String[] args) {
        String msg = encode("今晚打老虎");
        System.out.println("加密：" + msg);
        String result = decode(msg);
        System.out.println("解密：" + result);
    }
}
