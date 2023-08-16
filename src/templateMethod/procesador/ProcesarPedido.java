package templateMethod.procesador;

import templateMethod.inventario.Inventario;
import templateMethod.usuario.Usuario;

public abstract class ProcesarPedido {
    Usuario cliente;
    double valorTotal;
    String tipo;
    String producto;

    ProcesarPedido(){}

    public void procesar() {
        System.out.println("=============================");
        System.out.println("=====Iniciando Pedido...=====");
        System.out.println("=============================");

        if (verificarValidez()) {
            aplicarImpuestos();
            realizarCobro();
            generarFactura();
            notificarCliente();

            System.out.println("============================");
            System.out.println("=====Pedido Completado!=====");
            System.out.println("============================\n\n");
        }
    }

    public boolean verificarValidez() {
        if (verificarInventario()) {
            return verificarTalla() && verificarCaducidad();
        } else {
            System.out.println("El producto no se encuentra en stock.");
            System.out.println("============================");
            System.out.println("======Pedido Cancelado======");
            System.out.println("============================\n\n");
            return false;
        }
    }

    public boolean verificarInventario() {
        int unidadesDisponibles = Inventario.inventario.get(tipo);
        return unidadesDisponibles > 0;
    }

    public void realizarCobro() {
        System.out.println("Cobrando la cantidad de " + this.valorTotal + " pesos...");
    }

    public void generarFactura() {
        System.out.println("Generando factura por la compra de " + this.producto + " por el valor de "
                + this.valorTotal + "...");
    }

    public void notificarCliente() {
        System.out.println("Enviando correo de confirmación para " + this.cliente.getNombre() + " al correo "
                + this.cliente.getCorreo() + "...");
    }

    public abstract boolean verificarTalla();
    public abstract boolean verificarCaducidad();
    public abstract void aplicarImpuestos();

}
