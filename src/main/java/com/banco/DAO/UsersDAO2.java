/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.DAO;


import com.banco.model.User;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * CRUD
 * @author fedec
 */

public class UsersDAO2 {

    //CURD 
    public List<User> getAll() {

        List<User> lst = new ArrayList<User>();

        Session s = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            s.beginTransaction();
            // DISTINCT_ROOT_ENTITY para que no repita valores id por las cascadas
            lst = s.createCriteria(User.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }

        return lst;
    }

    // Create 
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

    // Remove
    public void remove(User user) {

        Session s = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            s.beginTransaction();
            s.delete(user);
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
    }

    // Update
    public void update(User user) {

        Session s = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            s.beginTransaction();
            s.update(user);
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
    }

    // edit
    public void edit(User user) {

        Session s = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            s.beginTransaction();
            s.update(user);
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
    }

    public User getUser(long id) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        User user = new User();
        try {
            s.beginTransaction();
            user = (User) s.get(User.class, id);
            s.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        return user;
    }

    public User getUserByUsername(String name) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        User user = null;

        try {
            s.beginTransaction();

            Query query = s.createQuery("FROM entity.Users WHERE username='" + name + "'");
            user = (User) query.uniqueResult();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }

        return user;
    }

    //Verificar 
    public boolean verificar(String userId, String password) {

        User user = getUserByUsername(userId);

        if (user != null && user.getUsername().equals(userId) && user.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    //Verificar 
    public boolean verificarUsuario(String userId) {
        User user = getUserByUsername(userId);

        if (user != null) {
            return true;

        } else {
            return false;
        }
    }
}
