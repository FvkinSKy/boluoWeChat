import com.dao.CommonDao;
import com.dao.UserDao;
import com.entity.User;
import com.util.MybatisTool;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * Created by rui on 2017/4/28.
 * 测试类
 */
public class TestCase {

    public static SqlSession session = MybatisTool.getSession();

    public static CommonDao dao = session.getMapper(CommonDao.class);

    /**
     * 测试SqlSession获取
     */
    @Test
    public void test() {
        System.out.println(session);
    }

    /**
     * 测试接口映射
     */
    @Test
    public void test1() {
        UserDao dao = session.getMapper(UserDao.class);
//        User user=dao.findById(2);
//        User user=dao.findByName("%张%");
//        List<User> list=dao.findAll();
//        List<Map<String,Object>> list=dao.findAllMap();
//        for (Map<String ,Object> map:list){
//            System.out.println(map);
//        }
//        User u=new User();
//        u.setId(8);
//        u.setName("詹姆斯邦德");
//        u.setAge(30);
//        dao.addUser(u);
//        dao.delUser(7);
        dao.updUser("卡卡罗特", 8);
        //DML操作需要commit
        session.commit();
//        System.out.println("list.size:"+list.size());
//        System.out.println(list);
//        System.out.println(user);
    }

    @Test
    public void test2() {
        List<Map<String, Object>> list = session.selectList("findAdmin");
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }

    @Test
    public void test3() {
        User user = session.selectOne("findById", 2);
        System.out.println(user);
    }

    @Test
    public void test4() {
        List<Map<String, Object>> list = session.selectList("findCost");
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }

    @Test
    public void test5() {
        Map<String, Object> map = session.selectOne("findCostById", 1);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " :  " + entry.getValue());
        }
//        System.out.println(map);
    }


    @Test
    public void test6() {
        CommonDao dao = session.getMapper(CommonDao.class);
        System.out.println("dao=" + dao);
        int result = dao.updCost("双击6666", 2);
        if (result > 0) System.out.println("修改成功!!!");
        session.commit();
    }

    @Test
    public void test7() {
        Map<String, Object> map = session.selectOne("findByName", "包月");
        System.out.println(map);
    }

    @Test
    public void test8() {
        CommonDao dao = session.getMapper(CommonDao.class);
        Map<String, Object> map = dao.findCostByIdAndName("包月", 6);
        System.out.println(map);
    }

    @Test
    public void test9() {
        int result = session.delete("delCostById", 6);
        System.out.println(result);
    }

    @Test
    public void test10() {
        List<Map<String, Object>> list = dao.testWHERE("AAA",6000);
        System.out.println(list);

//        Map<String, Object> map = session.selectOne("testDual");
//        System.out.println(map);
    }

}
