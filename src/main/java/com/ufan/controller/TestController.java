package com.ufan.controller;

import com.ufan.entity.One;
import com.ufan.service.OneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TestController {

    @Autowired
    private OneService oneService;

    @RequestMapping("hello")
    public String find(Integer id, HttpServletRequest request){
        One one = oneService.find(id);
        request.setAttribute("one", one);
        return "Hello";
    }

/*    public String hello(String name, Model model, HttpServletRequest request) {
        String password = oneService.findPassword(name);
        // request.setAttribute("name", name);
        request.setAttribute("password", password);
        //  model.addAttribute("password", password);
        return "Hello";
    }*/

    @RequestMapping("all")
    public String all(HttpServletRequest request) {
        List<One> one = oneService.findAll();
        request.setAttribute("HelloAll", one);
        return "HelloAll";
    }
}

