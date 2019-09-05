package taxonomia;
import java.util.*;

/**
 * 
 */
public abstract class Componente {
    protected String nombre;
    protected String tipoTaxon;
    
    /**
     * Constructor para crear un taxon
     * @param nombre Nombre del taxon (desde eucarionte a canis lupus por ejemplo)
     * @param tipoTaxon Tipo del taxon (desde dominio a especie)
     */
    public Componente(String nombre, String tipoTaxon) {
        this.nombre = nombre;
        this.tipoTaxon = tipoTaxon;        
    }    
    /**
     * Metodo que retorna el nombre de un taxon.
     * @return El nombre del taxon correspondiente
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Metodo para asignar/cambiar el nombre de un taxon
     * @param nombre Nombre del taxon a modificar
     */    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que retorna el tipo de un taxon especifico.
     * @return El tipo del taxon consultado.
     */
    public String getTipoTaxon() {
        return this.tipoTaxon;
    }

    /**
     * Metodo que asigna/cambia el tipo de un taxon especifico
     * @param tipoTaxon Tipo del taxon a modificar
     */
    public void setTipoTaxon(String tipoTaxon) {
        this.tipoTaxon = tipoTaxon;
    }
    
}