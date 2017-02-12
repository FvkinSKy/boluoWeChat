package container.instantation;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by a07 on 17/1/31.
 */
@Component("eb1")
@Scope("singleton")
@Lazy(true)
public class ExampleBean {

    public ExampleBean() {
        System.out.println("exampleBean的无参构造");
    }

    @PostConstruct
    public void init(){
        System.out.println("init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }
}
