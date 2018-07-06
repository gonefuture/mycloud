package cn.zhku.news.controller;

import cn.zhku.mysql.entity.Dict;
import cn.zhku.mysql.model.Message;
import cn.zhku.mysql.repository.DictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/10/11 11:16.
 * @E-mail gonefuture@qq.com
 */
@RestController
@RequestMapping("dict")
public class DictController {
    @Autowired
    DictRepository dictRepository;

    @RequestMapping(value = "list")
    public List<Dict> listDict() {
        return dictRepository.findAll();
    }


    @RequestMapping(value = "new")
    public Message addDict() {
        return null;
    }

}
