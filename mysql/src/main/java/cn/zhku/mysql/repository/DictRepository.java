package cn.zhku.mysql.repository;

import cn.zhku.mysql.entity.Dict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/10/11 11:21.
 * @E-mail gonefuture@qq.com
 */
@Repository
public interface DictRepository extends JpaRepository<Dict,Long>{

}
