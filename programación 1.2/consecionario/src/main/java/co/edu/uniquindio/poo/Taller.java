package co.edu.uniquindio.poo;

import java.util.LinkedList;


public class Taller {
    private String placa;
    private LinkedList<Vehiculo> vehiculos;

    public Taller (String placa){
        this.placa=placa;
        vehiculos= new LinkedList<>();
}

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa) {
       this.placa = placa;
    }

    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

@Override
    public String toString() {
        return "Los vehiculos agregados que no estan registrados en el consecionario son: " + vehiculos;
    }

    public void agregarVehiculo (Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public boolean validarPlaca(boolean placaRepetida){
        boolean placaB = false;
        for (Vehiculo vehiculo: vehiculos){
            if (vehiculo.getplaca().equals(placa)){
                placaRepetida=true;
            }
        }
        return placaB;
    }

    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
}
