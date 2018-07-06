//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.zhku.security.controller;

import cn.zhku.mysql.entity.Dict;
import cn.zhku.mysql.repository.DictRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DictController {
    @Autowired
    DictRepository dictRepository;



    @RequestMapping({"dict/list"})
    public List<Dict> dict() {
        return this.dictRepository.findAll();
    }
}
