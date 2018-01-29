package com.sam.db.springdb.repository;

import com.sam.db.springdb.user.UserContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserContactRepository extends JpaRepository<UserContact, Long>{
}
