package co.com.sofka.ejercicio1.ejercicio8;


import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        String dia;
        System.out.println("Por favor ingrese el día de la semana que desea consultar: ");
        Scanner scanner = new Scanner(System.in);
        dia = scanner.nextLine();
        DiaDeSemana dsemana = new DiaDeSemana(dia);
        dsemana.semana();
    }
}



