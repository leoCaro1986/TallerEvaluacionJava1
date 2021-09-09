package co.com.sofka.ejercicio1.ejrcicio12;

//Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.

import java.util.Scanner;

public class PalabrasIguales {
    String palabra1;
    String palabra2;

    public PalabrasIguales() {
        this.palabra1 = "";
        this.palabra2 = "";
    }

    public String getPalabra1() {
        return palabra1;
    }

    public void setPalabra1(String palabra1) {
        this.palabra1 = palabra1;
    }

    public String getPalabra2() {
        return palabra2;
    }

    public void setPalabra2(String palabra2) {
        this.palabra2 = palabra2;
    }
    public  String compararPalabras(){
        this.palabra1 = palabra1;
        this.palabra2 = palabra2;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Por favor ingresa la palabra 1");
        palabra1=scanner.nextLine();
        System.out.println("Por favor ingresa la palabra 2");
        palabra2=scanner.nextLine();

        if (palabra1.equalsIgnoreCase(palabra2)){
            // Ambas cadenas son iguales
            return "Las palabras son iguales";
        } else {
            //Ambas cadenas no son iguales (es el caso)
            return "Las palabras no son iguales porque " + palabra1 + " no es igual a "+ palabra2;

        }
    }
}
