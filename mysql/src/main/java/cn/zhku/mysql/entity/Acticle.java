package cn.zhku.mysql.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/11/29 17:15.
 * 说明：
 */
@Entity
@Table
public class Acticle {

    @Id
    private Long id;
    private String title;
    private String content;
}
