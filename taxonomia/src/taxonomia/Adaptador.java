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
    private InformeDos infImagen;
    private InformeTres infTres;
    private Estado estado;
    
    
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
        this.estado = new Libre();
       
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
        if(!this.estado.manejar()){
            this.estado = new Ocupado();
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
            this.estado = new Libre();
        }
        else{
            //se esta utilizando la base de datos, intente despues
        }
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
        if(!this.estado.manejar()){
            this.estado = new Ocupado();
            System.out.println("especie: "+s);
            this.CBD = new ConectarBaseDeDatos();
            try {
                this.infTexto = new InformeTexto(this.CBD.consultaSQL1(s),s);
                this.infTexto.generarInforme();
            } catch (SQLException ex) {
                Logger.getLogger(Adaptador.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.estado = new Libre();
        }
    }

    @Override
    public void generarInforme2(String s) {
        if(!this.estado.manejar()){
            this.estado = new Ocupado();
            System.out.println("Texto: "+s);
            this.CBD = new ConectarBaseDeDatos();
            try {
                this.infImagen = new InformeDos(this.CBD.consultaSQL2(s),s);
            } catch (SQLException ex) {
                Logger.getLogger(Adaptador.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.infImagen.generarInforme();
            this.estado = new Libre();
        }
    }

    @Override
    public void generarInforme3(String s) {
        if(!this.estado.manejar()){
            this.estado = new Ocupado();
            System.out.println("Texto: "+s);
            this.CBD = new ConectarBaseDeDatos();
            try {
                this.infTres = new InformeTres(this.CBD.consultaSQL3(s),s);
                this.infTres.generarInforme();
            } catch (SQLException ex) {
                Logger.getLogger(Adaptador.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.estado = new Libre();
        }
    }


    @Override
    public void insertarHaciaBD() {
        if(!this.estado.manejar()){
            this.estado = new Ocupado();
            this.CBD = new ConectarBaseDeDatos();
            String a = String.valueOf(this.ID);
            this.CBD.agregarPersona(a,Especie, Genero, Familia, Orden, Clase,Phylum, Reino, Dominio);
            this.ID ++;
            this.estado = new Libre();
        }
    }
    
}