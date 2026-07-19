package com.salario.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salario.desafio.entities.Order;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;


    public Double total(Order order){
        return order.getFinalOrderValue() + this.shippingService.shipment(order);
    }
}
