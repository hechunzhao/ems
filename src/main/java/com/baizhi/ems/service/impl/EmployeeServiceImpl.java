package com.baizhi.ems.service.impl;

import com.baizhi.ems.dao.EmployeeDao;
import com.baizhi.ems.entity.Employee;
import com.baizhi.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public long getEmployeeRowCount(){
        return employeeDao.getEmployeeRowCount();
    }
    @Override
    public List<Employee> selectEmployee(){
        return employeeDao.selectEmployee();
    }
    @Override
    public Employee selectEmployeeByObj(Employee obj){
        return employeeDao.selectEmployeeByObj(obj);
    }
    @Override
    public Employee selectEmployeeById(Integer id){
        return employeeDao.selectEmployeeById(id);
    }
    @Override
    public int insertEmployee(Employee value){
        return employeeDao.insertEmployee(value);
    }
    @Override
    public int insertNonEmptyEmployee(Employee value){
        return employeeDao.insertNonEmptyEmployee(value);
    }
    @Override
    public int deleteEmployeeById(Integer id){
        return employeeDao.deleteEmployeeById(id);
    }
    @Override
    public int updateEmployeeById(Employee enti){
        return employeeDao.updateEmployeeById(enti);
    }
    @Override
    public int updateNonEmptyEmployeeById(Employee enti){
        return employeeDao.updateNonEmptyEmployeeById(enti);
    }

    public EmployeeDao getEmployeeDao() {
        return this.employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

}