package com.instagrocer.tastyGreens.Service.UserService;

import com.instagrocer.tastyGreens.Entity.User;
import com.instagrocer.tastyGreens.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public User updateUser(Long id, User user) {
        User existingUser = userRepository.getById(id);
        existingUser.setUserName(user.getUserName());
        existingUser.setPassword(user.getPassword());
        existingUser.setRoles(user.getRoles());

        return userRepository.save(existingUser);
    }

}

