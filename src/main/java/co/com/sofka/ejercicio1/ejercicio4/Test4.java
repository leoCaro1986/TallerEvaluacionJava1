package co.com.sofka.ejercicio1.ejercicio4;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args){
        double inPrecio;
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor ingrese el precio de un producto: ");
        inPrecio=input.nextDouble();
        CalcularPrecio calculo = new CalcularPrecio(inPrecio);
        calculo.precioFinal();
    }
}
