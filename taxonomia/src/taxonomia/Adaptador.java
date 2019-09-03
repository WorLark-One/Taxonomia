package taxonomia;
import java.util.*;

/**
 * Clase adaptador
 */
public class Adaptador implements IAdaptador {
    private InformeTexto infTexto;
    private InformeImagen infImagen;
    private InformeTres infTres;
    

    /**
     * Default constructor
     */
    public Adaptador() {
    }
    /**
     * 
     */
    @Override
    public void generarInforme(int n) {
        if (n==1) {
            this.generarInforme1();
        }
        if (n==2) {
            this.generarInforme2();
        }
        if (n==3) {
            this.generarInforme3();
            
        }
    
    }

    @Override
    public void generarInforme1() {
        this.infTexto = new InformeTexto();
        this.infTexto.generarInforme();
        
    }

    @Override
    public void generarInforme2() {
        this.infImagen = new InformeImagen();
        this.infImagen.generarInforme();
    }

    @Override
    public void generarInforme3() {
        this.infTres = new InformeTres();
        this.infTres.generarInforme();
    }

    

}