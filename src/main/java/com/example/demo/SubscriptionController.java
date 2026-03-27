package com.example.demo.controller;

// Ye hain wo "Addresses" (Imports) jo missing the
import com.example.demo.model.Subscription;
import com.example.demo.service.SubscriptionService;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/subscriptions")
public class SubscriptionController {

    private final SubscriptionService service;

    public SubscriptionController(SubscriptionService service) {
        this.service = service;
    }

    @GetMapping
    public List<Subscription> getAll() {
        return service.getAllSubscriptions();
    }

    @PostMapping
    public Subscription create(@RequestBody Subscription sub) {
        return service.saveSubscription(sub);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteSubscription(id);
        return "Subscription deleted successfully!";
    }

    @PutMapping("/{id}")
    public Subscription update(@PathVariable Long id, @RequestBody Subscription sub) {
        return service.updateSubscription(id, sub);
    }
}
