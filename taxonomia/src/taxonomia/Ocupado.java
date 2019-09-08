package taxonomia;
import java.util.*;

/**
 * 
 */
public class Ocupado extends Estado {

    /**
     * Constructor de estado ocupado
     */
    public Ocupado() {
        this.estado = true;
    }

    /**
     * Metodo para obtener el estado de un objeto.
     * @return True si esta ocupado.
     */
    @Override
    public boolean manejar() {
        return this.estado;        
    }

}