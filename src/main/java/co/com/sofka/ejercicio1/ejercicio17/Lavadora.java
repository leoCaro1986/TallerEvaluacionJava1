package co.com.sofka.ejercicio1.ejercicio17;

public class Lavadora extends ElectrodomesticosGenerales {

    public static final float cargaPorDefecto = 5;
    private float carga;
    public Lavadora(){
        super();
        this.carga = cargaPorDefecto;
    }

    public Lavadora(float precio, float peso){
        super(precio, peso);
        this.carga = cargaPorDefecto;
    }

    public Lavadora(float carga){
        super();
        this.carga = carga;
    }
    @Override
    public float precioFinal() {
        float precioFinal = super.precioFinal();

        if(this.carga > 30){
            precioFinal += 50;
        }

        return precioFinal;
    }

    public float getCarga() {
        return carga;
    }

}
