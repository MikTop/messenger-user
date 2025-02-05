package com.messenger.user.persistence.user.repository;

import com.messenger.user.persistence.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
