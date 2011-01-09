/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.plok.musicshare.facade;

import javax.ejb.Remote;
import java.util.List;

import org.plok.musicshare.model.Musician;

/**
 * @author jorrit
 */
@Remote
public interface MusicianFacadeRemote
{

	void create(Musician musician);

	void edit(Musician musician);

	void remove(Musician musician);

	Musician find(Object id);

	List<Musician> findAll();

	List<Musician> findRange(int[] range);

	int count();

}
