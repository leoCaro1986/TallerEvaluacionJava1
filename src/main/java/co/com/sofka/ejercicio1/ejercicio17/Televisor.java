package co.com.sofka.ejercicio1.ejercicio17;

public class Televisor extends ElectrodomesticosGenerales {


    public static final float resPorDefecto= 20;

    private float resolucion;
    private boolean isTDT;

    public Televisor(){
        super();
        this.resolucion = resPorDefecto;
        this.isTDT = false;
    }

    public Televisor(float precio, float peso){
        super(precio, peso);
        this.resolucion = resPorDefecto;
        this.isTDT = false;
    }

    public Televisor(float resolucion, boolean isTDT){
        super();
        this.resolucion = resolucion;
        this.isTDT = isTDT;
    }

    public float getResolucion() {
        return resolucion;
    }

    public boolean isTDT() {
        return isTDT;
    }

    @Override
    public float precioFinal() {
        float precioFinal = super.precioFinal();

        if(this.resolucion > 40)
            precioFinal = (float)(precioFinal*1.3);
        if(this.isTDT)
            precioFinal += 50;

        return  precioFinal;
    }


}
