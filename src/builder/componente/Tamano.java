package builder.componente;

public class Tamano {

    private   String  tamano;

    public Tamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTamano() {
        switch (tamano){
            case "Pequeña":
            case "Mediana":
            case "Grande":
                return tamano;
            default:
                return "Tamaño Invalido";
        }

    }

    public double precioTamano (){
        double precio = 0.0;
        if ("Pequeña".equals(tamano)){
            precio = 4.5;
        } else if ("Mediana".equals(tamano)) {
            precio = 7.5;
        } else if ("Grande".equals(tamano)) {
            precio = 12.5;
        }
        return precio;
    }


}
