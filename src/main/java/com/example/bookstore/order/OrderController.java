package com.example.bookstore.order;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderRepository repository;

    public OrderController(OrderRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order create(@Valid @RequestBody OrderRequest request) {
        if (request.total().signum() <= 0) {
            throw new IllegalArgumentException("Order total must be greater than zero");
        }
        return repository.save(new Order(request.customerEmail(), request.total()));
    }

    @GetMapping("/{id}")
    public Order get(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new OrderNotFoundException(id));
    }
}
