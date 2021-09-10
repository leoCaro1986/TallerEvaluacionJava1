package co.com.sofka.ejercicio1.ejercicio17;

import java.util.ArrayList;

public class TestElectrodomesticos {

    ArrayList<ElectrodomesticosGenerales> electrodomesticos;

    public TestElectrodomesticos(){

        electrodomesticos = new ArrayList<>();
    }

    public void ArregloElectrodomestico(){

        ElectrodomesticosGenerales electrodomestico_1 = new ElectrodomesticosGenerales();
        ElectrodomesticosGenerales electrodomestico_2 = new ElectrodomesticosGenerales(200, 32);
        ElectrodomesticosGenerales electrodomestico_3 = new ElectrodomesticosGenerales(155, 20, ElectrodomesticosGenerales.blanco, ElectrodomesticosGenerales.B);
        Lavadora lavadora1 = new Lavadora();
        Lavadora lavadora2 = new Lavadora(250, 32);
        Lavadora lavadora3 = new Lavadora(220);
        Televisor tv1 = new Televisor();
        Televisor tv2 = new Televisor(250, 21);
        Televisor tv3 = new Televisor(1040, true);
        Televisor tv4 = new Televisor(720, true);

        electrodomesticos.add(electrodomestico_1);
        electrodomesticos.add(electrodomestico_2);
        electrodomesticos.add(electrodomestico_3);
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(lavadora3);
        electrodomesticos.add(tv1);
        electrodomesticos.add(tv2);
        electrodomesticos.add(tv3);
        electrodomesticos.add(tv4);

    }

    public void PrecioElectrodomesticos(){

        float Electrodomesticos = 0;
        float precioLavadoras = 0;
        float precioTvs = 0;

        for(int i = electrodomesticos.size() -1; i >= 0; i--){
            if(electrodomesticos.get(i) instanceof Televisor){
                System.out.println("El valor del tv en la posicion "+ i +": " + electrodomesticos.get(i).precioFinal());
                precioTvs += electrodomesticos.get(i).precioFinal();
            }else if (electrodomesticos.get(i) instanceof Lavadora){
                System.out.println("El valor de la lavadora en la posicion" + i + ": " + electrodomesticos.get(i).precioFinal());
                precioLavadoras += electrodomesticos.get(i).precioFinal();
            }else{
                System.out.println("el valor del electrodomestico en la posicion" +i+": " + electrodomesticos.get(i).precioFinal());
                Electrodomesticos += electrodomesticos.get(i).precioFinal();
            }

        }

        System.out.println("Precio de los televisores: " + precioTvs);
        System.out.println("Precio de las lavadoras: " + precioLavadoras);
        System.out.println("Precio de las electrodomesticos: " + (precioTvs + precioLavadoras + Electrodomesticos));
    }
}
