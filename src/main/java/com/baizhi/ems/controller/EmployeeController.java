package com.baizhi.ems.controller;

import com.baizhi.ems.entity.Employee;
import com.baizhi.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/showAll")
    public String showAll(Map map) {
        List<Employee> employees = employeeService.selectEmployee();
        map.put("employees",employees);
        return  "forward:/emplist.jsp";
    }

    @RequestMapping("/add")
    public String add(Employee employee) {
        employeeService.insertNonEmptyEmployee(employee);
        return "forward:/employee/showAll";
    }

    @RequestMapping("/delete")
    public String delete(int id) {
        employeeService.deleteEmployeeById(id);
        return "forward:/employee/showAll";
    }

    @RequestMapping("/showById")
    public String update(int id,Map map) {
        Employee employee1 = employeeService.selectEmployeeById(id);
        map.put("employee",employee1);
        return "forward:/updateEmp.jsp";
    }

    @RequestMapping("/update")
    public String update(Employee employee) {
        employeeService.updateNonEmptyEmployeeById(employee);
        return "forward:/employee/showAll";
    }
}
