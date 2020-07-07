package com.ufan.service;

import com.ufan.entity.One;
import java.util.List;

public interface OneService {
    List<One> findAll();
    One find(Integer id);
    String findPassword(String name);
}
