package com.test360.business.model;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 员工工号
     */
    private String number;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 员工微信号
     */
    private String wechat;

    /**
     * 员工手机号
     */
    private String phone;

    /**
     * 余额
     */
    private Integer balance;

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
     * @return 员工工号
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number 
	 *            员工工号
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return 员工姓名
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 
	 *            员工姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 员工微信号
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * @param wechat 
	 *            员工微信号
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    /**
     * @return 员工手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone 
	 *            员工手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return 余额
     */
    public Integer getBalance() {
        return balance;
    }

    /**
     * @param balance 
	 *            余额
     */
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    /**
     * java.lang.Object#toString()
     */
    public String toString() {
        return "User [ id=" + id +",   number=" + number +",   name=" + name +",   wechat=" + wechat +",   phone=" + phone +",   balance=" + balance + " ] " ;
    }
}