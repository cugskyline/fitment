package com.zuoan.account.model;

import java.util.Date;

/**
 * Created by XUJY on 2016/1/19.
 */
public class BaseDO {
    private Integer isdeleted;      //删除标记位
    private Date createdTime;       //创建时间
    private Date updatedTime;       //修改时间
    private Date currentTime;       //(数据库）当前日期

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }
}
