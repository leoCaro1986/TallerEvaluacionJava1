package co.com.sofka.ejercicio1.Ejercicio10;

public class ReemplazarEspacios {
    private String fraseIngresada;

    public ReemplazarEspacios(String fraseIngresada) {
        this.fraseIngresada = fraseIngresada;
    }

    public String getFraseIngresada() {
        return fraseIngresada;
    }

    public void setFraseIngresada(String fraseIngresada) {
        this.fraseIngresada = fraseIngresada;
    }
    public void cambiarEspacio(){
        System.out.println(this.fraseIngresada.replace(" ", ""));
    }
}
