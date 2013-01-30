package com.evolutionnext.jukebox.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 11/16/11
 * Time: 12:43 PM
 */
@Controller
@RequestMapping("/zoo")
public class ViewAnotherArtistBean {

    @RequestMapping(value = "/zar", method = RequestMethod.GET)
    public String seekMeals(@RequestParam("nid") String nid, Model model) {
        model.addAttribute("foo", new Artist("Fajita", "Tacos"));
        return "nice";
    }
}
