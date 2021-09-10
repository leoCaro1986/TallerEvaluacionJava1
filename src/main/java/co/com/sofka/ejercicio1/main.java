package co.com.sofka.ejercicio1;

import co.com.sofka.ejercicio1.Ejercicio10.ReemplazarEspacios;
import co.com.sofka.ejercicio1.ejercicio11.LongitudVocales;
import co.com.sofka.ejercicio1.ejercicio12.PalabrasIguales;
import co.com.sofka.ejercicio1.ejercicio13.ConsultarFechaHora;
import co.com.sofka.ejercicio1.ejercicio14.NumerosMayor1000;
import co.com.sofka.ejercicio1.ejercicio15.MenuCinematografico;
import co.com.sofka.ejercicio1.ejercicio16.EjecutablePersona;
import co.com.sofka.ejercicio1.ejercicio17.TestElectrodomesticos;
import co.com.sofka.ejercicio1.ejercicio3.AreaCirculo;
import co.com.sofka.ejercicio1.ejercicio4.CalcularPrecio;
import co.com.sofka.ejercicio1.ejercicio5.NumPares;
import co.com.sofka.ejercicio1.ejercicio6.NumParesFor;
import co.com.sofka.ejercicio1.ejercicio7.NumeroMayorDoWhile;
import co.com.sofka.ejercicio1.ejercicio8.DiaDeSemana;
import co.com.sofka.ejercicio1.ejercicio9.ReemplazaA;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Ejercicio1 ejercicio1 = new Ejercicio1();
        System.out.println("Ingrese el número del ejercicio que desea revisar (del 1 al 18)");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                int a;
                int b;
                break;
            case 2:
                System.out.println("Ingrese el primer número:");
                a=scanner.nextInt();
                System.out.println("Ingrese el segundo número:");
                b=scanner.nextInt();
                Ejercicio1 ejercicio = new Ejercicio1(a,b);
                ejercicio.compararNumero();
                break;
            case 3:
                double radio;
                Scanner input = new Scanner(System.in);
                System.out.println("Por favor ingrese el radio del circulo: ");
                radio=Double.parseDouble(input.nextLine());
                AreaCirculo area = new AreaCirculo(radio);
                System.out.println("El area es: "+area.calcularArea());
                input.close();
                break;
            case  4:
                double inPrecio;
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Por favor ingrese el precio de un producto: ");
                inPrecio= scanner1.nextDouble();
                CalcularPrecio calculo = new CalcularPrecio(inPrecio);
                calculo.precioFinal();
                break;
            case 5:
                NumPares numPares = new NumPares();
                numPares.imprimir();
                break;
            case 6:
                NumParesFor numParesFor = new NumParesFor();
                numParesFor.imprimir();
                break;
            case 7:
                double numeroMayor;
                Scanner scanner2 =new Scanner(System.in);

                NumeroMayorDoWhile numero = new NumeroMayorDoWhile();

                do{
                    System.out.println("Por favor digite un número: ");
                    numeroMayor = scanner.nextDouble();
                    numero.setNumero(numeroMayor);
                    if (!numero.comparador()) System.out.println("Número invalido por favor ingrese un número igual o mayor a 0");

                }while (!(numero.comparador()));
                System.out.println("Su número es: "+ numero.getNumero());
                scanner.close();
                break;
            case 8:
                String dia;
                System.out.println("Por favor ingrese el día de la semana que desea consultar: ");
                Scanner scanner3 = new Scanner(System.in);
                dia = scanner3.nextLine();
                DiaDeSemana dsemana = new DiaDeSemana(dia);
                dsemana.semana();
                break;
            case 9:
                String fraseNueva;
                Scanner scanner4 =new Scanner(System.in);
                System.out.print("Ingresa una frase para concatenar");
                fraseNueva = scanner4.nextLine();
                ReemplazaA cambiarfrase = new ReemplazaA(fraseNueva);
                cambiarfrase.cambiarLetraA();
                scanner.close();
                break;
            case 10:
                String nuevaFrase;
                Scanner scanner5 = new Scanner(System.in);
                System.out.println("Por favor ingresa una frase");
                nuevaFrase = scanner5.nextLine();

                ReemplazarEspacios reemplazarEspacios = new ReemplazarEspacios(nuevaFrase);

                reemplazarEspacios.cambiarEspacio();
                scanner.close();
                break;
            case 11:
                String fraseIngresada;
                Scanner scanner6 =new Scanner(System.in);
                System.out.println("Por favor ingrese una frase");
                fraseIngresada = scanner6.nextLine();
                LongitudVocales longitud =new LongitudVocales(fraseIngresada);
                longitud.contarCaracteres();
                scanner.close();
                break;
            case 12:
                PalabrasIguales palabrasIguales = new PalabrasIguales();
                System.out.println(palabrasIguales.compararPalabras());
                break;
            case 13:
                ConsultarFechaHora consultarFechaHora = new ConsultarFechaHora();
                System.out.println(consultarFechaHora.obtenerFecha());
                break;
            case 14:
                int numeroIgresado;
                Scanner scanner7 = new Scanner(System.in);
                System.out.println("Por favor ingrese un número para incrementarlo hasta 1000");
                numeroIgresado = scanner7.nextInt();
                NumerosMayor1000 numerosMayor1000 = new NumerosMayor1000(Integer.parseInt(String.valueOf(numeroIgresado)));
                numerosMayor1000.convertirNumero();
                scanner7.close();
                break;
            case 15 :
                MenuCinematografico menu = new MenuCinematografico();
                Scanner scanner8 = new Scanner(System.in);
                menu.getMenu();
                try{
                    System.out.println("Ingresa una de las opciones para permanecer: ");
                    int option = scanner8.nextInt();

                    do{
                        menu.setOpcion(option);
                        menu.opcionMenu();
                        System.out.println("Ingresa una de las opciones: ");
                        option = scanner8.nextInt();

                    }while (menu.getOpcion() != 8);

                }catch (Exception e){
                    System.out.println("Por favor ingresar un numero ENTRE 1 Y 8");

                }
                break;
            case 16:
                EjecutablePersona persona = new EjecutablePersona();
                persona.pedirDatos();
                break;
            case 17:
                TestElectrodomesticos electro = new TestElectrodomesticos();
                electro.ArregloElectrodomestico();
                electro.PrecioElectrodomesticos();
                break;
        }
    }
}
