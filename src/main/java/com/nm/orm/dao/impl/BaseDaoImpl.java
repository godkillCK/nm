package com.nm.orm.dao.impl;

import java.io.Serializable;
import java.util.Collection;

import com.nm.orm.common.DaoConstants;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.nm.orm.dao.BaseDao;

/**
 * 功能说明：TODO
 * @return <br/>
 *         修改历史：<br/>
 *         1.[2016年05月26日上午17:38] 创建方法 by hw
 */
public class BaseDaoImpl<T, U extends Serializable> implements BaseDao<T,U> {

    @Autowired
    private SessionFactory sessionFactory;

    private Class<T> entityClass;

    private String tableName;

    private BaseDaoImpl(Class<T> entityClass) {
        this.entityClass = entityClass;
        this.tableName = entityClass.getSimpleName();
    }

    public U insert(T o) {
        return (U) this.getCurrentSession().save(o);
    }

    public void saveOrUpdate(T o) {
        this.getCurrentSession().saveOrUpdate(o);
    }

    public void insert(Collection<T> objs) {
        int i = 0;
        Session session = getCurrentSession();
        for (T t : objs) {
            session.save(t);
            i++;
            if (i % DaoConstants.BATCH_SIZE == 0) {
                session.flush();
                session.clear();
            }
        }
    }

    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public T findById(U id) {
        return (T) getCurrentSession().get(this.entityClass, id);
    }
}
