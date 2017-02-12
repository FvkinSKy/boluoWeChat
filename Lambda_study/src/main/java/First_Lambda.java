import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/**
 * Created by a07 on 16/12/28.
 * Lambda表达式学习
 */
public class First_Lambda {
    /**
     * lambda写线程匿名内部类
     */
    @Test
    public void test() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("what the fvk");
            }
        }).start();
        //lambda
        new Thread(() -> System.out.println("hello")).start();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
        //lambda
        Runnable r2 = () -> System.out.println("hello");

        r1.run();
        r2.run();
    }

    @Test
    public void test1() {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer", "Roger Federer",
                "Andy Murray", "Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players = Arrays.asList(atp);

        for (String player : players) {
            System.out.println(player + " ;");
        }
        //lambda

        players.forEach((player) -> System.out.print(player + "; "));
        //java 8双冒号
        players.forEach(System.out::println);
    }

    /**
     * lambda排序
     */
    @Test
    public void test2() {
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer", "Roger Federer",
                "Andy Murray", "Tomas Berdych",
                "Juan Martin Del Potro"};
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        //lambda
        Arrays.sort(players, (String s1, String s2) -> (s1.compareTo(s2)));

        Comparator<String> c=(String s1,String s2) -> (s1.compareTo(s2));
        Arrays.sort(players,c);

        Comparator<String> c2=(String s1,String s2) ->(s1.length()-s2.length());

    }
}
