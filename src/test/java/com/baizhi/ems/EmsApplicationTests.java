package com.baizhi.ems;

import com.baizhi.ems.controller.AdminController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmsApplicationTests {
    @Autowired
    com.baizhi.ems.service.AdminService adminService;
    @Autowired
    AdminController adminController;
    @Test
    public void contextLoads() {
        System.out.println(adminService.selectAdminById(1));
    }
    @Test
    public void login() {
        System.out.println(adminController.login("hcc","123"));
    }
}
