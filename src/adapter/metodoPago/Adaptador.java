package adapter.metodoPago;

import adapter.Cliente.Usuario;
import adapter.servicioExterno.PasarelaDePago;

public class Adaptador implements IPago{

    @Override
    public void pagar(Usuario usuario) {

        PasarelaDePago pasarelaDePago = new PasarelaDePago();
        String recibo = pasarelaDePago.realizarPago(usuario.banco);
        System.out.println("Usuario "+usuario.nombre+" "+recibo+" ");

    }
}
