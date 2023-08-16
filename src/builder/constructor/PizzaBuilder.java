package builder.constructor;

import builder.componente.Masa;
import builder.componente.Pizza;
import builder.componente.Tamano;
import builder.ingrediente.Ingrediente;

import java.util.HashMap;

public class PizzaBuilder implements Builder{

    private String tamanoFinal;
    private String masaFinal;
    private boolean extraQueso;
    private HashMap<Ingrediente, Integer> ingredientes;

    @Override
    public void reset() {
    Pizza pizza = new Pizza("","",null,false);
    }

    @Override
    public void definirTamano(Tamano tamano) {
    this.tamanoFinal = tamano.getTamano();
    }

    @Override
    public void definrMasa(Masa masa) {
    this.masaFinal = masa.getTipoMasa();
    }

    @Override
    public void definirIngredientes(HashMap<Ingrediente, Integer> map) {
        this.ingredientes = map;
    }

    @Override
    public void definirQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public Pizza getNewPizza (){
        return new Pizza(tamanoFinal,masaFinal,ingredientes,extraQueso);
    }
}
