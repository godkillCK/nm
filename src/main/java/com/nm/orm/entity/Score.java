package com.nm.orm.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年06月17日上午21:05] 创建方法 by hw
 */
@Entity
public class Score {
    private String id;
    private String content;
    private Integer fraction;

    @Basic
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "fraction")
    public Integer getFraction() {
        return fraction;
    }

    public void setFraction(Integer fraction) {
        this.fraction = fraction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Score score = (Score) o;

        if (id != null ? !id.equals(score.id) : score.id != null) return false;
        if (content != null ? !content.equals(score.content) : score.content != null) return false;
        if (fraction != null ? !fraction.equals(score.fraction) : score.fraction != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (fraction != null ? fraction.hashCode() : 0);
        return result;
    }
}
