package com.test360.business.model;

import java.io.Serializable;

public class Manager implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 管理员用户名
     */
    private String name;

    /**
     * 管理员密码
     */
    private String password;

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
     * @return 管理员用户名
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 
	 *            管理员用户名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 管理员密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password 
	 *            管理员密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * java.lang.Object#toString()
     */
    public String toString() {
        return "Manager [ id=" + id +",   name=" + name +",   password=" + password + " ] " ;
    }
}