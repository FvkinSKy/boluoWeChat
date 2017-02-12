import com.reflect.student;
import org.junit.jupiter.api.Test;
import reflect.proxy.Agency;
import reflect.proxy.HouseSeller;
import reflect.proxy.Seller;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by a07 on 17/1/4.
 */
public class testCase {
    @Test
    public void test() {
        student s = new student();
        Class<?> sClass = s.getClass();
        System.out.println("类的标准名称" + sClass.getCanonicalName());
        try {
            Field f = sClass.getDeclaredField("id");
            System.out.println("设置前的id" + s.getId());
            f.setAccessible(true);
            f.set(s, "111");
            System.out.println("设置后的id" + s.getId());

            Field f2 = sClass.getDeclaredField("name");
            System.out.println("设置前的name" + s.getName());
            f2.setAccessible(true);
            f2.set(s, "shit");
            System.out.println("设置后的name" + s.getName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {
        System.out.println("调用math种的sin()");
        try {
            Method m1 = Math.class.getDeclaredMethod("sin", Double.TYPE);
            Double d1 = (Double) m1.invoke(null, new Integer(1));
            System.out.println("1的正弦值为 " + d1);

            System.out.println("调用string  equals");
            Method m2 = String.class.getDeclaredMethod("equals", Object.class);
            boolean b1 = (boolean) m2.invoke(new String("丢累楼某"), "丢累楼某");
            System.out.println("equals " + b1);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test3() {
        Seller seller = new HouseSeller();
        System.out.println("不使用代理方式");
        seller.sell();

        System.out.println("使用代理方式");
        ClassLoader loader = Seller.class.getClassLoader();
        seller= (Seller) Proxy.newProxyInstance(loader,new Class[]{Seller.class},new Agency());
        seller.sell();

    }
}
