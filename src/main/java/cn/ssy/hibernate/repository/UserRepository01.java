package cn.ssy.hibernate.repository;

import cn.ssy.hibernate.entity.UserDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: sl
 * @since: 20/10/29 14:24
 */
@Repository
public interface UserRepository01 extends CrudRepository<UserDO,Integer> {
}
