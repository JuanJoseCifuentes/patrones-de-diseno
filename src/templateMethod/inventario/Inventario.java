package templateMethod.inventario;

import java.util.HashMap;

public class Inventario {
    public static HashMap<String, Integer> inventario = new HashMap<>();

    public static void setInventario(int[] cantidades) {
        inventario.put("Electronica", cantidades[0]);
        inventario.put("Ropa", cantidades[1]);
        inventario.put("Alimento", cantidades[2]);
    }
}
