/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.plok.model.persistence;

import javax.persistence.Basic;
import javax.persistence.Entity;

import org.plok.model.persistence.common.AbstractBaseEntity;


@Entity
public class Musician extends  AbstractBaseEntity {
    private static final long serialVersionUID = 1L;
    
    @Basic(optional=false)
    private String userName;
    
    @Basic(optional=false)
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
