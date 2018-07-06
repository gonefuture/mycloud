package cn.zhku.mysql.entity;

import javax.persistence.*;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/10/10 22:33.
 * @E-mail gonefuture@qq.com
 */
@Entity
@Table
public class Dict implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long pid;

    private Integer seq;

    private Integer haschild;

    private String property;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getHaschild() {
        return haschild;
    }

    public void setHaschild(Integer haschild) {
        this.haschild = haschild;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return "Dict{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                ", seq=" + seq +
                ", haschild=" + haschild +
                ", property='" + property + '\'' +
                '}';
    }
}
