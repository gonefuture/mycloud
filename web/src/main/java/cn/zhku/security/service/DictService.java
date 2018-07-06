//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.zhku.security.service;

import cn.zhku.mysql.repository.DictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictService {
    @Autowired
    DictRepository dictRepository;

    public DictService() {
    }
}
