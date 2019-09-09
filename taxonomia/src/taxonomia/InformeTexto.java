package taxonomia;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
    private ArrayList<String[]> consulta;
    private String s ;
    
    /**
     * Constructor de la clase InformeTexto
     * @param consulta ArrayList con el conjunto de datos para agregar en el pdf
     * @param s String que corresponde a lo que se consultó
     */
    public InformeTexto(ArrayList<String[]> consulta,String s) {    
        documento = new Document();
        this.consulta =  new ArrayList<>();
        this.consulta=consulta;
        this.s=s;
        
        
    }

    /**
     * Metodo que degener el informe 1 en pdf
     */
    @Override
    public void generarInforme() {
        // TODO implement here
        FileOutputStream ficheroPdf; 
        try {
            Date date = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss-dd/MM/yyyy");
            ficheroPdf = new FileOutputStream("informe de especies.pdf");
            PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(20);

            // Se abre el documento.
            documento.open();
            documento.add(new Paragraph("INFORME UNO ESPECIE: "+s));    
            documento.add(new Paragraph("Genero - Familia - Orden - Clase - Phylo/Division - Reino - Dominio"));
            //this.documento.add((Element) this.img);
            //System.out.println(consulta.size());
            for (int i = 0; i < this.consulta.size(); i++) {
                documento.add(new Paragraph(this.consulta.get(i)[0]+" - "+this.consulta.get(i)[1]+" - "+this.consulta.get(i)[2]+" - "+this.consulta.get(i)[3]+" - "+this.consulta.get(i)[4]+" - "+this.consulta.get(i)[5]+" - "+this.consulta.get(i)[6]));
            }
            documento.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InformeDos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(InformeTexto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<String[]> getConsulta() {
        return consulta;
    }

    public void setConsulta(ArrayList<String[]> consulta) {
        this.consulta = consulta;
    }



}