package com.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by rui on 2017/4/28.
 * mybatis映射接口
 */
public interface CommonDao {
    int updCost(@Param("name") String name, @Param("id") int id);

    Map<String, Object> findCostByIdAndName(@Param("name") String name, @Param("id") int id);

    List<Map<String, Object>> findAllAdmin(@Param("name") String name, @Param("id") int id);

    List<Map<String,Object>> testEL(@Param("name") String name ,@Param("pwd") String password,@Param("id") int id);

    List<Map<String,Object>> testWHERE(@Param("name") String name ,@Param("id") int id);
}
