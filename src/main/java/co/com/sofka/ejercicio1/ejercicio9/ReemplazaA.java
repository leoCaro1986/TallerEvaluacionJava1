package co.com.sofka.ejercicio1.ejercicio9;

//Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas
// las a del String anterior por una e, adicionalmente concatenar a esta frase una
// adicional que ustedes quieran incluir por consola y las muestre luego unidas.

public class ReemplazaA {
    private String fraseIngresada;
    private String frase;

//Constructor
    public ReemplazaA(String fraseIngresada) {
        this.fraseIngresada = fraseIngresada;
        this.frase = "La sonrisa sera la mejor arma contra la tristeza";
    }

    public String getFraseIngresada() {
        return fraseIngresada;
    }

    public void setFraseIngresada(String fraseIngresada) {
        this.fraseIngresada = fraseIngresada;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    public void cambiarLetraA(){
        System.out.println(this.frase.replace("a", "e")+" "+this.fraseIngresada);
    }
    public String concatenarFrase(){
        return this.frase +" "+this.fraseIngresada;
    }
}
