package builder.constructor;

import builder.componente.Masa;
import builder.componente.Tamano;
import builder.ingrediente.Ingrediente;

import java.util.HashMap;

public interface Builder {
    void definirTamano (Tamano tamano);
    void definrMasa (Masa masa);
    void definirIngredientes (HashMap<Ingrediente, Integer> map);
    void definirQueso (boolean extraQueso);




}
