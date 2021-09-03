import co.com.sofka.ejercicio1.Ejercicio1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        a=scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        b=scanner.nextInt();
        Ejercicio1 ejercicio = new Ejercicio1(a,b);
        ejercicio.compararNumero();
    }
}
