package com.baizhi.ems.entity;
public class Admin {
    private Integer id;
    private String username;
    private String realname;
    private String pwd;
    private Integer gender;
    public Admin() {
        super();
    }
    public Admin(Integer id,String username,String realname,String pwd,Integer gender) {
        super();
        this.id = id;
        this.username = username;
        this.realname = realname;
        this.pwd = pwd;
        this.gender = gender;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return this.realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", gender=" + gender +
                '}';
    }
}
