/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.inli.monolith.ejb;

import javax.ejb.Stateless;
import lk.inli.monolith.dao.hibernate.HibernateUserDao;
import lk.inli.monolith.model.User;

/**
 *
 * @author indika
 */
@Stateless(name = "UserBean")
public class UserSessionBean implements LocalUserSession {

    @Override
    public User getUser(String username) throws Throwable {
        return HibernateUserDao.getInstance().getUser(username);
    }

    @Override
    public void storeUser(User user) throws Throwable {
        HibernateUserDao.getInstance().storeUser(user);
    }

}
