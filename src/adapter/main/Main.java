package adapter.main;

import adapter.Cliente.Usuario;
import adapter.metodoPago.Adaptador;
import adapter.metodoPago.IPago;
import adapter.metodoPago.PayPal;
import adapter.metodoPago.TarjetaDeCredito;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Arturo Calle","Bancolombia");

        IPago tarjeta = new TarjetaDeCredito();
        tarjeta.pagar(usuario);

        IPago paypal = new PayPal();
        paypal.pagar(usuario);

        IPago pasarela = new Adaptador();
        pasarela.pagar(usuario);
    }
}