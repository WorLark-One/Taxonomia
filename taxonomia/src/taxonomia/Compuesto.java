package taxonomia;
import java.util.*;

/**
 * 
 */
public class Compuesto extends Componente {
    private ArrayList<Componente> listaSubTaxones;
    
    /**
     * Constructor para crear un compuesto
     * @param nombre Nombre de taxon (Ejemplo: Eucarionte)
     * @param tipoTaxon Tipo o "rango" del taxon (ejemplo: Dominio)
     */
    public Compuesto(String nombre, String tipoTaxon) {
        super(nombre,tipoTaxon);
        this.listaSubTaxones = new ArrayList();
    }

    /**Metodo que agrega un taxon a la lista de subtaxones.
     * @param subTaxon Taxon a agregar a la lista.
     */
    public void agregarSubTaxon(Componente subTaxon) {
        this.listaSubTaxones.add(subTaxon);
    }

    /**Metodo que elimina un taxon de la lista de subtaxones.
     * @param subTaxon Taxon que se desea eliminar
     */
    public void eliminarSubTaxon(Componente subTaxon) {
        this.listaSubTaxones.remove(subTaxon);
    }

    /**Metodo que retorna un "hijo" o taxon especifico (no se para que aun)
     * @param posicion Posicion en la lista de subtaxones (no se en que momento
     * se va a mostrar esto, o en que se va a utilizar)
     * @return El taxon correspondiente a la posicion indicada.
     */
    public Componente obtenerHijo(int posicion) {
        return this.listaSubTaxones.get(posicion);
    }

    public void imprimirArbol(){
        for(int i=0; i<this.listaSubTaxones.size();i++){
            if("Especie".equals(this.listaSubTaxones.get(i).getTipoTaxon())){
                Especie c=(Especie) this.listaSubTaxones.get(i);
                System.out.println(c.nombre);
                return;
            }
            System.out.println(this.listaSubTaxones.get(i).nombre);
            Compuesto c=(Compuesto) this.listaSubTaxones.get(i);
            c.imprimirArbol();
        }
    }

    public ArrayList<Componente> getListaSubTaxones() {
        return listaSubTaxones;
    }

    public void setListaSubTaxones(ArrayList<Componente> listaSubTaxones) {
        this.listaSubTaxones = listaSubTaxones;
    }
    
    
}