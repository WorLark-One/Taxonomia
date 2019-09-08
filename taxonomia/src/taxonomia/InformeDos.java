package taxonomia;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 */
public class InformeDos extends Informe {
    private Document documento ;
    private File img ;
    private ArrayList<String[]> consulta;
    private String s ;
    /**
     * Default constructor
     */
    public InformeDos(ArrayList<String[]> consulta,String s) {
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
        // Se crea el OutputStream para el fichero donde queremos dejar el pdf.
        FileOutputStream ficheroPdf;
        
            
        try {
            Date date = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            ficheroPdf = new FileOutputStream("informeDos"+hourdateFormat.format(date)+".pdf");
            PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(20);

            // Se abre el documento.
            documento.open();
            documento.add(new Paragraph("INFOME DOS FAMILIA: "+s));    
            documento.add(new Paragraph("Especie  -  Genero  -  Reino  -  Orden  -  Clase  -  Phylo/Division  -  Dominio "));
            //this.documento.add((Element) this.img);
            for (int i = 0; i < this.consulta.size(); i++) {
                documento.add(new Paragraph(this.consulta.get(i)[0]+" - "+this.consulta.get(i)[1]+" - "+this.consulta.get(i)[2]+" - "+this.consulta.get(i)[3]+" - "+this.consulta.get(i)[4]+" - "+this.consulta.get(i)[5]+" - "+this.consulta.get(i)[6]));
            }
            documento.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InformeDos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(InformeDos.class.getName()).log(Level.SEVERE, null, ex);
        }              
        
        
    }

}