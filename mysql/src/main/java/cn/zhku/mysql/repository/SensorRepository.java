package cn.zhku.mysql.repository;

import cn.zhku.mysql.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/12/24 19:20.
 * 说明：
 */

@Repository
public interface SensorRepository extends JpaRepository<Sensor,Date> {
    Sensor findTop1ByOrderByCreatetimeDesc();
}
