package org.plok.model.persistence.facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.plok.model.persistence.Song;

/**
 *
 * @author plok
 */
public class SongFacade extends AbstractFacade<Song> {

    @PersistenceContext(unitName = "musichub_pu")
    private EntityManager em;

    public SongFacade() {
        super(Song.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
