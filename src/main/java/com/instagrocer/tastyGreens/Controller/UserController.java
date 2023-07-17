package com.instagrocer.tastyGreens.Controller;

import com.instagrocer.tastyGreens.Entity.User;
import com.instagrocer.tastyGreens.Service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/admin/user")
    @PreAuthorize("hasRole('ADMIN')")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @DeleteMapping("/admin/user/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @PutMapping("/admin/user/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void updateUser(@PathVariable Long id, @RequestBody User user) {
        userService.updateUser(id, user);
    }
}
