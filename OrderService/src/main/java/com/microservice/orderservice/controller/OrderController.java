package com.microservice.orderservice.controller;


import com.microservice.orderservice.model.OrderReqDtO;
import com.microservice.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/placeorder")
    public ResponseEntity<Long> placeOrder(@RequestBody OrderReqDtO orderReqDtO) {
       long orderId = orderService.placeOrder(orderReqDtO);
       return new ResponseEntity<>(orderId, HttpStatus.OK);
    }
}
