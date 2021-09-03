package co.com.sofka.ejercicio1;

public class Ejercicio2 {
    int var1 ;
    int var2 ;
    public Ejercicio2(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public void compararNumero(){
        if(this.var1 > this.var2){
            System.out.println("El número mayor es: " + this.var1);
        }else if(this.var1 < this.var2){
            System.out.println("El número mayor es: " + this.var2);
        }
        else System.out.println("Los numeros son iguales");
    }


    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }
}
