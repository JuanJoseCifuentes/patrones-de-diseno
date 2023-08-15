package templateMethod.procesador;

import templateMethod.inventario.Inventario;
import templateMethod.usuario.Usuario;

public class ProcesarElectronica extends ProcesarPedido {
    final private Usuario cliente;
    final private int precioProducto;
    private int valorTotal;

    public ProcesarElectronica(Usuario cliente, int precioProducto) {
        this.cliente = cliente;
        this.precioProducto = precioProducto;
        this.valorTotal = precioProducto;
    }

    @Override
    public boolean verificarInventario() {
        String type = "Electronica";
        int unidadesDisponibles = Inventario.inventario.get(type);
        return unidadesDisponibles > 0;
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
        valorTotal += precioProducto * 0.2;
        System.out.println("Aplicando impuesto arancelario del 20%...");
    }

    @Override
    public void generarFactura() {
        System.out.println("Enviado factura al correo " + cliente.getCorreo() + " por el valor de " + valorTotal + "...");
    }
}
