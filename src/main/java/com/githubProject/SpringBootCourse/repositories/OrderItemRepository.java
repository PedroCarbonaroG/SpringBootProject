package com.githubProject.SpringBootCourse.repositories;

import com.githubProject.SpringBootCourse.entities.OrderItem;
import com.githubProject.SpringBootCourse.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
