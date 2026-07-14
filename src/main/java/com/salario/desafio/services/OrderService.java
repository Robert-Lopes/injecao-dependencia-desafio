package com.salario.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    
    private Integer code;
    private Double basic;
    private Double discount;



    public Double total(){
        return basic - discount + this.shippingService.shipment(this);
    }
    
    // ---------- GETTERS 
    public Integer getCode() {
        return code;
    }
    
    public Double getBasic() {
        return basic;
    }

    public Double getDiscount() {
        return discount;
    }

    
    // ---------- SETTERS
    
    public void setCode(Integer code) {
        this.code = code;
    }

    public void setBasic(Double basic){
        this.basic = basic;
    }

    public void setDiscount(Double discount){
        this.discount = discount;
    }
}
