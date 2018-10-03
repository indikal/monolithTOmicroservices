/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.inli.monolith.delegate;

import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import lk.inli.monolith.ejb.LocalUserSession;
import lk.inli.monolith.model.User;

/**
 *
 * @author indika
 */
public class UserDelegate {
    @EJB
    LocalUserSession userBean;

    public UserDelegate() {
        try {
            this.userBean = (LocalUserSession) InitialContext.doLookup("java:app/monolithEjb/UserBean!lk.inli.monolith.ejb.LocalUserSession");
        } catch (NamingException ex) {
            ex.printStackTrace();
        }
    }
    
    public User getUser(String username) throws Throwable {
        return this.userBean.getUser(username);
    }
    
    public void storeUser(User user) throws Throwable {
        this.userBean.storeUser(user);
    }
}
