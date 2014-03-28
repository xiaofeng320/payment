package com.yc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.yc.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
