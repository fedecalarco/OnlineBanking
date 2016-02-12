/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.DAO;

import com.banco.model.User;
import org.hibernate.Session;

/**
 *
 * @author Training.AAFLP.14
 */
public class UserDAOImpl implements UserDAO {

    @Override
    public void create(User user) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            s.beginTransaction();
            s.save(user);
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
    }

    @Override
    public void remove(User user) {
    }

    @Override
    public void update(User user) {
    }

    @Override
    public void delete(User user) {
    }

}
