package adapter.metodoPago;

import adapter.Cliente.Usuario;

public class PayPal implements IPago{
    @Override
    public void pagar(Usuario usuario) {

        System.out.println("Usuario "+usuario.nombre+" su pago en Paypal fue exitoso");
    }
}
