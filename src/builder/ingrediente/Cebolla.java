package builder.ingrediente;

public class Cebolla implements Ingrediente {

    String nombre = "Cebolla";

    Double precio = 0.79;

    public Cebolla() {

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
