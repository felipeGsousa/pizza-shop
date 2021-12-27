package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class PanPizzaDecorator extends BaseDecorator{

    public PanPizzaDecorator(Pizza pizza) {
        super(pizza);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public Float getPrice(){
        return super.getPrice() * 1.15f;
    }

    @Override 
    public String getName(){
        return super.getName();
    }
}
