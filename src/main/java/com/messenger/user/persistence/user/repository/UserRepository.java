package com.messenger.user.persistence.user.repository;

import com.messenger.user.persistence.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

    void deleteByUsername (String username);

    Optional<User> findByUsername (String username);
}
