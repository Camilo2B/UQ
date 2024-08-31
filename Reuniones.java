package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Reuniones {
    private String descripcion;
    private int fecha;
    private int hora;
    private LinkedList contactos;

    public Reuniones(String nombre, int fecha, int hora){
        this.descripcion=descripcion;
        this.fecha=fecha;
        this.hora=hora;
        contactos = new LinkedList<>();

    }

    public String getdescripcion() {
        return descripcion;
    }

    

    public int getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public LinkedList getContactos() {
        return contactos;
    }

    public void setdescricion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setContactos(LinkedList contactos) {
        this.contactos = contactos;
    }

    @Override
    public String toString() {
        return "La descricpion de la reunion es: " + descripcion + " la hora es: "+hora +"y la fecha es "+fecha+" los contactos que pertenecen a la reuinion son: \n\n" + contactos;
    }

    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
}