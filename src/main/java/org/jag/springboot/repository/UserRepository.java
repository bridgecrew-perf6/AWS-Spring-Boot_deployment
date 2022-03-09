package org.jag.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.jag.springboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
