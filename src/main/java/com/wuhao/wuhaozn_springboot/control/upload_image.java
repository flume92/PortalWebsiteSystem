package com.wuhao.wuhaozn_springboot.control;


import cn.hutool.core.io.FileUtil;
import com.wuhao.wuhaozn_springboot.server.image_service;
import com.wuhao.wuhaozn_springboot.util.StateUtil;
import com.wuhao.wuhaozn_springboot.util.Uploadimage_load;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class upload_image {



    @PostMapping("/upload_image")
    @ResponseBody
    public Uploadimage_load upload_image(@RequestParam(value = "file") MultipartFile file, Model model) throws IOException {
        if(!file.isEmpty()) {

            String file_name = file.getOriginalFilename();
            String fuffixname = file_name.substring(file_name.lastIndexOf("."));


            String path = System.getProperty("user.dir") + "/image_out/layuimini/image_out/";

            if(!FileUtil.exist(path)) {
                FileUtil.mkdir(path);
            }

            String filePath =  UUID.randomUUID() + fuffixname;


            File file1 = new File(path+filePath);

            file.transferTo(file1);



            System.out.println("上传完成！！");
            return new Uploadimage_load("图片上传成功",filePath,200);

        }else {

            System.out.println("文件为空！！");

        }
        return new Uploadimage_load("图片上传失败","",400);
    }

    @GetMapping("/upload")
    public String upload(){


        return "page/upload";
    }

}
