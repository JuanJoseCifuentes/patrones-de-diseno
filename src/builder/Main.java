package builder;

import builder.componente.Factura;
import builder.componente.Masa;
import builder.componente.Pizza;
import builder.componente.Tamano;
import builder.constructor.FacturaBuilder;
import builder.constructor.PizzaBuilder;
import builder.ingrediente.*;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Tamano tamano = new Tamano("Pequeña");
        Masa masa = new Masa("Delgada");
        boolean extraQueso = true;
        Aceituna aceituna = new Aceituna();
        Cebolla cebolla = new Cebolla();
        Peperoni peperoni = new Peperoni();
        Queso queso = new Queso();
        Pimiento pimiento = new Pimiento();
        Pina pina = new Pina();

        HashMap<Ingrediente, Integer> ingredientes = new HashMap<>();
        ingredientes.put(aceituna,5);
        ingredientes.put(cebolla,4);
        ingredientes.put(peperoni,15);
        ingredientes.put(pimiento,2);
        ingredientes.put(queso,1);
        ingredientes.put(pina,6);


        PizzaBuilder builder = new PizzaBuilder();
        builder.definirTamano(tamano);
        builder.definrMasa(masa);
        builder.definirQueso(extraQueso);
        builder.definirIngredientes(ingredientes);

        Pizza pizza = builder.getNewPizza();
        System.out.println(pizza.toString() + '\n');

        FacturaBuilder facturaBuilder = new FacturaBuilder();
        facturaBuilder.definirTamano(tamano);
        facturaBuilder.definrMasa(masa);
        facturaBuilder.definirIngredientes(ingredientes);
        facturaBuilder.definirQueso(extraQueso);

        Factura factura = facturaBuilder.getNewFactura();
        System.out.println(factura.toString());
    }
}