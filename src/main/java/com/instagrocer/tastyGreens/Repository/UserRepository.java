package com.instagrocer.tastyGreens.Repository;

import com.instagrocer.tastyGreens.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
