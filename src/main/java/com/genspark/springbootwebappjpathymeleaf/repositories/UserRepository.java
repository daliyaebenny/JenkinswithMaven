package com.genspark.springbootwebappjpathymeleaf.repositories;

import com.genspark.springbootwebappjpathymeleaf.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
