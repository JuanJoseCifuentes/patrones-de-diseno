package adapter.metodoPago;

public class PayPal implements IPago{
    @Override
    public void pagar(String datosUsuario) {
        System.out.println("Usuario "+datosUsuario+" Su pago en Paypal fue exitoso");
    }
}
