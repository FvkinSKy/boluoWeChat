import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * Created by a07 on 2017/3/21.
 * 使用saxRead读取xml
 */
public class ReadxmlDemo {

    private static String xmlPath = "";

    @Test
    public void test() {
        SAXReader reader = new SAXReader();
        try {
            //生成文档对应实体
            Document doc = reader.read(new FileInputStream(new File(xmlPath)));
            /**
             * 此处可以直接选择哪个节点
             *
             * doc.selectNodes();
             *
             * 得到一个list之后遍历，再得到节点的值
             *
             * for(Iterator it=list..iterator();it.hasNext();){
             *        Element element=it.next();
             *  }
             */
            Element element = doc.getRootElement();//获取根元素

            List<Element> elementList = element.elements();//得到所有子元素
            //遍历输出

            for (Element el : elementList) {
                //可以直接获取子元素

            }
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("xml文件不存在》》》" + e.getMessage());
        }
    }

}
