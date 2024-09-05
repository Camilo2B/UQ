package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Gimnasio {
    private String nombre;
    private LocalDate fecha;

    public Gimnasio(String nombre, LocalDate fecha){
        this.nombre = nombre;
        this.fecha = fecha;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Gimnasio [nombre=" + nombre + ", fecha=" + fecha + "]";
    }

}
