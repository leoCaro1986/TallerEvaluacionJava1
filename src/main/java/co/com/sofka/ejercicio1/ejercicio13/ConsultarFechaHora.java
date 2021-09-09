package co.com.sofka.ejercicio1.ejercicio13;

//Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class ConsultarFechaHora {
    public ConsultarFechaHora() {

    }
    public String obtenerFecha(){
        DateTimeFormatter dateNow = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
        return "La fecha actual es "+dateNow.format(LocalDateTime.now());

    }
}
