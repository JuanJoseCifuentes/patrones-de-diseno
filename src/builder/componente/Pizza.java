package builder.componente;

import builder.ingrediente.Ingrediente;

import java.util.HashMap;
import java.util.Map;

public class Pizza {
    private final String tamano;
    private final String Masa;
    private final HashMap<Ingrediente, Integer> ingredientes;
    private final boolean extra;

    public Pizza(String tamano, String masa, HashMap<Ingrediente, Integer> ingredientes, boolean extra) {
        this.tamano = tamano;
        Masa = masa;
        this.ingredientes = ingredientes;
        this.extra = extra;
    }

    public String formatIngredientes (){
        String concatenado = "";
        for (Map.Entry<Ingrediente, Integer> entrada : ingredientes.entrySet()){
            concatenado += "Ingrediente: " + entrada.getKey() + " Cantidad: " + entrada.getValue() + '\n';
        }
        return concatenado;
    }

    @Override
    public String toString() {
        return "Pizza" + '\n' +
                "tamaño='" + tamano + '\n' +
                "Masa='" + Masa + '\n' +
                "ingredientes=" + formatIngredientes() +
                "extra=" + extra;
    }
}

