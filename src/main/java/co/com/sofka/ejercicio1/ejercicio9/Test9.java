package co.com.sofka.ejercicio1.ejercicio9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        String fraseNueva;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Ingresa una frase para concatenar");
        fraseNueva = scanner.nextLine();

        ReemplazaA cambiarfrase = new ReemplazaA(fraseNueva);



        cambiarfrase.cambiarLetraA();
        scanner.close();

    }
}
