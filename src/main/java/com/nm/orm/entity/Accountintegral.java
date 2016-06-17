package com.nm.orm.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年06月17日上午21:05] 创建方法 by hw
 */
@Entity
public class Accountintegral {
    private String id;
    private Timestamp occurDate;
    private Integer content;
    private Integer classify;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "occurDate")
    public Timestamp getOccurDate() {
        return occurDate;
    }

    public void setOccurDate(Timestamp occurDate) {
        this.occurDate = occurDate;
    }

    @Basic
    @Column(name = "content")
    public Integer getContent() {
        return content;
    }

    public void setContent(Integer content) {
        this.content = content;
    }

    @Basic
    @Column(name = "classify")
    public Integer getClassify() {
        return classify;
    }

    public void setClassify(Integer classify) {
        this.classify = classify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Accountintegral that = (Accountintegral) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (occurDate != null ? !occurDate.equals(that.occurDate) : that.occurDate != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (classify != null ? !classify.equals(that.classify) : that.classify != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (occurDate != null ? occurDate.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (classify != null ? classify.hashCode() : 0);
        return result;
    }
}
