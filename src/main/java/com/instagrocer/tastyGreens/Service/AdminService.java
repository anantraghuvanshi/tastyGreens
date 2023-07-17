package com.instagrocer.tastyGreens.Service;

import com.instagrocer.tastyGreens.Entity.Admin;
import com.instagrocer.tastyGreens.Entity.User;
import com.instagrocer.tastyGreens.Repository.AdminRepository;
import com.instagrocer.tastyGreens.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class AdminService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AdminRepository adminRepository;

    public void initAdmin(){
        Admin admin = new Admin();
        admin.setUserName("admin");
        admin.setPassword("admin");
        admin.setAdmin(true);
        adminRepository.save(admin);

        User adminUser = new User();
        adminUser.setUserName("Anant");
        adminUser.setPassword("anant");
        Set<User> adminRoles = new HashSet<>();
        adminRoles.add(admin);
        userRepository.save(adminUser);
    }
}

