package com.baizhi.ems.service.impl;

import com.baizhi.ems.dao.AdminDao;
import com.baizhi.ems.entity.Admin;
import com.baizhi.ems.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Override
    public long getAdminRowCount(){
        return adminDao.getAdminRowCount();
    }
    @Override
    public List<Admin> selectAdmin(){
        return adminDao.selectAdmin();
    }
    @Override
    public Admin selectAdminByObj(Admin obj){
        return adminDao.selectAdminByObj(obj);
    }
    @Override
    public Admin selectAdminById(Integer id){
        return adminDao.selectAdminById(id);
    }
    @Override
    public int insertAdmin(Admin value){
        return adminDao.insertAdmin(value);
    }
    @Override
    public int insertNonEmptyAdmin(Admin value){
        return adminDao.insertNonEmptyAdmin(value);
    }
    @Override
    public int deleteAdminById(Integer id){
        return adminDao.deleteAdminById(id);
    }
    @Override
    public int updateAdminById(Admin enti){
        return adminDao.updateAdminById(enti);
    }
    @Override
    public int updateNonEmptyAdminById(Admin enti){
        return adminDao.updateNonEmptyAdminById(enti);
    }

    public AdminDao getAdminDao() {
        return this.adminDao;
    }

    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

}