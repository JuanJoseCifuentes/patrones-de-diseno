package templateMethod.producto;

import templateMethod.usuario.Usuario;
import templateMethod.procesador.ProcesarElectronica;
import templateMethod.procesador.ProcesarPedido;

public class ProductoElectronico implements IProducto{
    public String descripcion;
    public int precio;
    public Usuario cliente;
    public ProcesarPedido procesador;

    public ProductoElectronico(String descripcion, int precio, Usuario cliente) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.cliente = cliente;
        this.procesador = new ProcesarElectronica(cliente, precio);
    }
}
