package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity // Isse Spring ko pata chalega ki ye Database Table hai
public class Subscription {

    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private Long id;

    private String serviceName; // e.g., Netflix
    private Double price;       // e.g., 499.0
    private LocalDate expiryDate; // Kab khatam ho raha hai
    private String category; // e.g., Entertainment, Education, etc.
    // Default Constructor (Zaroori hai)
    public Subscription() {}

    // Getters aur Setters (Data read aur write karne ke liye)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getServiceName() { return serviceName; }
    public void setServiceName(String serviceName) { this.serviceName = serviceName; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public LocalDate getExpiryDate() { return expiryDate; }
    public void setExpiryDate(LocalDate expiryDate) { this.expiryDate = expiryDate; }
}