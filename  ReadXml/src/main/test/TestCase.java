import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by a07 on 2017/3/21.
 */
public class TestCase {
    @Test
    public void test() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 11; i++) {
            list.add("i" + i);
        }

        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
        for(String s:list){
            System.out.println(s);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
        for (int j=0;j<list.size();j++){
            System.out.println(list.get(j));
        }
    }
}
