/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.inli.monolith.ejb;

import javax.ejb.Local;
import lk.inli.monolith.model.User;

/**
 *
 * @author indika
 */
@Local
public interface LocalUserSession {
    public User getUser(String username) throws Throwable;
    
    public void storeUser(User user) throws Throwable;
}
