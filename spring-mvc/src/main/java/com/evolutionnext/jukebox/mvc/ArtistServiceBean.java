package com.evolutionnext.jukebox.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class ArtistServiceBean {
    private ArtistDAO artistDAO;

    @RequestMapping(value = "/fav", method = RequestMethod.GET)
    public String showRight(Map<String, Object> model) {
        System.out.println("wow");
        model.put("favoriteArtist", new Artist("Al", "Jourgensen"));
        return "favorite-artist";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showLeft() {
        return "home";
    }

    @Autowired
    public void setArtistDAO(ArtistDAO artistDAO) {
        this.artistDAO = artistDAO;
    }

    @RequestMapping(value = "/ffd", method = RequestMethod.GET)
    public String showZen(@RequestParam("id") Long id, Map<String, Object> model) {
        model.put("favoriteArtist", artistDAO.load(id));
        return "favorite-artist";
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newArtist(Map<String, Object> model) {
        model.put("newArtist", new Artist());
        return "create";
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String addArtist(@Valid Artist artist,
                                     BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "edit";
        }
        System.out.println("Neat");
        artistDAO.persist(artist);

        return "redirect:/view/" + artist.getId();
    }

    @RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
    public String view(@PathVariable Long id, Map<String, Object> model) {
        System.out.println("Got id" + id);
        model.put("artist", artistDAO.load(id));
        return "view";
    }

    @RequestMapping(value = "/artist/{id}.json", method = RequestMethod.GET)
    public String showInJSON(@PathVariable Long id, Map<String, Object> model) {
        System.out.println("Got id" + id);
        model.put("artist", artistDAO.load(id));
        return "artist";
    }


}
