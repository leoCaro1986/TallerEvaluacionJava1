package co.com.sofka.ejercicio1.ejercicio6;

import co.com.sofka.ejercicio1.ejercicio5.NumPares;

public final class NumParesFor extends NumPares {
    public NumParesFor() {
        super();
    }

    @Override
    public void imprimir() {
        System.out.println("Lista de números pares");
        for (int i =1;i<=100;i++){
            if ((i % 2) == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println(" ");
        System.out.println("Lista de números impares");
        for (int j =1;j<=100;j++){
            if ((j % 2) != 0){
                System.out.print(j + ", ");
            }
        }
    }
}
