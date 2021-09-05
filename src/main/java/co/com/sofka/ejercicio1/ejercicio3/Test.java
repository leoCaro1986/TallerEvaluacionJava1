package co.com.sofka.ejercicio1.ejercicio3;

import java.util.Scanner;

public class Test {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double radio;
        System.out.println("Por favor ingrese el radio del circulo: ");
        radio=Double.parseDouble(input.nextLine());
        AreaCirculo area = new AreaCirculo(radio);
        System.out.println("El area es: "+area.calcularArea());
        input.close();
    }
}
