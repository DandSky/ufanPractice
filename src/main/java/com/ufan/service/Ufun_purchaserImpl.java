package com.ufan.service;

import com.ufan.dao.Ufun_purchaserDao;
import com.ufan.entity.Ufun_purchaser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ufun_purchaserImpl implements Ufun_purchaserService {

@Autowired
private Ufun_purchaserDao ufun_purchaser;

    @Override
    public int changePassword(int id, String newPass) {
        return ufun_purchaser.changePass(id, newPass);
    }

    @Override
    public Ufun_purchaser findAll(String code) {
        return ufun_purchaser.findAll(code);
    }

    @Override
    public int changeState(String code){
        return ufun_purchaser.changeState(code);
    }

}
