/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosVacios(){
        LOG.info("Iniciado test datosVacios");
        assertThrows(Throwable.class, ()-> new Estudiante(" ", " ", " ", " ", " ", 0, 0, 0, 0 ,0, 0));
        

        LOG.info("Finalizando test datosVacios");
    }

    @Test
    public void edadNegativa(){
        LOG.info("Iniciado test edadNegativa");
        
        assertThrows(Throwable.class, ()-> new Estudiante("567", "Juliana", "Gomez", "jg@gmail.com", "93736363", -24, 2.1, 3.0, 1.8, 1.0,2.9));
        
        LOG.info("Finalizando test edadNegativa");
    }

    @Test
    public void validacionCorreo(){
        LOG.info("Iniciado test validacionCorreo");
        
        assertThrows(Throwable.class, ()-> new Estudiante("567", "Juliana", "Gomez", "jg@gmail.com", "93736363", 24, 2.1, 3.0, 1.8, 1.0,2.9));
        
        LOG.info("Finalizando test validacionCorreo");
    }
}
