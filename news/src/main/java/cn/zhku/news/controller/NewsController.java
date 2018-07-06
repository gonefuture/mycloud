package cn.zhku.news.controller;

import cn.zhku.mysql.entity.News;
import cn.zhku.mysql.model.Message;
import cn.zhku.mysql.repository.NewsRepository;
import cn.zhku.news.model.NewsQo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/11/11 15:52.
 * 说明：
 */

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsRepository newsRepository;



    @RequestMapping(value = "list")
    public Page<News> listNews(NewsQo newsQo) throws Exception{
            Pageable pageable = new PageRequest(newsQo.getPage(), newsQo.getSize(), new Sort(Sort.Direction.ASC, "newsDate"));
            return newsRepository.findAll(pageable);

    }

    @RequestMapping(value = "show/{id}")
    public Message showNews(@PathVariable Long id) throws Exception{
        News news = newsRepository.findOne(id);
        if (news != null) {
            return new Message("1","获取新闻成功","200",news);
        } else {
            return new Message("2","新闻为空","404");
        }
    }


}
