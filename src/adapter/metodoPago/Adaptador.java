package adapter.metodoPago;

import adapter.servicioExterno.PasarelaDePago;

public class Adaptador implements IPago{

    @Override
    public void pagar(String datosUsuario) {
        PasarelaDePago pasarelaDePago = new PasarelaDePago();
        String recibo = pasarelaDePago.realizarPago();
        System.out.println("Usuario "+datosUsuario+" "+recibo+" ");

    }
}
