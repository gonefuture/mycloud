package cn.zhku.news.controller;
/*
 *  @author : 钱伟健 gonefuture@qq.com
 *  @version    : 2018/5/30 20:13.
 *  说明：
 */


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre> </pre>
 */

@RestController
public class LearnController {
    private static String shareStaticStr = "静态初始值";
    private String shareStr = "初始值";
    private int shareInt = 11;


    @RequestMapping("change")
    public String changeVar(String change) throws InterruptedException {
        shareStaticStr = "shareStaticStr新值: " + change;
        shareStr = "shareStr新值: " + change;
        shareInt = shareInt + 2;
        Thread.sleep(1000);
        System.out.println("========================="+shareStaticStr);
        System.out.println("========================="+shareStr);
        System.out.println("========================= 整型值"+shareInt);
        return shareStr;
    }



}
