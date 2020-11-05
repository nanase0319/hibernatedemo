package cn.ssy.hibernate.repository;// UserRepository02.java

import cn.ssy.hibernate.entity.UserDO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository02 extends PagingAndSortingRepository<UserDO, Integer> {

}