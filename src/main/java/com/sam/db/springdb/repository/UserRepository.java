package com.sam.db.springdb.repository;

import com.sam.db.springdb.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
