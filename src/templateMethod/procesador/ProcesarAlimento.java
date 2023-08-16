package templateMethod.procesador;

import templateMethod.usuario.Usuario;

public class ProcesarAlimento extends ProcesarPedido {
    public ProcesarAlimento(Usuario cliente, int precioProducto, String producto) {
        this.cliente = cliente;
        this.valorTotal = precioProducto;
        this.producto = producto;
        this.tipo = "Alimento";
    }

    @Override
    public boolean verificarTalla() {
        return true;
    }

    @Override
    public boolean verificarCaducidad() {
        //Simulamos el stock de productos que no han vencido mediante un simple Math.random()
        //Con un 95% de probabilidad, la tienda tiene ese alimento sin vencer.
        System.out.println("Verificando fecha de caducidad del producto... (PROCESO SOLO PARA ALIMENTOS)");
        boolean isAvailable = Math.random() > 0.05;
        if (!isAvailable){
            System.out.println("Todo el stock del producto se encuentra caducado");
            System.out.println("============================");
            System.out.println("======Pedido Cancelado======");
            System.out.println("============================\n\n");
        }
        return isAvailable;
    }

    @Override
    public void aplicarImpuestos() {
        valorTotal += valorTotal * 0.1;
        System.out.println("Aplicando impuesto nacional al consumo del 10%...");
    }
}
