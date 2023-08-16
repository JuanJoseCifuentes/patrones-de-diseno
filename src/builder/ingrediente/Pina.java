package builder.ingrediente;

public class Pina implements Ingrediente {

    String nombre = "Piña";

    Double precio = 2.25;

    public Pina() {
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
