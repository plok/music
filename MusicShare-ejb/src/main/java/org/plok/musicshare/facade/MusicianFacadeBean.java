/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.plok.musicshare.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.plok.musicshare.model.Musician;

/**
 *
 * @author jorrit
 */
@Stateless
public class MusicianFacadeBean extends AbstractFacade<Musician> implements MusicianFacadeLocal, MusicianFacadeRemote {
    @PersistenceContext(unitName = "org.plok.musicshare.pu")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public MusicianFacadeBean() {
        super(Musician.class);
    }

}
