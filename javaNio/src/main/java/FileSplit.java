import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by a07 on 2017/4/5.
 * 文件分块下载
 */
public class FileSplit {
    private static String filePath = "/Users/a07/Documents/周报模版/工作周报_开发部_邹瑞_2017年02月27日-03月03日.doc";

    private static String newFile = "/Users/a07/Documents/nio测试/工作周报_开发部_邹瑞_2017年02月27日-03月03日.doc";

    private static String newDir = "/Users/a07/Documents/nio测试";


    public static void main(String[] args) {
        boolean result = spiltFile(newDir, filePath, newFile);
        System.out.println(result == true ? "复制成功！" : "复制失败！");
    }


    /**
     * 复制文件方法
     *
     * @param newdir   父级文件夹路径
     * @param filepath 源文件路径
     * @param newfile  新文件路径
     * @return
     */

    private static boolean spiltFile(String newdir, String filepath, String newfile) {
        //文件夹
        File dir = new File(newdir);
        //源文件
        File file = new File(filepath);
        //目标文件
        File target = new File(newfile);

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //创建文件夹
            if (!dir.exists()) {
                dir.mkdir();
            }
            fis = new FileInputStream(file);
            //输入流通道
            FileChannel inChannel = fis.getChannel();
            //获取文件大小，单位：字节
            long fileSize = inChannel.size();
            int toint = new Long(fileSize).intValue();
            //获取缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(toint);
            //读到缓冲区
            inChannel.read(buffer);
            //反转
            buffer.flip();

            fos = new FileOutputStream(target);

            FileChannel outChannel = fos.getChannel();
            outChannel.write(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
