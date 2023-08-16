package adapter.servicioExterno;

import adapter.Cliente.Usuario;

public class PasarelaDePago {
    public String realizarPago(String banco){

        return "su pago en la pasarela de pago del banco "+banco+" fue exitoso";
    }
}
