package templateMethod.producto;

import templateMethod.usuario.Usuario;
import templateMethod.procesador.ProcesarPedido;
import templateMethod.procesador.ProcesarRopa;

public class Ropa implements IProducto{
    private final int precio;
    private final Usuario cliente;
    private final String descripcion;
    public ProcesarPedido procesador;

    public Ropa(int precio, Usuario cliente, String descripcion) {
        this.precio = precio;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.procesador = new ProcesarRopa(this.cliente, this.precio, this.descripcion);
    }
}
