package builder.ingrediente;

public class Champinon implements Ingrediente {

    String nombre = "Champiñones";

    Double precio = 2.44;

    public Champinon() {

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
