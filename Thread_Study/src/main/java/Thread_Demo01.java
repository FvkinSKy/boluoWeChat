/**
 * Created by a07 on 16/12/30.
 */
public class Thread_Demo01 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Myrunnable mr1=new Myrunnable();
            Thread thread=new Thread(mr1);
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
//                MyThred thred1 = new MyThred();//线程进入new状态
//                MyThred thred2 = new MyThred();
//                thred1.start();//线程进入runnable状态
//                thred2.start();
                thread.start();
            }
            if (i == 40) {
                thread.stop();
            }
        }
    }

}

class MyThred extends Thread {
    private int i = 0;



    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class Myrunnable implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
