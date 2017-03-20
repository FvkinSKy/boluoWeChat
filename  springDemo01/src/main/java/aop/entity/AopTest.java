package aop.entity;

import org.springframework.stereotype.Component;

/**
 * Created by a07 on 2017/2/26.
 * 测试spring aop
 */
@Component
public class AopTest {

    public void test1(){
        System.out.println("表演开始前");
    }

    public void test2(){
        System.out.println("表演开始前");
    }

    public String test3(){
        System.out.println("表演开始后");
        return "今晚打老虎";
    }
    public String test4(int i){
        try {
            System.out.println("456");
        }catch (Exception e){
            throw  new RuntimeException(e);
        }
        return "123";
    }


}
