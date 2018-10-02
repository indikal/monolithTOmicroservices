/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.inli.monolith.ejb;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Indika Liyanage
 */
@Stateless (name = "HelloBean")
@LocalBean
public class HelloSessionBean implements HelloSession {

    @Override
    public String getMessage(String name) {
        return "Welcome to monolith, " + name;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
