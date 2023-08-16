package templateMethod.producto;

import templateMethod.usuario.Usuario;
import templateMethod.procesador.ProcesarAlimento;
import templateMethod.procesador.ProcesarPedido;

public class Alimento implements IProducto{
    private final int precio;
    private final Usuario cliente;
    private final String descripcion;
    public ProcesarPedido procesador;

    public Alimento(int precio, Usuario cliente, String descripcion) {
        this.precio = precio;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.procesador = new ProcesarAlimento(this.cliente, this.precio, this.descripcion);
    }
}
