/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.plok.web.beans;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.plok.model.persistence.Musician;
import org.plok.model.persistence.facade.MusicianFacade;

/**
 *
 * @author plok
 * 
 */
@ManagedBean
@ViewScoped
public class MusicianBean implements Serializable {

    @EJB
    private MusicianFacade musicianFacade;

    public long getMusicianCount() {
        return musicianFacade.count();
    }

    public List<Musician> getMusicians(){
        return musicianFacade.findRange(0,10);
    }
    
    
    
    
}
