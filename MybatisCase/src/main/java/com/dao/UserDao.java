package com.dao;

import com.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by rui on 2017/4/28.
 * Mybatis映射接口
 */
public interface UserDao {
    /**
     * 根据ID查找
     * @param id
     * @return User对象
     */
    User findById(int id);

    /**
     * 根据name模糊查询
     * @param name
     * @return User对象
     */
    User findByName(String name);

    /**
     * 查询全部
     * @return
     */
    List<User> findAll();

    /**
     * 查询全部
     * @return List<Map>
     */
    List<Map<String,Object>> findAllMap();

    /**
     * 插入用户
     * @param user
     */
    void addUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void delUser(int id);

    /**
     * 修改用户，传入多个参数
     * @param name
     * @param id
     */
    void updUser(@Param("name") String name, @Param("id") int id);
}
