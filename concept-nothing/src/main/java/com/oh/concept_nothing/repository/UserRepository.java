package com.oh.concept_nothing.repository;

import org.springframework.data.repository.CrudRepository;

import com.oh.concept_nothing.domain.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
