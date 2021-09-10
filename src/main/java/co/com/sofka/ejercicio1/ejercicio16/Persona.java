package co.com.sofka.ejercicio1.ejercicio16;

public class Persona {
//declaracion de variables
public static final char hombre = 'H';
    public static final char MUJER = 'M';

    public static final int pesoBajo = -1;
    public static final int pesoIdeal = 0;
    public static final int sobrePeso = 1;

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private float peso;
    private float altura;

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.sexo = hombre;
        this.peso = 0;
        this.altura = 0;
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, String sexo, float peso, float altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.DNI = generaDNI();
    }

    public int calcularIMC(){
        double imc = (this.peso /(Math.pow(this.altura,2)));
        //System.out.println(imc);
        if(imc < 20)
            return pesoBajo;
        else if(imc >= 20 && imc <= 25)
            return pesoIdeal;
        else
            return sobrePeso;
    }

    public boolean esMayorDeEdad(){
        if(this.edad >= 18)
            return true;
        else
            return false;
    }

    private char comprobarSexo(String sexo){
        sexo = sexo.toUpperCase();
        if(sexo.equals("H"))
            return hombre;
        else if(sexo.equals("M"))
            return MUJER;
        else
            return hombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    private String generaDNI(){

        int numeroDNIAleatorio = (int)Math.floor(Math.random()*(99999999-10000000+1)+10000000);
        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";

        int modulo= numeroDNIAleatorio % 23;
        char letra = juegoCaracteres.charAt(modulo);
        System.out.println(letra);
        String DNIFinal = numeroDNIAleatorio + "" + letra;

        return DNIFinal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}

