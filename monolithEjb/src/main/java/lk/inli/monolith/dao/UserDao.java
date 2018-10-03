/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.inli.monolith.dao;

import javax.persistence.PersistenceException;
import lk.inli.monolith.model.User;

/**
 *
 * @author indika
 */
public interface UserDao {
    public User getUser(String username) throws PersistenceException;
    
    public void storeUser(User user) throws PersistenceException;
}
