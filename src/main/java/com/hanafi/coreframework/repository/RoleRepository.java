package com.hanafi.coreframework.repository;

import com.hanafi.coreframework.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}