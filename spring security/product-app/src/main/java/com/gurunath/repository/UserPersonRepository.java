package com.gurunath.repository;

import com.gurunath.entity.UserPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPersonRepository extends JpaRepository<UserPerson, Long> {
}