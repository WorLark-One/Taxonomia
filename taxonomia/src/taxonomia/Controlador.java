package taxonomia;
import java.io.File;
import java.util.*;

/**
 * 
 */
public class Controlador {

    //Variable que ocupa el singleton
    private static Controlador controlador;

    private Adaptador adaptador;
    
    
    public Controlador(){
        this.adaptador=new Adaptador();
    }
    
    /**
     * Singleton activated!!!
     * @param nombre
     * @return 
     */
    public static Controlador getSingletonInstance(String nombre) {
        if (controlador == null){
            controlador = new Controlador();
        }
        else{
            System.out.println("El objeto controlador ya se encuentra creado, solo utilicelo");
        }
        
        return controlador;
    }

    /**
     * Metodo que se encarga de redireccionar al Adaptador el informe que se desea generar
     * @param opcion
     */
    public void generarInforme(int opcion) {
        // TODO implement here
        this.adaptador.generarInforme(opcion);
    }

    /**
     * Metodo que se encarga de crear una especie
     */
    public void crearEspecie(String nombre, String tipoTaxon, File imagen) {
        // TODO implement here

    }
}