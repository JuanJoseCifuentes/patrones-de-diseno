package adapter.main;

import adapter.metodoPago.Adaptador;
import adapter.metodoPago.IPago;
import adapter.metodoPago.PayPal;
import adapter.metodoPago.TarjetaDeCredito;

public class Main {
    public static void main(String[] args) {

        IPago Tarjeta = new TarjetaDeCredito();
        Tarjeta.pagar("Gabriel Jimenez");

        IPago Paypal = new PayPal();
        Paypal.pagar("Gabriel Jimenez");

        IPago pasarela = new Adaptador();
        pasarela.pagar("Gabriel Jimenez");
    }
}