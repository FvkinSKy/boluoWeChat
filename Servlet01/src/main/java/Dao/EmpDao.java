package Dao;

import entity.Emp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a07 on 2017/2/13.
 */
public class EmpDao {
    public void save(Emp emp){
        System.out.println("插入数据");
    }


    public List<Emp> findAll(){
        List<Emp> list=new ArrayList<Emp>();
        Emp emp1=new Emp("波多野结衣","女",10);
        Emp emp2=new Emp("苍老师","女",20);
        Emp emp3=new Emp("松岛枫","女",30);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        return list;
    }
}
