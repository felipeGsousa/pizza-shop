package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class DiscountCupomDecorator extends BaseDecorator{

    public DiscountCupomDecorator(Pizza pizza) {
        super(pizza);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public Float getPrice(){
        return super.getPrice() * 0.25f;
    }

    @Override 
    public String getName(){
        return super.getName();
    }
}
