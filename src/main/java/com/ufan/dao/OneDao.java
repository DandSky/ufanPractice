package com.ufan.dao;

import com.ufan.entity.One;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OneDao {
    List<One> findAll();
    One find(Integer id);
    String findPassword(String name);
}
