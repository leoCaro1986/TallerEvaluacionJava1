package co.com.sofka.ejercicio1.ejercicio15;

import java.util.Scanner;

public final class Test15 {
    public static void main(String[] args) {

            MenuCinematografico menu = new MenuCinematografico();
            Scanner scanner = new Scanner(System.in);
            menu.getMenu();
            try{
                System.out.println("Ingresa una de las opciones para permanecer: ");
                int option = scanner.nextInt();

                do{
                    menu.setOpcion(option);
                    menu.opcionMenu();

                    System.out.println("Ingresa una de las opciones: ");
                    option = scanner.nextInt();

                }while (menu.getOpcion() != 8);

            }catch (Exception e){
                System.out.println("Por favor ingresar un numero ENTRE 1 Y 8");

            }


    }
}
