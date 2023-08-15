package templateMethod.procesador;

import templateMethod.inventario.Inventario;
import templateMethod.usuario.Usuario;

public abstract class ProcesarPedido {
    private Usuario client;
    private int precio;

    public void procesar(){
        if(verificarInventario() && verificarCaducidad() && verificarTalla()){
            aplicarImpuestos();
            realizarCobro();
            generarFactura();
            notificarCliente();
        }
    }

    public void realizarCobro(){

    }

    public void notificarCliente(){

    }

    public abstract boolean verificarInventario();
    public abstract boolean verificarTalla();
    public abstract boolean verificarCaducidad();
    public abstract void aplicarImpuestos();
    public abstract void generarFactura();

}
