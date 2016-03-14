package com.test360.business.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    private Integer sex;

    private Date brithday;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id 
	 *            id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return 用户名
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 
	 *            用户名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password 
	 *            密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    /**
     * java.lang.Object#toString()
     */
    public String toString() {
        return "User [ id=" + id +",   name=" + name +",   password=" + password +",   sex=" + sex +",   brithday=" + brithday + " ] " ;
    }
}