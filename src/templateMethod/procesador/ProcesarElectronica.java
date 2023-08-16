package templateMethod.procesador;

import templateMethod.usuario.Usuario;

public class ProcesarElectronica extends ProcesarPedido {
    public ProcesarElectronica(Usuario cliente, int precioProducto, String producto) {
        this.cliente = cliente;
        this.valorTotal = precioProducto;
        this.producto = producto;
        this.tipo = "Electronica";
    }

    @Override
    public boolean verificarTalla() {
        return true;
    }

    @Override
    public boolean verificarCaducidad() {
        return true;
    }

    @Override
    public void aplicarImpuestos() {
        valorTotal += valorTotal * 0.2;
        System.out.println("Aplicando impuesto arancelario del 20%...");
    }
}
