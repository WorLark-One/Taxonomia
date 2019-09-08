package taxonomia;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 */
public class InformeTexto extends Informe {
    private Document documento ;
    private File img ;
    private ArrayList<String[]> consulta;
    private String s ;
    
    /**
     * Default constructor
     */
    public InformeTexto(ArrayList<String[]> consulta,String s) {    
        documento = new Document();
        this.consulta = consulta;
        this.s=s;
        
    }

    /**
     * 
     * @param s
     */
    @Override
    public void generarInforme() {
        // TODO implement here
        //faltaria lo de estado
        FileOutputStream ficheroPdf;
        
            
        try {
            Date date = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            ficheroPdf = new FileOutputStream("informeUno"+hourdateFormat.format(date)+".pdf");
            PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(20);

            // Se abre el documento.
            documento.open();
            documento.add(new Paragraph("INFOME UNO FAMILIA: "+s));    
            documento.add(new Paragraph("Genero - Familia - Orden - Clase - Phylo/Division - Reino - Dominio"));
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