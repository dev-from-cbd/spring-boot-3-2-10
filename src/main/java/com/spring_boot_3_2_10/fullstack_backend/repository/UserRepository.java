package com.spring_boot_3_2_10.fullstack_backend.repository;

import com.spring_boot_3_2_10.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User> {

}
