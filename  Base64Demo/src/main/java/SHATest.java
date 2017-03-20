import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by a07 on 2017/3/19.
 * sha算法
 */
public class SHATest {
    private static String getSha(byte[] msg) {
        byte[] result = null;
        try {
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            sha.update(msg);
            result = sha.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
