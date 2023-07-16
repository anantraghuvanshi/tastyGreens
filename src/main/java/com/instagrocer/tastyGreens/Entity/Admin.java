package com.instagrocer.tastyGreens.Entity;

import jakarta.persistence.Entity;

@Entity
public class Admin extends User {

    private boolean isAdmin;

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
