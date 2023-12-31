package com.instagrocer.tastyGreens.Repository;

import com.instagrocer.tastyGreens.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
