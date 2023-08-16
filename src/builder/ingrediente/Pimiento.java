package builder.ingrediente;

public class Pimiento implements Ingrediente {

    String nombre = "Pimientos";

    Double precio = 1.35;

    public Pimiento() {

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
