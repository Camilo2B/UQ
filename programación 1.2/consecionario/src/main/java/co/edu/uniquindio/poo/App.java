package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Propietario propietario = new Propietario("Erwin Johannes Willem", "Harder Garzon", "10000000", "31200000", "erwinj.harderg@uniquindio.co", 17);

        Propietario propietario1 = new Propietario("Camilo ", "Ruiz Lopez","1000001", "31000000", "camilor@uniquindio.edu", 19);

        Propietario propietario2 = new Propietario("Santiago", "Harder Garzon", "1200000", "31300000", "santiagoh@uniquindio.edu", 19);

        Vehiculo vehiculo = new Vehiculo("Chevrolet", "Alto", "Negro", "ABC123", "2018");

        Vehiculo vehiculo1 = new Vehiculo("Ferrari", "Bajo", "Rojo", "ABZ124", "2024");

        Vehiculo vehiculo2 = new Vehiculo("Audi", "R8", "Azul", "AAA777", "2023");

        Taller taller = new Taller("Super Mechanic");

        taller.agregarVehiculo(vehiculo);        
        taller.agregarVehiculo(vehiculo1);
        taller.agregarVehiculo(vehiculo2);


        Taller.mostrarMensaje(taller.toString());


    }
}