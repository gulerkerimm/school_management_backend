package com.techproed.schoolmanagementbackendb326.repository.user;

import com.techproed.schoolmanagementbackendb326.entity.concretes.user.UserRole;
import com.techproed.schoolmanagementbackendb326.entity.enums.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

  @Query("select r from UserRole r WHERE r.roleType = ?1")
  Optional<UserRole> findByUserRoleType(RoleType roleType);
}
