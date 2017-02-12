import container.instantation.ExampleBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by a07 on 17/1/31.
 */
public class testCase {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("app2.xml");
        ExampleBean bean = ac.getBean("eb1", ExampleBean.class);
        bean.init();
        bean.destroy();
        System.out.println(bean);
    }
}
