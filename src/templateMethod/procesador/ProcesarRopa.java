package templateMethod.procesador;

import templateMethod.usuario.Usuario;

public class ProcesarRopa extends ProcesarPedido {
    public ProcesarRopa(Usuario cliente, int precioProducto, String producto) {
        this.cliente = cliente;
        this.valorTotal = precioProducto;
        this.producto = producto;
        this.tipo = "Ropa";
    }

    @Override
    public boolean verificarTalla() {
        //Simulamos el stock de la tienda de una talla concreta mediante un simple Math.random()
        //Con un 70% de probabilidad, la tienda tiene esa talla.
        boolean isAvailable = Math.random() > 0.3;
        if (!isAvailable){
            System.out.println("El producto no se encuentra en la talla deseada.");
            System.out.println("============================");
            System.out.println("======Pedido Cancelado======");
            System.out.println("============================\n\n");
        }
        return isAvailable;
    }

    @Override
    public boolean verificarCaducidad() {
        return true;
    }

    @Override
    public void aplicarImpuestos() {
        valorTotal += valorTotal * 0.19;
        System.out.println("Aplicando el IVA del 19%...");
    }
}
