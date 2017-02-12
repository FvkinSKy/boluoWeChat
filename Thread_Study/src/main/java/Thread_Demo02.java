import org.junit.jupiter.api.Test;

/**
 * Created by a07 on 17/1/1.
 * 线程练习
 */
public class Thread_Demo02 {

    public boolean isfinish;
    /**
     * 匿名内部类创建线程
     */
    @Test
    public void test() {
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("123");
            }
        };
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("456");
            }
        };
        Thread t2 = new Thread(r);
        t.start();
        t2.start();
    }

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getPriority());//优先级
        System.out.println(t.getName());//线程名称
        System.out.println(t.getId());//线程id
        System.out.println(t.isAlive());//是否存活
        System.out.println(t.isDaemon());//是否守护线程

    }

    /**
     * 设置线程优先级来获取时间片
     */
    @Test
    public void test2() {
        Thread max = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("max");
                }
            }
        };

        Thread min = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("min");
                }
            }
        };

        Thread normal = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("normal");
            }
        });
        Thread t = Thread.currentThread();
        max.setPriority(Thread.MAX_PRIORITY);
        min.setPriority(Thread.MIN_PRIORITY);
        normal.setPriority(Thread.NORM_PRIORITY);
        min.start();
        normal.start();
        max.start();
        System.out.println(t.getName());
    }

    /**
     * 线程sleep
     */
    @Test
    public void test3() throws InterruptedException {
        System.out.println("start");
        Thread.sleep(5000L);
        System.out.println("stop");
    }

    /**
     * 测试join
     */
    @Test
    public void test4() {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("开始下载图片");
                for (int i = 1; i <= 100; i++) {
                    System.out.println("正在下载"+i+"%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("下载完毕");
                isfinish=true;
            }
        };

        Thread t2=new Thread(){
            @Override
            public void run() {
                try {
                    t1.join();
                    System.out.println("开始加载图片");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (!isfinish) {
                    System.out.println("图片未下载完毕");
                }
                System.out.println("图片加载完毕");
            }
        };
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
