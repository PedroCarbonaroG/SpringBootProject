package com.githubProject.SpringBootCourse.services;

import com.githubProject.SpringBootCourse.entities.Order;
import com.githubProject.SpringBootCourse.entities.User;
import com.githubProject.SpringBootCourse.repositories.OrderRepository;
import com.githubProject.SpringBootCourse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }

}
