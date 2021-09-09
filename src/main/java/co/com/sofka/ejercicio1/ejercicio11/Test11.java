package co.com.sofka.ejercicio1.ejercicio11;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        String fraseIngresada;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Por favor ingrese una frase");
        fraseIngresada = scanner.nextLine();

        LongitudVocales longitud =new LongitudVocales(fraseIngresada);
        longitud.contarCaracteres();
        scanner.close();
    }
}
