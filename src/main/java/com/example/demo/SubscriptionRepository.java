package com.example.demo.repository;

import com.example.demo.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

// Ye interface aapko CRUD operations (Save, Delete, Find) bina code likhe de dega!
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
