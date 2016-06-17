package com.nm.orm.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年06月06日上午15:44] 创建方法 by hw
 */
@Entity
public class Article {
    private String id;
    private String title;
    private byte[] content;
    private Integer heat;
    private Integer support;
    private Integer hate;
    private Integer see;
    private Timestamp createDate;
    private Timestamp modifyDate;
    private Integer status;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "content")
    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Basic
    @Column(name = "heat")
    public Integer getHeat() {
        return heat;
    }

    public void setHeat(Integer heat) {
        this.heat = heat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (id != null ? !id.equals(article.id) : article.id != null) return false;
        if (title != null ? !title.equals(article.title) : article.title != null) return false;
        if (!Arrays.equals(content, article.content)) return false;
        if (heat != null ? !heat.equals(article.heat) : article.heat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(content);
        result = 31 * result + (heat != null ? heat.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "support")
    public Integer getSupport() {
        return support;
    }

    public void setSupport(Integer support) {
        this.support = support;
    }

    @Basic
    @Column(name = "hate")
    public Integer getHate() {
        return hate;
    }

    public void setHate(Integer hate) {
        this.hate = hate;
    }

    @Basic
    @Column(name = "see")
    public Integer getSee() {
        return see;
    }

    public void setSee(Integer see) {
        this.see = see;
    }

    @Basic
    @Column(name = "createDate")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "modifyDate")
    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
