package adapter.metodoPago;

import adapter.Cliente.Usuario;

public class TarjetaDeCredito implements IPago {
    @Override
    public void pagar(Usuario usuario) {

        System.out.println("Usuario "+usuario.nombre+" su pago con una tarjeta de credito fue exitoso");
    }
}
