package taxonomia;
import java.util.*;

/**
 * 
 */
public abstract class Estado {
    
    protected boolean estado;

    /**
     * Metodo abstracto que retorna el estado.
     */
    public abstract boolean manejar();

}