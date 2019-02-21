package com.baizhi.ems.controller;

import com.baizhi.ems.entity.Admin;
import com.baizhi.ems.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminServiceImpl adminService;

    /*登陆*/
    @RequestMapping("/login")
    public String login(String username, String pwd) {
        Admin admin = new Admin();
        admin.setUsername(username);
        Admin result = adminService.selectAdminByObj(admin);
        if (result != null) {
            if (pwd.equals(result.getPwd())) {
                System.out.println("controller login");
                return "forward:/employee/showAll";
            } else {
                return "forward:/login.jsp";
            }
        } else {
            System.out.println("controller login");
            return "forward:/login.jsp";
        }
    }

    /*注册*/
    @RequestMapping("/regist")
    public String regist(Admin admin, String code, HttpSession session) {
        System.out.println(admin);
        if (code.equals(session.getAttribute("code"))) {
            System.out.println("验证码对了！");
            adminService.insertNonEmptyAdmin(admin);
            return "forward:/login.jsp";
        } else {
            return "forward:/regist.jsp";
        }
    }
}
