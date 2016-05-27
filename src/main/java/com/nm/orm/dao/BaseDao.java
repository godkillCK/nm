package com.nm.orm.dao;

import java.io.Serializable;
import java.util.Collection;

/**
 * 功能说明：TODO
 * @return <br/>
 *         修改历史：<br/>
 *         1.[2016年05月26日上午17:29] 创建方法 by hw
 */
public interface BaseDao<T, U extends Serializable> {
    U insert(T t);

    void saveOrUpdate(T t);

    void insert(Collection<T> objs);

    T findById(U u);

    void delete(T t);

    int deleteAll(T t);

    int deleteById(U u);
}
