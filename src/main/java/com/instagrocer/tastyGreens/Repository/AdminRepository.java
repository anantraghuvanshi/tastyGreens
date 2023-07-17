package com.instagrocer.tastyGreens.Repository;

import com.instagrocer.tastyGreens.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository  extends JpaRepository<Admin, Long> {
}
