package cn.zhku.mysql.repository;

import cn.zhku.mysql.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/11/30 20:48.
 * 说明：
 */
@Repository
public interface NewsRepository extends JpaRepository<News,Long> {
}
