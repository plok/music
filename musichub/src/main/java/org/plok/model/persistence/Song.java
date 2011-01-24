package org.plok.model.persistence;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import org.plok.model.persistence.common.AbstractBaseEntity;

@Entity
public class Song extends AbstractBaseEntity {

    @Basic(optional=false)
    private String title;
    
    @OneToOne(cascade=CascadeType.ALL,orphanRemoval=true)
    private Lyric lyric;

    @Basic(optional=true)
    private Integer tempo;
    
    public Lyric getLyric() {
        return lyric;
    }

    public void setLyric(Lyric lyric) {
        this.lyric = lyric;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
