package co.com.sofka.ejercicio1.ejercicio7;

import com.sun.source.util.SourcePositions;

import javax.sound.midi.Soundbank;
import java.net.SocketOption;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        double numeroMayor;
        Scanner scanner =new Scanner(System.in);

        NumeroMayorDoWhile numero = new NumeroMayorDoWhile();

        do{
            System.out.println("Por favor digite un número: ");
            numeroMayor = scanner.nextDouble();
            numero.setNumero(numeroMayor);
            if (!numero.comparador()) System.out.println("Número invalido por favor ingrese un número igual o mayor a 0");

        }while (!(numero.comparador()));
        System.out.println("Su número es: "+ numero.getNumero());
        scanner.close();
    }
}
