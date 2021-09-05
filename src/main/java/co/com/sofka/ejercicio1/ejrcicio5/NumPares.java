package co.com.sofka.ejercicio1.ejrcicio5;

public class NumPares {
    private int counter;

    public NumPares() {
        this.counter = 1;

    }

    public void imprimir() {

        while (true) {
            System.out.println("Lista de números pares");
            while (counter <= 100) {
                if ((counter % 2) == 0) {
                    System.out.print(counter + " ");

                }
                counter++;
            }
            System.out.println("");
            counter=1;
            System.out.println("Lista de números impares");
            while (counter <= 100) {
                if ((counter % 2) != 0) {
                    System.out.print(counter + " ");

                }
                counter++;
            }
            break;

        }
    }
}
