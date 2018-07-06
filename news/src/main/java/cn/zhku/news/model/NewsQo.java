package cn.zhku.news.model;


/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/11/11 16:01.
 * 说明：
 */
public class NewsQo   {
    private Integer page = 0;
    private Integer size = 10;


    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "StudentQo{" +
                "page=" + page +
                ", size=" + size +
                '}';
    }
}
