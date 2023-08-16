package builder.ingrediente;

public class Jamon implements Ingrediente {

    String nombre = "Jamón";

    Double precio = 1.45;

    public Jamon() {

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
