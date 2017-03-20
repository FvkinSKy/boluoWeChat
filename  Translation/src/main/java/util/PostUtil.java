package util;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by a07 on 2017/3/15.
 * 发送post请求工具类
 */
public class PostUtil {

    /**
     * @param param
     * @return
     */
    public static String connTool(String param, String url) {
        StringBuffer result = new StringBuffer();
        try {
            URL url2 = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) url2.openConnection();//获取连接
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");


            OutputStream os = conn.getOutputStream();//获取输出流，用于发送数据
            DataOutputStream dos = new DataOutputStream(os);
            dos.write(param.getBytes("UTF-8"));
            dos.flush();


            InputStream is = conn.getInputStream();//获取输入流，用户接收返回数据
            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                result.append(line);
            }

            br.close();
            isr.close();
            is.close();

            dos.close();
            os.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
