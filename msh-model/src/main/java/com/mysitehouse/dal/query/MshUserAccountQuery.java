package com.mysitehouse.dal.query;

import java.io.Serializable;
import java.util.Date;
import com.mysitehouse.dal.query.BaseQuery;

/**
 * MshUserAccountQuery
 *
 * User: sanxiu
 * Date: 2016-03-27 10:09:58
 * Generate by autoQuery
 * Powered by duxing@Taobao
 */

public class MshUserAccountQuery extends BaseQuery{
    private static final long serialVersionUID = -1L;

    /**
     * id
     */
    private Long id;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 最后修改时间
     */
    private Date gmtModified;
    /**
     * 登录账户
     */
    private String account;
    /**
     * 登录密码
     */
    private String password;
    /**
     * 账户状态
     */
    private Long status;
    /**
     * 扩展特性
     */
    private String feature;
    /**
     * 备注
     */
    private String remark;

    /**
     * id getter & setter
     */
    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    /**
     * gmtCreate getter & setter
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }
    public void setGmtCreate(Date gmtCreate){
        this.gmtCreate = gmtCreate;
    }

    /**
     * gmtModified getter & setter
     */
    public Date getGmtModified() {
        return gmtModified;
    }
    public void setGmtModified(Date gmtModified){
        this.gmtModified = gmtModified;
    }

    /**
     * account getter & setter
     */
    public String getAccount() {
        return account;
    }
    public void setAccount(String account){
        this.account = account;
    }

    /**
     * password getter & setter
     */
    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * status getter & setter
     */
    public Long getStatus() {
        return status;
    }
    public void setStatus(Long status){
        this.status = status;
    }

    /**
     * feature getter & setter
     */
    public String getFeature() {
        return feature;
    }
    public void setFeature(String feature){
        this.feature = feature;
    }

    /**
     * remark getter & setter
     */
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark){
        this.remark = remark;
    }

}