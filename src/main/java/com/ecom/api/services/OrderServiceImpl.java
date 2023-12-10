package com.ecom.api.services;

import com.ecom.api.entity.Order;
import com.ecom.api.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Override
    public Order createOrder(Order order, User user) {
        return null;
    }

    @Override
    public List<Order> getAllOrdersForUser(int userId) {
        return null;
    }

    @Override
    public Order getOrderByOrderId(int orderId) {
        return null;
    }
}
