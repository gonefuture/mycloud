package cn.zhku.news.controller;

import cn.zhku.mysql.entity.News;
import cn.zhku.mysql.model.Message;
import cn.zhku.mysql.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/12/1 9:56.
 * 说明：
 */
@RestController
@RequestMapping("admin/news")
public class AdminNewsController {

    @Autowired
    private NewsRepository newsRepository;


    @RequestMapping(value = "new")
    public Message publishNews(@RequestParam("pic") MultipartFile pic, HttpServletRequest httpServletRequest, News news) {
        if (pic.isEmpty()) {
            return new Message("2","发布新失败,没有上传图片");
        }
        System.out.println("============"+news);
        //  储存图片的物理路径
        String realPath = httpServletRequest.getServletContext().getRealPath("/pic/");
        //  获取上传文件的文件类型名
        String originalFileName = pic.getOriginalFilename();
        //  新的的图片名称,用UUID做文件名防止重复
        String newFileName = UUID.randomUUID().toString().replace("-","").toUpperCase()+originalFileName.substring(originalFileName.lastIndexOf("."));
        //新图片文件
        File dest = new File(realPath+newFileName);

        // 检测是否存在目录
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        //将内存中的数据写入磁盘
        System.out.println("============"+newFileName);
        try {
            pic.transferTo(dest);
        } catch (IOException e) {
            //throw new RuntimeException(e);
            return new Message("2","发布新失败,图片体积太大或格式不正确");
        }
        System.out.println("============"+newFileName);
        news.setImage(newFileName);
        News returnNews = newsRepository.save(news);
        if (returnNews != null) {
            return new Message("1","发布新闻成功");
        } else {
            return new Message("2","发布新失败");
        }

    }

    @RequestMapping(value = "delete/{id}")
    public Message deleteNews(@PathVariable Long id) {
        try {
            newsRepository.delete(id);
            return new Message("1","删除成功");
        } catch (IllegalArgumentException e) {
            return new Message("2","删除失败,这个id的新闻已经被删除");
        }
    }




}
