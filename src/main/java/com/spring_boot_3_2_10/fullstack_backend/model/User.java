package com.spring_boot_3_2_10.fullstack_backend.model; // Define the package for this class

import jakarta.persistence.Entity; // Import Entity annotation for marking this class as a JPA entity
import jakarta.persistence.GeneratedValue; // Import GeneratedValue annotation for auto-generating primary key values
import jakarta.persistence.Id; // Import Id annotation to mark the primary key field

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String name;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}