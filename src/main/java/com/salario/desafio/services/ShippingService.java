package com.salario.desafio.services;

import org.springframework.stereotype.Service;

@Service    
public class ShippingService {
    
    
    public Double shipment(OrderService orderService){
        
        if(orderService.getBasic() < 100.0){
            return 20.0;
        } else if (orderService.getBasic() < 200.0){
            return 12.0;
        }
        
        
        return 0.0;
    }
}