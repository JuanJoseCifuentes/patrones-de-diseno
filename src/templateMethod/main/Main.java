package templateMethod.main;

import templateMethod.inventario.Inventario;
import templateMethod.producto.Alimento;
import templateMethod.producto.AparatoElectronico;
import templateMethod.producto.Ropa;
import templateMethod.usuario.Usuario;

public class Main {
    public static void main(String[] args) {

        //Define el stock de la siguiente forma: {Electronica, Ropa, Alimento}
        //Hay un 20% de probabilidad de que el producto se haya agotado.
        int cantidadElectronica, cantidadRopa, cantidadAlimento;
        cantidadElectronica = (Math.random() > 0.2) ? 5 : 0;
        cantidadRopa = (Math.random() > 0.2) ? 5 : 0;
        cantidadAlimento = (Math.random() > 0.2) ? 5 : 0;
        int[] cantidadesInventario = {cantidadElectronica, cantidadRopa, cantidadAlimento};
        Inventario.setInventario(cantidadesInventario);

        Usuario cliente = new Usuario("Juanjo", "juancicu@unisabana.edu.co");

        Ropa camisa = new Ropa(40000, cliente, "Camisa Koaj");
        System.out.println("Pedido de ropa:");
        camisa.procesador.procesar();

        Alimento papas = new Alimento(1800, cliente, "Papas Lay");
        System.out.println("Pedido de alimentos:");
        papas.procesador.procesar();

        AparatoElectronico celular = new AparatoElectronico(1200000, cliente, "Celular Huawei");
        System.out.println("Pedido de electrónica:");
        celular.procesador.procesar();
    }
}