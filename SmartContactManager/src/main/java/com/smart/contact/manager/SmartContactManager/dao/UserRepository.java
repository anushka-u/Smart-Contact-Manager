package com.smart.contact.manager.SmartContactManager.dao;

import com.smart.contact.manager.SmartContactManager.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
