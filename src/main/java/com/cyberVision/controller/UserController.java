package com.cyberVision.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cyberVision.entity.UserPostDetail;
import com.cyberVision.entity.UserPostDetailExample;
import com.cyberVision.service.imp.UserPostDetailService;
import com.cyberVision.utils.Utils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @author heyhuo
 * @create 2021-02-18
 */
@RestController
@RequestMapping("/user")
@CrossOrigin//跨域
//    @Slf4j
public class UserController {


    @Autowired
    private UserPostDetailService userPostDetailService;

    @PostMapping("/postUserItem")
    public Map<String, Object> postUserItem(@RequestParam("multipartFiles[]") List<MultipartFile> multipartFiles,
                                            @RequestParam("postModel") String detail) throws IOException {

        UserPostDetail postModel = JSON.parseObject(detail, UserPostDetail.class);
        System.out.println("requestParam:" + multipartFiles.size());
        System.out.println("detail:" + detail);
        userPostDetailService.insert(postModel);

        String picBasePath = postModel.getPicBasePath();

        int idx = 0;
//        String baseDir = postModel
        for (MultipartFile multipartFile :
                multipartFiles) {
            BufferedImage image = ImageIO.read(multipartFile.getInputStream());

//            String extention ="."+ multipartFile.getContentType().split("/")[1];
//            UUID uuid = UUID.randomUUID();
            // 根路径，在 resources/static/upload
            String basePath = ResourceUtils.getURL("classpath:").getPath() + "static/";

            Map<String, Object> picPathMap = JSON.parseObject(JSON.parseArray(postModel.getPicPathList()).get(idx++).toString());

//            String dateNowStr = Utils.getDateNow("yyyyMMdd");

            // 创建新的文件
            String dirName = basePath + picBasePath;
            File fileExist = new File(dirName);
            // 文件夹不存在，则新建
            if (!fileExist.exists()) {
                fileExist.mkdirs();
            }
            File outputFile = new File(dirName + "/" + picPathMap.get("name"));
            if (!outputFile.exists())
                ImageIO.write(image, "jpg", outputFile);
        }


        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        return map;
    }

    @PostMapping("/getPostItemList")
    public Map<String, Object> getPostItemList(@RequestBody Map<String, String> params) {
        List<UserPostDetail> detailList = userPostDetailService.selectByPage(params);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("result", detailList);

        return map;
    }
}
