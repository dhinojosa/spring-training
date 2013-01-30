package com.evolutionnext.jukebox.mvc;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository("artistDAO")
@Transactional
public class ArtistDAO {
    @PersistenceContext
    private EntityManager em;

    public void persist(Artist artist) {
        em.persist(artist);
        System.out.println("~~" + artist.getId());
    }

    public Artist load(long id) {
        return em.find(Artist.class, id);
    }

    public void update(Artist artist) {
        em.merge(artist);
    }
}
