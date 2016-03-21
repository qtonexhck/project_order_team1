package com.test360.business.model;

import java.io.Serializable;
import java.util.Date;

public class Rechargeable implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 员工ID
     */
    private Integer userid;

    /**
     * 充值时间
     */
    private Date time;

    /**
     * 充值金额
     */
    private Integer money;

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
     * @return 充值时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * @param time 
	 *            充值时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * @return 充值金额
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * @param money 
	 *            充值金额
     */
    public void setMoney(Integer money) {
        this.money = money;
    }

    /**
     * java.lang.Object#toString()
     */
    public String toString() {
        return "Rechargeable [ id=" + id +",   userid=" + userid +",   time=" + time +",   money=" + money + " ] " ;
    }
}