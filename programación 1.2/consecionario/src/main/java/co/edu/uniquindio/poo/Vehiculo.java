package co.edu.uniquindio.poo;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private String placa;
    private String año;

    public Vehiculo(String marca, String modelo, String color, String placa, String año) {
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.placa=placa;
        this.año=año;

    }

    public String getmarca() {
        return marca;
    }

    public String getmodelo() {
        return modelo;
    }

    public String getcolor() {
        return color;
    }

    public String getplaca() {
        return placa;
    }

    public String getaño() {
        return año;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public void setcolor(String placa) {
        this.placa = placa;
    }

    public void setplaca(String placa) {
        this.placa = placa;
    }

    public void setaño(String año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Vehiculo: [ marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", placa=" + placa + ", año=" +año ;
    }
    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }

    
}