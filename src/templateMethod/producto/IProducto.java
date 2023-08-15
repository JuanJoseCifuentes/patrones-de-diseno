package templateMethod.producto;

import templateMethod.procesador.ProcesarPedido;

public interface IProducto {
    String descripcion = "";
    int precio = 0;
    ProcesarPedido procesador = null;
}
