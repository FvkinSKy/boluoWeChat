package aop.entity;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by a07 on 2017/2/26.
 */
@Component
public class ResourceTest {
    @Resource(name = "aopTest")
    private AopTest aopTest;

    public void test1(){
        aopTest.test1();
    }
}
