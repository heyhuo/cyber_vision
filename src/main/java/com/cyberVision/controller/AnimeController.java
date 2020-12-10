package com.cyberVision.controller;

import com.cyberVision.entity.AnimeBaseinfo;
//import com.cyberVision.service.imp.AnimeService;
import com.cyberVision.service.imp.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * @author heyhuo
 * @create 2020-12-10
 */
@RestController
public class AnimeController {
    @Autowired
    private AnimeService animeService;

    @RequestMapping(value = "/getAnimeById", method = RequestMethod.GET)
    AnimeBaseinfo getAnimeById(@RequestParam("id") String id) {
        return animeService.selectByPrimaryKey(id);//
    }

    @RequestMapping(value = "/getAnimeList", method = RequestMethod.GET)
    List<AnimeBaseinfo> getAnimeList() {
        return animeService.selectAll();//
    }

    @RequestMapping(value = "createAnime", method = RequestMethod.GET)
    AnimeBaseinfo createAnime() {
        return null;
    }

}
