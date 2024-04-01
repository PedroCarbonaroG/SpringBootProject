package com.githubProject.SpringBootCourse.repositories;

import com.githubProject.SpringBootCourse.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
