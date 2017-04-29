import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by a07 on 2017/4/6.
 */
public class Selector {
    @Test
    public void test() {
        try {
            FileInputStream fis = new FileInputStream("");
            FileChannel channel = fis.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(new Long(channel.size()).intValue());
            channel.read(buffer);
            buffer.flip();

            java.nio.channels.Selector selector = java.nio.channels.Selector.open();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
