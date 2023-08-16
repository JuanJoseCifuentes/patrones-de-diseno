package builder.constructor;

import builder.componente.Factura;
import builder.componente.Masa;
import builder.componente.Tamano;
import builder.ingrediente.Ingrediente;

import java.util.HashMap;

public class FacturaBuilder implements Builder{

    private double precioTamaño;
    private double precioExtraQueso;
    private double precioMasa;
    private HashMap<Ingrediente, Integer> ingredientes;


    @Override
    public void definirTamano(Tamano tamano) {
        this.precioTamaño = tamano.precioTamano();
    }

    @Override
    public void definrMasa(Masa masa) {
        this.precioMasa = masa.precioMasa();
    }

    @Override
    public void definirIngredientes(HashMap<Ingrediente, Integer> map) {
        this.ingredientes = map;
    }

    @Override
    public void definirQueso(boolean extraQueso) {
        if (extraQueso){
            this.precioExtraQueso = 3.4;
        } else {
            this.precioExtraQueso = 0.0;
        }
    }

    public Factura getNewFactura (){
        return new Factura(precioTamaño, precioMasa, precioExtraQueso, ingredientes);
    }
}
