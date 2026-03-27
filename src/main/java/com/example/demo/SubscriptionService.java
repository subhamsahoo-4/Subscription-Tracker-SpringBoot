package com.example.demo.service;

import com.example.demo.model.Subscription;
import com.example.demo.repository.SubscriptionRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {

    private final SubscriptionRepository repository;

    public SubscriptionService(SubscriptionRepository repository) {
        this.repository = repository;
    }

    public List<Subscription> getAllSubscriptions() {
        return repository.findAll();
    }

    public Subscription saveSubscription(Subscription sub) {
        // Business Logic: Agar price 0 se kam hai toh error dena (Abhi simple rakhte hain)
        return repository.save(sub);
    }

    public void deleteSubscription(Long id) {
        repository.deleteById(id);
    }

    public Subscription updateSubscription(Long id, Subscription newDetails) {
    return repository.findById(id).map(sub -> {
        sub.setServiceName(newDetails.getServiceName());
        sub.setPrice(newDetails.getPrice());
        sub.setExpiryDate(newDetails.getExpiryDate());
        return repository.save(sub);
    }).orElseThrow(() -> new RuntimeException("Subscription not found!"));
}
}