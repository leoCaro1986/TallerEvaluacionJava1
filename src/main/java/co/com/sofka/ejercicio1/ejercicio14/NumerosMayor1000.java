package co.com.sofka.ejercicio1.ejercicio14;

//Crear un programa que pida un numero por teclado y que imprima por pantalla los
// números desde el numero introducido hasta 1000 con saldos de 2 en 2.

public class NumerosMayor1000 {
    int numeroIngresado;

    public NumerosMayor1000(int numeroIngresado) {
        this.numeroIngresado = numeroIngresado;
    }

    public int getNumeroIngresado() {
        return numeroIngresado;
    }

    public void setNumeroIngresado(int numeroIngresado) {
        this.numeroIngresado = numeroIngresado;
    }
    public  void convertirNumero(){
        if (numeroIngresado >= 1000){
            this.numeroIngresado =numeroIngresado;
            for (int i=numeroIngresado;i<=1000;i++){
                System.out.println(i);
            }
        }else System.out.println("El nímero ingresado debe ser inferior a 1000");

    }
}

