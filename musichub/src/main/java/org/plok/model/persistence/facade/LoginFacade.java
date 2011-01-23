/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.plok.model.persistence.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.plok.model.persistence.auth.Login;

/**
 *
 * @author jorrit
 */
@Stateless
public class LoginFacade extends AbstractFacade<Login> {

    @PersistenceContext(unitName = "musichub_pu")
    private EntityManager em;

    public LoginFacade() {
        super(Login.class);
        
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
