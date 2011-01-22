/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.plok.model.persistence.auth;

import javax.persistence.Entity;
import org.plok.model.persistence.common.AbstractBaseEntity;

/**
 *
 * @author jorrit
 */
@Entity
public class Login extends AbstractBaseEntity {

    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
}
