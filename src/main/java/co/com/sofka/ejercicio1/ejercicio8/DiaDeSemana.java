package co.com.sofka.ejercicio1.ejercicio8;



public class DiaDeSemana {
    String diaSemana;

    public DiaDeSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void semana(){
        switch (this.diaSemana){
            case "lunes":
                System.out.println("El "+ this.diaSemana + " es laboral");
                break;
            case "martes":
                System.out.println("El "+ this.diaSemana + " es laboral");
                break;
            case "miercoles":
                System.out.println("El "+ this.diaSemana + " es laboral");
                break;
            case "jueves":
                System.out.println("El "+ this.diaSemana + " es laboral");
                break;
            case "viernes":
                System.out.println("El "+ this.diaSemana + " es laboral");
                break;
            case "sabado":
                System.out.println("El "+ this.diaSemana + " no es laboral");
                break;
            case "domingo":
                System.out.println("El "+ this.diaSemana + " no es laboral");
                break;
            default:
                System.out.println("Datos incorrectos, por favor ingrese texto con minusculas");
        }
    }
}
