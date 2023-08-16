package builder.componente;

public class Masa {
    private String tipoMasa;

    public Masa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public String getTipoMasa() {
        switch (tipoMasa) {
            case "Delgada":
            case "Gruesa":
            case"Integral":
                return tipoMasa;
            default:
                return "Tipo de masa invalida";
        }
    }

    public double precioMasa (){
        double precio = 0.0;
        if ("Delgada".equals(tipoMasa)){
            precio = 1.5;
        } else if ("Gruesa".equals(tipoMasa)) {
            precio = 2.0;
        } else if ("Integral".equals(tipoMasa)) {
            precio = 1.0;
        }
        return precio;
    }

}
