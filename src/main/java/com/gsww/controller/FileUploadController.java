package com.gsww.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @program: mall
 * @description: 测试文件上传
 * @author: EvanChan
 * @create: 2018-10-30 16:52
 **/
@Controller
public class FileUploadController {
    @RequestMapping(value = "/fileUpload")
    public ModelAndView fileUpload(@RequestParam("img") MultipartFile multipartFile, HttpSession session){

        ModelAndView modelAndView = new ModelAndView();

        //图片原始名称
        String originalFilename = multipartFile.getOriginalFilename();
        //上传图片
        if (multipartFile!=null && originalFilename!=null &&originalFilename.length()>0){
            //将webapp下的pic目录转成一个绝对目录
            String path = session.getServletContext().getRealPath("/pic/");


            //新的图片名称
            String newFileName = UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
            File newFile = new File(path+newFileName);
            modelAndView.addObject("picName","/pic/"+newFileName);
            modelAndView.setViewName("/uploadFile.jsp");
            try {
                //将内存中的数据写入磁盘
                multipartFile.transferTo(newFile);
            } catch (IOException e) {

            }
        }




        return modelAndView;
    }
}