package com.ufan.service;

import com.ufan.dao.OneDao;
import com.ufan.entity.One;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OneServiceImpl implements OneService {
    @Autowired
    private OneDao oneDao;

    @Override
    public List<One> findAll() {
        return oneDao.findAll();
    }

    @Override
    public String findPassword(String name) {
        return oneDao.findPassword(name);
    }

    @Override
    public One find(Integer id) {
        return oneDao.find(id);
    }
}
