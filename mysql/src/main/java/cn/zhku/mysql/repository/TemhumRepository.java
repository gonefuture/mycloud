package cn.zhku.mysql.repository;

import cn.zhku.mysql.entity.Temhum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/12/14 9:21.
 * 说明：
 */
@Repository
public interface TemhumRepository extends JpaRepository<Temhum,Date> {

    Temhum  findTop1ByOrderByCreatetimeDesc();

}
