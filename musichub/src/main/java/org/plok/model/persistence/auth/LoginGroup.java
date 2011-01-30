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
public class LoginGroup extends AbstractBaseEntity{

    private String username;
    private String groupname;

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
