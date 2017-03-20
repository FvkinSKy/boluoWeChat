import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by a07 on 2017/3/19.
 * hmac算法
 */
public class HMACTest {
    private static byte[] getPrivateKey() throws NoSuchAlgorithmException {
        KeyGenerator key = KeyGenerator.getInstance("HmacMD5");
        SecretKey secretKey = key.generateKey();
        return secretKey.getEncoded();
    }

    private static String hmac(byte[] key, byte[] data) {
        byte[] result=null;
        SecretKey secretKey = new SecretKeySpec(key, "HmacMD5");
        try {
            Mac mac = Mac.getInstance("HmacMD5");
            mac.init(secretKey);
            result = mac.doFinal(data);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
        return result.toString();

    }
}
