/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.daos;

import com.banco.model.User;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fedec
 */
@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void create(User user) {
        getCurrentSession().save(user);
    }


    @Override
    public void update(User user) {
        getCurrentSession().update(user);
        
    }
    

    @Override
    public void delete(User user) {
        getCurrentSession().delete(user);
    }

    @Override
    public User getUserByUsername(String username) {
        return (User) getCurrentSession().createQuery("FROM com.banco.model.User WHERE username='" + username + "'").uniqueResult();
    }

    @Override
    public List<User> getAll() {
        List<User> lst = new ArrayList<User>();
        lst = getCurrentSession().createCriteria(User.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
        return lst;
    }

    @Override
    public User getUserById(long id) {
    User user = (User) getCurrentSession().get(User.class, id);
    return user;
    }

}
