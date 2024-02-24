package com.microservice.orderservice.service;

import com.microservice.orderservice.entity.Order;
import com.microservice.orderservice.model.OrderReqDtO;
import com.microservice.orderservice.repository.OrderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public long placeOrder(OrderReqDtO orderReqDtO) {
        Order order = modelMapper.map(orderReqDtO, Order.class);
        Order savedOrder = orderRepository.save(order);
        return savedOrder.getOrderId();
    }
}
