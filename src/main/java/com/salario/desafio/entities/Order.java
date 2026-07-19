package com.salario.desafio.entities;

public class Order {
    private Integer code;
    private Double basic;
    private Double discount;

    
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

    public Double getFinalOrderValue(){
        return basic - (discount/100.0) * basic;
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
