/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.plok.model.persistence;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import org.plok.model.persistence.common.AbstractBaseEntity;

/**
 *
 * @author jorrit
 */
@Entity
public class Lyric extends AbstractBaseEntity{

    @OneToOne(mappedBy="lyric")
    private Song song;

    private String text;

    public Song getSong() {
        return song;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
