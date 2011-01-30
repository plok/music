package org.plok.model.persistence.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.plok.model.persistence.Musician;

/**
 *
 * @author jorrit
 */
@Stateless
public class MusicianFacade extends AbstractFacade<Musician> {
    @PersistenceContext(unitName = "musichub_pu")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public MusicianFacade() {
        super(Musician.class);
    }

}
