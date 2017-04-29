import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by a07 on 2017/4/4.
 */
public class ChannelTest {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/a07/Documents/周报模版/test.txt");
            FileOutputStream fos = new FileOutputStream("/Users/a07/Documents/周报模版/test2.txt");
            //获取通道
            FileChannel channel = fis.getChannel();
            FileChannel outChannel = fos.getChannel();
            //创建缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(2048);
            //数据读到缓冲区
            channel.read(buffer);

            buffer.flip();
            outChannel.write(buffer);

//            while (buffer.remaining() > 0) {
//                byte b = buffer.get();
//                System.out.println((char) b);
//            }
            fos.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() {
        byte[] message = {22, 45, 67, 11, 99, 56, 24, 42};
        try {
            FileOutputStream fos = new FileOutputStream("/Users/a07/Documents/周报模版/test.txt");
            //获取通道
            FileChannel fc = fos.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            for (int i = 0; i < message.length; i++) {
                buffer.put(message[i]);
            }
            buffer.flip();
            fc.write(buffer);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
