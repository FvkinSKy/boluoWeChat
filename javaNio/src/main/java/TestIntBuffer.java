import java.nio.IntBuffer;

/**
 * Created by a07 on 2017/4/4.
 * 测试intbuffer
 */
public class TestIntBuffer {
    public static void main(String[] args) {
        IntBuffer intBuffer = IntBuffer.allocate(8);
        for (int i = 0; i < intBuffer.capacity(); ++i) {
            int j = 2 * (i + 1);
            intBuffer.put(j);
        }
        intBuffer.flip();

        while (intBuffer.hasRemaining()) {
            int j = intBuffer.get();
            System.out.println(j + " ");
        }
    }
}
