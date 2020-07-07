package com.ufan.controller;

import com.ufan.entity.Ufun_purchaser;
import com.ufan.service.Ufun_purchaserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PurchaserController {

    @Autowired
    Ufun_purchaserService ufun;

    @RequestMapping("ufun2")
    public String changePassword(int id, String newPass) {
        int tag = ufun.changePassword(id, newPass);
        if(tag > 0){
            System.out.println("密码更改成功！");
            return "HelloUfun";
        } else {
            System.out.println("密码更改失败");
            return "";
        }
    }

    @GetMapping("ufun")
    public String findAll(){
        return "HelloUfun";
    }

//    @RequestMapping("ufun")
    @PostMapping("ufun")
    public String findAll(String code, HttpServletRequest request){
        Ufun_purchaser user = ufun.findAll(code);
        request.setAttribute("user", user);
        return "HelloUfun";
    }

    @RequestMapping("ufun")
    public String change(String code){
        int tag = ufun.changeState("成功");
        if(tag > 0){
            System.out.println("更新状态成功！");
            return "HelloUfun";
        } else {
            System.out.println("更新状态失败");
            return "redirect: ufun";
        }
    }


}
