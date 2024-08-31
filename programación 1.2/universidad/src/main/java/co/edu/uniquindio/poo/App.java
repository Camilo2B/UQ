package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        // Crear estudiante
        Estudiante estudiante = new Estudiante("1234", "Julio Cesar", "Lopez lopez", "jc@gmail.com", "93736363", 24, 2.1, 3.0, 1.8, 4.0,2.9);

        Estudiante estudiante2 = new Estudiante("567", "Juliana", "Gomez", "jg@gmail.com", "93736363", 24, 2.1, 3.0, 1.8, 1.0,2.9);

        Estudiante estudiante3 = new Estudiante("1234", "Ana", "Duarte", "ad@gmail.com", "93736363", 24, 2.1, 3.0, 1.8, 3.0,2.9);

        // Crear profesor
        Profesor profesor= new Profesor("Luisa", "00000");


        //Crear curso
        Curso curso= new Curso("Programación 1", profesor);

        //Agregar estudiante al curso
        curso.agregarEstudiante(estudiante);
        curso.agregarEstudiante(estudiante2);
        curso.agregarEstudiante(estudiante3);

         Curso.mostrarMensaje(curso.toString());

         //Verificar si el estudiante existe
         String numeroIdentificacion = "1234";
         boolean estudianteExiste = curso.validarNumeroIdentificacion(numeroIdentificacion);
         if (estudianteExiste){
            Curso.mostrarMensaje("El estudiante con numero de identificacion "+numeroIdentificacion+" existe");
         }else{
            Curso.mostrarMensaje("El estudiante con numero de identificacion "+numeroIdentificacion+" no existe");
         }

         //Eliminar estudiante
         String cedula = "1234";
         curso.eliminarEstudiante(cedula);
         Curso.mostrarMensaje("El estudiante con el numero de identiificacion "+cedula+" fue removido");
         Curso.mostrarMensaje(curso.toString());

         //Actualizar estudiante
         String cedula2= "567";
         curso.actualizarEstudiante("gmail.com", "12345", cedula2);
         Curso.mostrarMensaje("El estudiante "+cedula2+" ha sido actualizado");


         //Curso actualizado
         Curso.mostrarMensaje("El curso ha sido actualizado: \n");
         Curso.mostrarMensaje((curso.toString()));

         

    }
    

       
}