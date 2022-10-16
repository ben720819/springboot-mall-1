package com.smallstone.springbootmall.service;

import com.smallstone.springbootmall.dto.CreateOrderRequest;
import com.smallstone.springbootmall.dto.OrderQueryParams;
import com.smallstone.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrder(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
