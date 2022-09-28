package com.dev.scheduler.dao;

import com.dev.scheduler.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository <User, Integer> {
}
