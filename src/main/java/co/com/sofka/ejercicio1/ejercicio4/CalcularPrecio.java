package co.com.sofka.ejercicio1.ejercicio4;

public class CalcularPrecio {
    //Atributos
    private final double IVA=0.21;
    private double precio;
    //Metodos

//constructor
    public CalcularPrecio(double precio) {
        this.precio = precio;

    }
    public void precioFinal(){
        double aumento = this.precio*IVA;
        System.out.println("El precio final es: "+ (this.precio+(aumento)));
    }
}
