package br.edu.ifpb.padroes.domain.decorator;

import com.fasterxml.jackson.databind.JsonSerializable.Base;

import br.edu.ifpb.padroes.domain.Pizza;

public class BaseDecorator implements Pizza{

    private Pizza pizza;

    public BaseDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public Float getPrice() {
        // TODO Auto-generated method stub
        return pizza.getPrice();
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return pizza.getName();
    }
    
}
