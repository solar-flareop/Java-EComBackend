package com.ecom.api.services;


import com.ecom.api.entity.Order;
import com.ecom.api.entity.User;

import java.util.List;

public interface OrderService {
    Order createOrder(Order order, User user);
    List<Order> getAllOrdersForUser(int userId);
    Order getOrderByOrderId(int orderId);
}
