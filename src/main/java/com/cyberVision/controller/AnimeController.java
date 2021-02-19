//package com.cyberVision.controller;
//
//import com.cyberVision.entity.AnimeBaseinfo;
////import com.cyberVision.service.imp.AnimeService;
//import com.cyberVision.service.imp.AnimeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//import java.util.Optional;
//
///**
// * @author heyhuo
// * @create 2020-12-10
// */
//@RestController
//public class AnimeController {
//    @Autowired
//    private AnimeService animeService;
//
//    @RequestMapping(value = "hello")
//    String getHello(){
//        return "hello";
//    }
//    @RequestMapping(value = "test")
//    String test(){
//        return "test";
//    }
//
//    @RequestMapping(value = "/getAnimeById", method = RequestMethod.GET)
//    AnimeBaseinfo getAnimeById(@RequestParam("id") String id) {
//        return animeService.selectByPrimaryKey(id);//
//    }
//
//    @RequestMapping(value = "/getAnimeList", method = RequestMethod.GET)
//    String getAnimeList() {
//        List<AnimeBaseinfo> list = animeService.selectAll();
//        StringBuffer imgStr = new StringBuffer("<h3></h3>");
//        for (AnimeBaseinfo a : list) {
//            String id = a.getId();
//            imgStr.append("<img id='" + id + "' style='box-shadow: 10px 10px 15px #aeaeaeae;margin:10px;color:#fff;border:5px solid;border-radius:30px;,height:200;width:200;' src='data:image/jpeg;base64," + a.getImg() + "'/>");
//        }
//        return imgStr.toString();//
//    }
//
//    @RequestMapping(value = "createAnime", method = RequestMethod.GET)
//    AnimeBaseinfo createAnime() {
//        return null;
//    }
//
//}
