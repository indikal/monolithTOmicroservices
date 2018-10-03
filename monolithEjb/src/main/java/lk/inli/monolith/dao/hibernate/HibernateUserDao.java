/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.inli.monolith.dao.hibernate;

import java.util.List;
import javax.persistence.NoResultException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.PersistenceException;
import lk.inli.monolith.dao.UserDao;
import lk.inli.monolith.model.User;
import org.hibernate.query.Query;

/**
 *
 * @author indika
 */
public class HibernateUserDao implements UserDao {

    private final SessionFactory sessionFactory;
    private static final HibernateUserDao anInstance = new HibernateUserDao();

    private HibernateUserDao() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public synchronized static HibernateUserDao getInstance() {
        return anInstance;
    }

    @Override
    public User getUser(String username) throws PersistenceException {
        System.out.println("-- get user by username --");
        User user = null;
        Session session = sessionFactory.openSession();

        Query query = session.createQuery("FROM User WHERE username = :username", User.class);
        query.setParameter("username", username);

        try {
            List list = query.getResultList();
            user = (User) list.get(0);
        } catch (NoResultException e) {
            user = null;
        }
        session.close();

        return user;
    }

    @Override
    public void storeUser(User user) throws PersistenceException {
        System.out.println("-- persisting user --");

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }

}
