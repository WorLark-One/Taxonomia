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
        
    private Compuesto raiz;
    
    public Controlador(){
        this.adaptador=new Adaptador();
        this.raiz= new Compuesto("raiz", "raiz");
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
     * @param lista Lista de los nombres de los distintos taxones
     */
    public void crearEspecie(String[] lista) {
        
        Especie e = new Especie(lista[7],"Especie");
        Compuesto g = new Compuesto(lista[6],"Genero");
        Compuesto f = new Compuesto(lista[5],"Familia");
        Compuesto o = new Compuesto(lista[4],"Orden");
        Compuesto c = new Compuesto(lista[3],"Clase");
        Compuesto p = new Compuesto(lista[2],"Phylum");
        Compuesto r = new Compuesto(lista[1],"Reino");
        Compuesto d = new Compuesto(lista[0],"Dominio");
        
        for(int i = 7;i>0;i--){
            switch(i){
                case 0:
                    d.agregarSubTaxon(p);
                    break;
                case 1:
                    r.agregarSubTaxon(p);
                    break;
                case 2:
                    p.agregarSubTaxon(o);
                    break;
                case 3:
                    c.agregarSubTaxon(c);
                    break;
                case 4:
                    o.agregarSubTaxon(f);
                    break;
                case 5:
                    f.agregarSubTaxon(g);
                    break;
                case 6:
                    g.agregarSubTaxon(e);
                    break;
                default:
                    break;
            }            
        }   
        raiz.agregarSubTaxon(d);
    }
}