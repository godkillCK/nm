package com.nm.orm.entity;

import javax.persistence.*;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年06月06日上午15:44] 创建方法 by hw
 */
@Entity
@Table(name = "account_oauth", schema = "nm", catalog = "")
public class AccountOauth {
    private String id;
    private String authId;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "authId")
    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountOauth that = (AccountOauth) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (authId != null ? !authId.equals(that.authId) : that.authId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (authId != null ? authId.hashCode() : 0);
        return result;
    }
}
