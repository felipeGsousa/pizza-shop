package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class StuffedCrustDecorator extends BaseDecorator{

    public StuffedCrustDecorator(Pizza pizza) {
        super(pizza);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public Float getPrice(){
        return super.getPrice() * 1.20f;
    }

    @Override 
    public String getName(){
        return super.getName();
    }
}
