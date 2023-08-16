package adapter.metodoPago;

public class TarjetaDeCredito implements IPago {
    @Override
    public void pagar(String datosUsuario) {
        System.out.println("Usuario "+datosUsuario+" Su pago con una tarjeta de credito fue exitoso");
    }
}
