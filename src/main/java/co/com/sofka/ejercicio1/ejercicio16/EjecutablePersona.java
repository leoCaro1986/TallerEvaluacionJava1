package co.com.sofka.ejercicio1.ejercicio16;

import java.util.Scanner;

public class EjecutablePersona {
    public void pedirDatos(){
        Scanner scanner = new Scanner(System.in);

        boolean isOk = false;
        while (!isOk){
            System.out.println("Ingrese el nombre de una persona: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la edad: ");
            String edad = scanner.nextLine();
            if(!edad.matches("-?\\d+")){
                System.out.println("La edad debe ser un número entero: ");
                continue;
            }
            System.out.println("Ingrese el sexo (H para Hombre o M para mujer): ");
            String sexo = scanner.nextLine();
            System.out.println("Ingrese el peso en kilos: ");
            String peso = scanner.nextLine();
            if(!peso.matches("[+-]?\\d*(\\.\\d+)?")){
                System.out.println("Peso incorrecto, el peso debe ser númerico");
                continue;
            }
            System.out.println("Ingrese la altura en centimetros: ");
            String altura = scanner.nextLine();
            if(!altura.matches("-?\\d+")){
                System.out.println("Altura incorrecta ingresela en centimetros");
                continue;
            }

            isOk = true;
            crearPersona(nombre, Integer.parseInt(edad), sexo, Float.parseFloat(peso), Integer.parseInt(altura));
        }

    }

    public void crearPersona(String nombre, int edad, String sexo, float peso, int altura){

        float alturaEnMetros = ((float)altura)/100;

        Persona personaAll = new Persona(nombre, edad, sexo, peso, alturaEnMetros);
        Persona personaSome = new Persona(nombre, edad, sexo);
        Persona personaNothing = new Persona();

        personaSome.setPeso(peso);
        personaSome.setAltura(alturaEnMetros);

        personaNothing.setNombre(nombre);
        personaNothing.setEdad(edad);
        personaNothing.setSexo(sexo);
        personaNothing.setPeso(peso);
        personaNothing.setAltura(alturaEnMetros);

        System.out.println("La persona creada con el constructor que incluye los parametros ");
        comprobarValores(personaAll);
        System.out.println("La persona creada con el constructor sin peso ni altura ");
        comprobarValores(personaSome);
        System.out.println("La persona creada con el constructor por defecto ");
        comprobarValores(personaNothing);
    }

    public void comprobarValores(Persona persona){
        if(persona.calcularIMC() == Persona.pesoBajo)
            System.out.println("Esta por debajo del peso ideal ");
        else if(persona.calcularIMC() == Persona.pesoIdeal)
            System.out.println("Esta en el peso ideal ");
        else if(persona.calcularIMC() == Persona.sobrePeso)
            System.out.println("Esta en sobrepeso ");

        if(persona.esMayorDeEdad())
            System.out.println("Es mayor de edad");
        else
            System.out.println("No es menor de edad");

        System.out.println(persona);
    }
}
