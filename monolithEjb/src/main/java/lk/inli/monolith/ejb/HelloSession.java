/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.inli.monolith.ejb;

import javax.ejb.Local;

/**
 *
 * @author indika
 */

@Local
public interface HelloSession {
    String getMessage(String name);
}
