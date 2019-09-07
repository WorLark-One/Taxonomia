package taxonomia;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase adaptador
 */
public class Adaptador implements IAdaptador {
    private InformeTexto infTexto;
    private InformeImagen infImagen;
    private InformeTres infTres;
    
    
    private Compuesto raiz;
    
    private int ID = 0;
    private String Especie;
    private String Genero;
    private String Familia;
    private String Orden;
    private String Clase;
    private String Phylum;
    private String Reino;
    private String Dominio;
    private File imagen;
    
    private ConectarBaseDeDatos CBD;

    /**
     * Default constructor
     */
    public Adaptador() {
       
    }
    /**
     * 
     */
    @Override
    public void generarInforme(int n,String s) {
        if (n==1) {
            this.generarInforme1(s);
        }
        if (n==2) {
            //this.generarInforme2(s);
        }
        if (n==3) {
            this.generarInforme3(s);
            
        }
    
    }
    
    public void guardarDatos(Compuesto dominio){
        this.raiz= dominio;
        this.Dominio = this.raiz.nombre;
        Compuesto c1 = (Compuesto) this.raiz.getListaSubTaxones().get(0);
        this.Reino =  c1.getNombre();
        Compuesto c2 = (Compuesto) c1.getListaSubTaxones().get(0);
        this.Phylum = c2.getNombre();
        Compuesto c3 = (Compuesto) c2.getListaSubTaxones().get(0);
        this.Clase = c3.getNombre();
        Compuesto c4 = (Compuesto) c3.getListaSubTaxones().get(0);
        this.Orden = c4.getNombre();
        Compuesto c5 = (Compuesto) c4.getListaSubTaxones().get(0);
        this.Familia = c5.getNombre();
        Compuesto c6 = (Compuesto) c5.getListaSubTaxones().get(0);
        this.Genero = c6.getNombre();
        Especie c7 = (Especie) c6.getListaSubTaxones().get(0);
        this.Especie = c7.getNombre();
        this.imagen = c7.getImagen();
    }
    
    public void imprimir(){
        System.out.println(this.Dominio);
        System.out.println(this.Reino);
        System.out.println(this.Phylum);
        System.out.println(this.Clase);
        System.out.println(this.Orden);
        System.out.println(this.Familia);
        System.out.println(this.Genero);
        System.out.println(this.Especie);
    }
    
    
    
   
    @Override
    public void generarInforme1(String s) {
        //s = especie del primer infome 
        System.out.println("especie: "+s);
        this.CBD = new ConectarBaseDeDatos();
        try {
            this.infTexto = new InformeTexto(this.CBD.consultaSQL1(s));
            this.infTexto.generarInforme();
        } catch (SQLException ex) {
            Logger.getLogger(Adaptador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void generarInforme2(File i) {
        //System.out.println("Texto: "+s);
        this.infImagen = new InformeImagen(i);
        this.infImagen.generarInforme();
    }

    @Override
    public void generarInforme3(String s) {
        System.out.println("Texto: "+s);
        this.CBD = new ConectarBaseDeDatos();
        try {
            this.infTres = new InformeTres(this.CBD.consultaSQL3(s));
            this.infTres.generarInforme();
        } catch (SQLException ex) {
            Logger.getLogger(Adaptador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }


    @Override
    public void insertarHaciaBD() {
        this.CBD = new ConectarBaseDeDatos();
        String a = String.valueOf(this.ID);
        this.CBD.agregarPersona(a,Especie, Genero, Familia, Orden, Clase,Phylum, Reino, Dominio);
        this.ID ++;
    }
    
}