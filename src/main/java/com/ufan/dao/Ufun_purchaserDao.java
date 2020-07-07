package com.ufan.dao;

import com.ufan.entity.Ufun_purchaser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Ufun_purchaserDao {
    int changePass(int id, String newPass);
    Ufun_purchaser findAll(@Param("ac") String code);
    int changeState(String state);
}
