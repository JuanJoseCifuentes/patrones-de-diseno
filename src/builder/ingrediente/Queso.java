package builder.ingrediente;

public class Queso implements Ingrediente {

    String nombre = "Queso";

    Double precio = 0.30;

    public Queso() {

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
