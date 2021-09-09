package co.com.sofka.ejercicio1.Ejercicio10;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        String nuevaFrase;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingresa una frase");
        nuevaFrase = scanner.nextLine();

        ReemplazarEspacios reemplazarEspacios = new ReemplazarEspacios(nuevaFrase);

        reemplazarEspacios.cambiarEspacio();
        scanner.close();
    }
}
