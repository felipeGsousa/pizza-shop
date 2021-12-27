package br.edu.ifpb.padroes.api.damenos.proxy;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.damenos.DamenosServiceImpl;

import java.util.ArrayList;
import java.util.List;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public class DamenosServiceProxy implements DamenosService {
    
    private DamenosService damenosService;
    private List<DamenosPizza> cacheDamenosPizzas = new ArrayList<DamenosPizza>();

    public DamenosServiceProxy(){
        this.damenosService = new DamenosServiceImpl();
    }

    @Override
    public List<DamenosPizza> getPizzas() {
        if(cacheDamenosPizzas.isEmpty()){
            cacheDamenosPizzas = damenosService.getPizzas();
        }else{
            System.out.println("Lista recuperada do cache");
        }
        // TODO - implementar proxy
        return cacheDamenosPizzas;
    }
}
