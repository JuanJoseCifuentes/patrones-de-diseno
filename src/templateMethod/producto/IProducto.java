package templateMethod.producto;

import templateMethod.procesador.ProcesarPedido;
import templateMethod.usuario.Usuario;

public interface IProducto {
    double precio = 0;
    String descripcion = "";
    Usuario cliente = null;
    ProcesarPedido procesador = null;
}
