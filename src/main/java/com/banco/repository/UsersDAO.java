/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.repository;


import com.banco.model.Users;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Order;

/**
 * CRUD
 * @author fedec
 */

public class UsersDAO {

    //CURD 
    public List<Users> getAll() {

        List<Users> lst = new ArrayList<Users>();

        Session s = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            s.beginTransaction();
            // DISTINCT_ROOT_ENTITY para que no repita valores id por las cascadas
            lst = s.createCriteria(Users.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }

        return lst;
    }

    // Create 
    public void create(Users user) {

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
    public void remove(Users user) {

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
    public void update(Users user) {

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
    public void edit(Users user) {

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

    public Users getUser(long id) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Users user = new Users();
        try {
            s.beginTransaction();
            user = (Users) s.get(Users.class, id);
            s.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        return user;
    }

    public Users getUserByUsername(String name) {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Users user = null;

        try {
            s.beginTransaction();

            Query query = s.createQuery("FROM entity.Users WHERE username='" + name + "'");
            user = (Users) query.uniqueResult();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }

        return user;
    }

    //Verificar 
    public boolean verificar(String userId, String password) {

        Users user = getUserByUsername(userId);

        if (user != null && user.getUsername().equals(userId) && user.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    //Verificar 
    public boolean verificarUsuario(String userId) {
        Users user = getUserByUsername(userId);

        if (user != null) {
            return true;

        } else {
            return false;
        }
    }
}
