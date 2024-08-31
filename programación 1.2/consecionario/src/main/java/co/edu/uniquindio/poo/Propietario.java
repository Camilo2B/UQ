package co.edu.uniquindio.poo;

public class Propietario {
    private String nombre;
    private String apellido;
    private String telefono;    
    private String correo;
    private String cedula;
    private int edad;

    public Propietario(String nombre, String apellido, String telefono, String correo, String cedula, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return nombre;
    }

    public String getTelefono(){
        return nombre;
    }

    public String getCorreo(){
        return nombre;
    }

    public String getCedula(){
        return nombre;
    }

    public int getedad(){
        return edad;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public void setapellido(String apellido){
        this.apellido = apellido;
    }

    public void settelefono(String telefono){
        this.telefono = telefono;
    }

    public void setcorreo(String correo){
        this.correo = correo;
    }

    public void setcedula(String cedula){
        this.cedula = cedula;
    }

    public void setedad(int  edad){
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Propietario: [ nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", correo=" + correo + ", cedula=" + cedula + ", Edad;" + edad;
    }
    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }

    
    

}
