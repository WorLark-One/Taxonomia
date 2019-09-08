package taxonomia;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 
 */
public class InformeTres extends Informe {
    private ArrayList<String[]> consulta;
    private Document documento ;
    private File img ;
    private String s ;
    
    
    /**
     * Default constructor
     */
    public InformeTres(ArrayList<String[]> consulta,String s) {
        // TODO implement here
        
        documento = new Document();
        this.consulta = consulta;
        this.s=s;
    }

    /**
     * 
     */
    @Override
    public void generarInforme() {
        // TODO implement here
        FileOutputStream ficheroPdf;
        try {
            Date date = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            ficheroPdf = new FileOutputStream("informeTres"+hourdateFormat.format(date)+".pdf");
             documento.open();
            documento.add(new Paragraph("INFOME TRES REINO: "+s));    
            documento.add(new Paragraph("Especie  -  Genero  -  Familia  -  Orden  -  Clase  -  Phylo/Division  -  Dominio "));
            //this.documento.add((Element) this.img);
            for (int i = 0; i < this.consulta.size(); i++) {
                documento.add(new Paragraph(this.consulta.get(i)[0]+" - "+this.consulta.get(i)[1]+" - "+this.consulta.get(i)[2]+" - "+this.consulta.get(i)[3]+" - "+this.consulta.get(i)[4]+" - "+this.consulta.get(i)[5]+" - "+this.consulta.get(i)[6]));
            }
            documento.close();

            //especie,genero,familia,orden,clase,filo_division,dominio
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}