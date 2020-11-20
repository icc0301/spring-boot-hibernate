package com.xzm.springboothibernate.repository;

import com.xzm.springboothibernate.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {

}
