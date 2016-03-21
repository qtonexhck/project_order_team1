package com.test360.business.model;

import java.io.Serializable;
import java.util.Date;

public class Consumption implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 领餐地点
     */
    private String area;

    /**
     * 消费时间
     */
    private Date time;

    /**
     * 消费金额
     */
    private Integer money;

    /**
     * 员工ID
     */
    private Integer userid;

    /**
     * 餐名
     */
    private String meal;

    /**
     * 领餐状态
     */
    private String status;

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
     * @return 领餐地点
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area 
	 *            领餐地点
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return 消费时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * @param time 
	 *            消费时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * @return 消费金额
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * @param money 
	 *            消费金额
     */
    public void setMoney(Integer money) {
        this.money = money;
    }

    /**
     * @return 员工ID
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid 
	 *            员工ID
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return 餐名
     */
    public String getMeal() {
        return meal;
    }

    /**
     * @param meal 
	 *            餐名
     */
    public void setMeal(String meal) {
        this.meal = meal;
    }

    /**
     * @return 领餐状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status 
	 *            领餐状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * java.lang.Object#toString()
     */
    public String toString() {
        return "Consumption [ id=" + id +",   area=" + area +",   time=" + time +",   money=" + money +",   userid=" + userid +",   meal=" + meal +",   status=" + status + " ] " ;
    }
}