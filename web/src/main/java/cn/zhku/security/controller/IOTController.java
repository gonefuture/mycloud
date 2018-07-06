//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.zhku.security.controller;

import cn.zhku.mysql.entity.Temhum;
import cn.zhku.mysql.model.Message;
import cn.zhku.mysql.repository.TemhumRepository;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/iot"})
public class IOTController {
    @Autowired
    private TemhumRepository temhumRepository;

    public IOTController() {
    }

    @RequestMapping({"temhum"})
    public Message temhum(Temhum temhum) {
        temhum.setCreatetime(new Date());
        this.temhumRepository.save(temhum);
        return new Message("1", "成功", "200", temhum);
    }

    @RequestMapping({"temhum/show"})
    public Temhum showTenhum() {
        System.out.println("===============================" + this.temhumRepository.findTop1ByOrderByCreatetimeDesc());
        return this.temhumRepository.findTop1ByOrderByCreatetimeDesc();
    }
}
