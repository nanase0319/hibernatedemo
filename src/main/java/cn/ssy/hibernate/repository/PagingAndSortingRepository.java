package cn.ssy.hibernate.repository;// PagingAndSortingRepository.java

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

public interface PagingAndSortingRepository<T, ID> extends CrudRepository<T, ID> {

	Iterable<T> findAll(Sort sort); // 排序操作

	Page<T> findAll(Pageable pageable); // 分页操作

}