/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.plok.model.persistence.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.plok.model.persistence.auth.LoginGroup;

/**
 *
 * @author jorrit
 */
@Stateless
public class LoginGroupFacade extends AbstractFacade<LoginGroup> {

    @PersistenceContext(unitName = "musichub_pu")
    private EntityManager em;

    public LoginGroupFacade() {
        super(LoginGroup.class);
        
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
