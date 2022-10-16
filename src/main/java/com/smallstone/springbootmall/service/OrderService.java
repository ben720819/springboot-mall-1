package com.smallstone.springbootmall.service;

import com.smallstone.springbootmall.dto.CreateOrderRequest;
import com.smallstone.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
