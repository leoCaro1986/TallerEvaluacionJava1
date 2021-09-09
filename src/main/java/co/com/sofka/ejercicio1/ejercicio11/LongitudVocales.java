package co.com.sofka.ejercicio1.ejercicio11;

//Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola,
//indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.

public class LongitudVocales {
    String fraseIngresada;
    int contarVocales;

    public LongitudVocales(String fraseIngresada) {
        this.fraseIngresada = fraseIngresada;
        this.contarVocales = 0;
    }

    public String getFraseIngresada() {
        return fraseIngresada;
    }

    public void setFraseIngresada(String fraseIngresada) {
        this.fraseIngresada = fraseIngresada;
    }


    public void contarCaracteres(){
        this.contarVocales = contarVocales;
        //for(int x=0;x<fraseIngresada.length();x++) {
        //}
        for(int x=0;x<fraseIngresada.length();x++) {
            if ((fraseIngresada.charAt(x)=='a') || (fraseIngresada.charAt(x)=='e') || (fraseIngresada.charAt(x)=='i')
                    || (fraseIngresada.charAt(x)=='o') || (fraseIngresada.charAt(x)=='u')){
                contarVocales++;
            }
        }
        System.out.println("La frase tiene " + this.fraseIngresada.length()+ " caracteres " + "y " + contarVocales+" vocales");
    }
}
