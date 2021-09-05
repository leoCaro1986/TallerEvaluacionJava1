package co.com.sofka.ejercicio1.ejercicio3;

public class AreaCirculo {
    private double radio;

    public AreaCirculo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI*Math.pow(this.radio,2);
    }
}
