/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.inli.monolith.delegate;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import lk.inli.monolith.ejb.HelloSession;
import lk.inli.monolith.ejb.HelloSessionBean;

/**
 *
 * @author indika
 */
public class HelloDelegate {

    @EJB (lookup = "java:app/monolithEjb/HelloBean!lk.inli.monolith.ejb.HelloSession")
    HelloSession helloBean;

    public HelloDelegate() {
        try {
            this.helloBean = (HelloSession) InitialContext.doLookup("java:app/monolithEjb/HelloBean!lk.inli.monolith.ejb.HelloSession");
        } catch (NamingException ex) {
            ex.printStackTrace();
        }
    }

    public String getMessage(String name) throws NamingException {
        return helloBean.getMessage(name);
    }
}
