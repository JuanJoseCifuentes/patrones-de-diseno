package templateMethod.producto;

import templateMethod.usuario.Usuario;
import templateMethod.procesador.ProcesarElectronica;
import templateMethod.procesador.ProcesarPedido;

public class AparatoElectronico implements IProducto{
    private final int precio;
    private final Usuario cliente;
    private final String descripcion;
    public ProcesarPedido procesador;

    public AparatoElectronico(int precio, Usuario cliente, String descripcion) {
        this.precio = precio;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.procesador = new ProcesarElectronica(this.cliente, this.precio, this.descripcion);
    }
}
