import org.junit.jupiter.api.Test;
import stream.person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a07 on 17/1/3.
 */
public class testCase {
    @Test
    public void test1() {
        List<person> listone = new ArrayList<person>();
        listone.add(new person("tom", "cat", "worker", "700"));
        listone.add(new person("Tamsen", "Brittany", "Java programmer", "8000"));
        listone.add(new person("Floyd", "Donny", "Java programmer", "7500"));
        listone.add(new person("Vere", "Hervey", "Java programmer", "6000"));
        listone.add(new person("Maude", "Jaimie", "Java programmer", "5000"));
        listone.add(new person("Addison", "Pam", "Java programmer", "4000"));

        List<person> listtwo = new ArrayList<person>();
        listtwo.add(new person("Jarrod", "Pace", "PHP programmer", "1000"));
        listtwo.add(new person("Clarette", "Cicely", "PHP programmer", "20000"));
        listtwo.add(new person("Rosalind", "Layla", "PHP programmer", "30000"));
        listtwo.add(new person("Fraser", "Hewie", "PHP programmer", "40000"));
        listtwo.add(new person("Quinn", "Tamara", "PHP programmer", "50000"));


        listone.forEach((p)-> System.out.println(p.getFirstname()+" "+p.getLastname()));
        listtwo.forEach((a)-> System.out.println(a.getFirstname()+" "+a.getLastname()));


    }
}
