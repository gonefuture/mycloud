package cn.zhku.mysql.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/11/29 17:13.
 * 说明：
 */
@Entity
@Table(name = "news")
public class News implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Lob
    private String content;

    private String image;


    @Temporal(TemporalType.DATE)
    @Column(name = "news_date", length = 32)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date newsDate; // 日期类型，格式：yyyy-MM-dd

    @ManyToOne
    @JoinColumn(name = "dict")
    @JsonBackReference
    private Dict dict;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(Date newsDate) {
        this.newsDate = newsDate;
    }

    public Dict getDict() {
        return dict;
    }

    public void setDict(Dict dict) {
        this.dict = dict;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", image='" + image + '\'' +
                ", newsDate=" + newsDate +
                ", dict=" + dict +
                '}';
    }
}
