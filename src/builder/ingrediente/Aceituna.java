package builder.ingrediente;

public class Aceituna implements Ingrediente {

    String nombre = "Aceitunas";

    Double precio = 0.63;

    public Aceituna() {
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
