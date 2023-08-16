package builder.ingrediente;

public class Peperoni implements Ingrediente {

    String nombre = "Peperoni";

    Double precio = 1.53;

    public Peperoni() {

    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public Double precioIngrediente() {
        return precio;
    }
}
