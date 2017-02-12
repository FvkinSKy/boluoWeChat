package life;

/**
 * Created by a07 on 17/1/31.
 */
public class messageBean {
    public messageBean() {
        System.out.println("messagebean的无参构造");
    }

    public void init(){
        System.out.println("init");
    }

    public void sendMsg(){
        System.out.println("发送消息");
    }

    public void destory(){
        System.out.println("destory");
    }
}
