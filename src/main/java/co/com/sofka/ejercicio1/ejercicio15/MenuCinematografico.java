package co.com.sofka.ejercicio1.ejercicio15;

/*Hacer un programa que muestre el siguiente menú de opciones
        ****** GESTION CINEMATOGRÁFICA ********
        1-NUEVO ACTOR
        2-BUSCAR ACTOR
        3-ELIMINAR ACTOR
        4-MODIFICAR ACTOR
        5-VER TODOS LOS ACTORES
        6- VER PELICULAS DE LOS ACTORES

        7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
        8-SALIR*/

import java.util.Scanner;

public final class MenuCinematografico {
       private int opcion;
       private boolean salir= false;

    public MenuCinematografico() {

    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public boolean isSalir() {
        return salir;
    }

    public void setSalir(boolean salir) {
        this.salir = salir;
    }
    public void getMenu(){
        System.out.println(
                "****** GESTION CINEMATOGRÁFICA ******** \n" +
                        "1-NUEVO ACTOR \n" +
                        "2-BUSCAR ACTOR\n" +
                        "3-ELIMINAR ACTOR\n" +
                        "4-MODIFICAR ACTOR\n" +
                        "5-VER TODOS LOS ACTORES\n" +
                        "6- VER PELICULAS DE LOS ACTORES\n" +
                        "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                        "8-SALIR");
    }
    public void opcionMenu() {
        switch (this.opcion) {
            case 1:
                getMenu();
                break;
            case 2:
                getMenu();
                break;
            case 4:
                getMenu();
                break;
            case 3:
                getMenu();
                break;
            case 5:
                getMenu();
                break;
            case 6:
                getMenu();
                break;
            case 7:
                getMenu();
                break;
            case 8:
                System.out.println("Gracias por ingresar... hasta la proxima");
                break;
            default:
                System.out.println("¡Opción invalida!");
        }

    }
}
