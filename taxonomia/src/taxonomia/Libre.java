package taxonomia;
import java.util.*;

/**
 * 
 */
public class Libre extends Estado {

    /**
     * Constructor de estado libre
     * 
     */
    public Libre() {
        this.estado = false;
    }
    
    /**
     * Metodo para obtener el estado de un objeto.
     * @return False si esta libre.
     */
    @Override
    public boolean manejar() {
        return this.estado;
    }

}