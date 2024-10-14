package com.spring_boot_3_2_10.fullstack_backend.model; // Define the package for this class

import jakarta.persistence.Entity; // Import Entity annotation for marking this class as a JPA entity
import jakarta.persistence.GeneratedValue; // Import GeneratedValue annotation for auto-generating primary key values
import jakarta.persistence.Id; // Import Id annotation to mark the primary key field

@Entity // Mark this class as a JPA entity that will be mapped to a database table
public class User {

    @Id // Mark this field as the primary key
    @GeneratedValue // Auto-generate the value for this primary key
    private Long id; // Unique identifier for each User
    private String username; // Username of the user
    private String name; // Name of the user
    private String email; // Email address of the user

    // Getter for id field
    public Long getId() {
        return id;
    }

    // Setter for id field
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for username field
    public String getUsername() {
        return username;
    }

    // Setter for username field
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for name field
    public String getName() {
        return name;
    }

    // Setter for name field
    public void setName(String name) {
        this.name = name;
    }

    // Getter for email field
    public String getEmail() {
        return email;
    }

    // Setter for email field
    public void setEmail(String email) {
        this.email = email;
    }
}