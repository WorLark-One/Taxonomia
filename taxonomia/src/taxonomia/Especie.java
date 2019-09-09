    package taxonomia;
import java.io.File;
import java.util.*;

/**
 * 
 */
public class Especie extends Componente{

    private File imagen;
    
    /**
     * Metodo para crear un taxon del tipo especie (sin imagen)
     * @param nombre Nombre de la especie a crear
     * @param tipoTaxon Tipo del taxon (en este caso, siempre sera "Especie"
     */
    public Especie(String nombre, String tipoTaxon) {
        super(nombre,tipoTaxon);

    }    
    /**
     * Metodo para crear un taxon del tipo especie
     * @param nombre Nombre de la especie a crear
     * @param tipoTaxon Tipo del taxon (en este caso, siempre sera "Especie"
     * @param imagen Imagen de la especie a crear
     */
    public Especie(String nombre, String tipoTaxon, File imagen) {
        super(nombre,tipoTaxon);
        this.imagen = imagen;
    }

    /**
     * Metodo que retorna la imagen asignada a una especie especifica
     * @return El archivo de imagen de asignado a la especie
     */
    public File getImagen() {
        return this.imagen;        
    }

    /**
     * Metodo que asigna/cambia la imagen de una especie
     * @param imagen Imagen asociada a la especie
     */
    public void setImagen(File imagen) {
        this.imagen = imagen;
    }

}