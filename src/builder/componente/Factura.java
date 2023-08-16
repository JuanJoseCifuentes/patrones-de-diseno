package builder.componente;

import builder.ingrediente.Ingrediente;

import java.util.HashMap;
import java.util.Map;

public class Factura {

    private final Double tamano;
    private final Double masa;
    private final Double extra;
    private final HashMap<Ingrediente, Integer> ingredientes;

    public Factura(Double tamano, Double masa, Double extra, HashMap<Ingrediente, Integer> ingredientes) {
        this.tamano = tamano;
        this.masa = masa;
        this.extra = extra;
        this.ingredientes = ingredientes;
    }

    public double precioIngredientes() {
        Double acum = 0.0;
        for (Map.Entry<Ingrediente, Integer> entrada : ingredientes.entrySet()){
            Double precio = 0.0;
            precio = entrada.getKey().precioIngrediente() * entrada.getValue();
            acum += precio;
        }

        return acum;
    }

    public String formatIngredientes (){
        String concatenado = "";
        Double precio = 0.0;
        for (Map.Entry<Ingrediente, Integer> entrada : ingredientes.entrySet()){
            precio = entrada.getKey().precioIngrediente() * entrada.getValue();
            concatenado += entrada.getKey() + "(x)" + entrada.getValue() + " - " + precio + " dolares" + '\n';
        }
        return concatenado;
    }

    public double total (){
        Double total = 0.0;
       return total = tamano + masa + extra + precioIngredientes();
    }

    public String toString() {
        return "Recibo" + '\n' +
                "Precio por tamaño: " + tamano + " dolares" + '\n' +
                "Precio por Masa: " + masa + " dolares" + '\n' +
                "ingredientes" + '\n' + formatIngredientes() + '\n' +
                "Precio por borde de queso: " + extra + " dolares" + '\n' +
                "Precio Total: " + total() + " dolares";
    }
}
