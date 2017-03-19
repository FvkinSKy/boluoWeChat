import aop.entity.ResourceTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by a07 on 17/1/31.
 */
public class testCase {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("app2.xml");
        ResourceTest bean = ac.getBean("resourceTest", ResourceTest.class);
        bean.test1();
        System.out.println(bean);
    }
}
