package com.practiceproject.backend.repository;

import com.practiceproject.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    
}
