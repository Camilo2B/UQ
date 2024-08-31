package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Grupos {
    private String nombre;
    private LinkedList categoria;
    private LinkedList contactos;


    public Grupos(String nombre, LinkedList categoria, LinkedList contactos){
       this.nombre=nombre;
       categoria= new LinkedList<>();
       contactos= new LinkedList<>();
    }


    public String getNombre() {
        return nombre;
    }


    public LinkedList getCategoria() {
        return categoria;
    }


    public LinkedList getContactos() {
        return contactos;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setCategoria(LinkedList categoria) {
        this.categoria = categoria;
    }


    public void setContactos(LinkedList contactos) {
        this.contactos = contactos;
    }

    
}


