package co.com.sofka.ejercicio1.ejercicio14;

import co.com.sofka.ejercicio1.ejercicio11.LongitudVocales;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        int numeroIgresado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese un número para incrementarlo hasta 1000");
        numeroIgresado = scanner.nextInt();

        NumerosMayor1000 numerosMayor1000 = new NumerosMayor1000(Integer.parseInt(String.valueOf(numeroIgresado)));
        numerosMayor1000.convertirNumero();
        scanner.close();
    }
}
