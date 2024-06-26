package com.githubProject.SpringBootCourse.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.githubProject.SpringBootCourse.pk.OrderItemPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();

    private Integer quantity;
    private Double price;

    public OrderItem() {
    }
    public OrderItem(Order order, Product product, Integer quantity, Double price) {
        setProduct(product);
        setOrder(order);
        this.quantity = quantity;
        this.price = price;
    }
    public OrderItem(OrderItem orderItem) {
        setProduct(orderItem.getProduct());
        setOrder(orderItem.getOrder());
        this.quantity = orderItem.getQuantity();
        this.price = orderItem.getPrice();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return id.getProduct();
    }

    public void setProduct(Product product) {
        this.id.setProduct(product);
    }

    @JsonIgnore
    public Order getOrder() {
        return id.getOrder();
    }

    public void setOrder(Order order) {
        this.id.setOrder(order);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public double getSubTotal() {
        return quantity * price;
    }
}
