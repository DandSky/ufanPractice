package com.ufan.service;

import com.ufan.entity.Ufun_purchaser;

public interface Ufun_purchaserService {
    int changePassword(int id, String newPass);
    Ufun_purchaser findAll(String code);
    int changeState(String code);
}
