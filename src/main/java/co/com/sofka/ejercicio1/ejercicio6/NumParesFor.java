package co.com.sofka.ejercicio1.ejercicio6;

import co.com.sofka.ejercicio1.ejrcicio5.NumPares;

public final class NumParesFor extends NumPares {
    public NumParesFor() {
        super();
    }

    @Override
    public void imprimir() {
        for (int i =1;i<=100;i++){
            if ((i % 2) == 0){
                System.out.print(i + " ");
            }else {
                System.out.print(i + " ");
            }
        }
    }
}
