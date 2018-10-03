/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.inli.monolith;

import com.opensymphony.xwork2.ActionSupport;
import lk.inli.monolith.delegate.UserDelegate;
import lk.inli.monolith.model.User;

/**
 *
 * @author indika
 */
public class UserAction extends ActionSupport {

    private UserBean userBean = new UserBean();
    private UserDelegate delegate = new UserDelegate();

    @Override
    public String execute() throws Exception {

        return "SUCCESS";
    }

    public String login() throws Throwable {
        if (!this.userBean.getUsername().isEmpty() && !this.userBean.getPassword().isEmpty()) {
            User currUser = this.delegate.getUser(this.userBean.getUsername());

            if (null != currUser & currUser.getPassword().equalsIgnoreCase(this.userBean.getPassword())) {
                return "SUCCESS";
            } else {
                return "ERROR";
            }
        }
        return "ERROR";
    }

    public String createUser() throws Throwable {
        if (!this.userBean.getName().isEmpty() && !this.userBean.getUsername().isEmpty() && !this.userBean.getPassword().isEmpty()) {
            User newUser = new User();
            newUser.setName(this.userBean.getName());
            newUser.setUsername(this.userBean.getUsername());
            newUser.setPassword(this.userBean.getPassword());

            try {
                this.delegate.storeUser(newUser);
                return "SUCCESS";
            } catch (Throwable t) {
                t.printStackTrace();
                return "ERROR";
            }
        }
        return "ERROR";
    }

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }
}
