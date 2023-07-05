package com.ali.springbootblogrestapi.springbootblogrestapi.repository;

import com.ali.springbootblogrestapi.springbootblogrestapi.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
