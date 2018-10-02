/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.inli.monolith;

import com.opensymphony.xwork2.ActionSupport;
import lk.inli.monolith.delegate.HelloDelegate;

/**
 *
 * @author indika
 */
public class HelloAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        messageStore = new MessageStore() ;
        
        if (!getName().isEmpty()) {
            HelloDelegate delegate = new HelloDelegate();
            getMessageStore().setMessage(delegate.getMessage(getName()));
            return "SUCCESS";
        } else {
            return "ERROR";
        }
    }

    //Java Bean to hold the form parameters
    private String name;
    private MessageStore messageStore;

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
