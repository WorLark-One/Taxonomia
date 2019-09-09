package taxonomia;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 
 */
public class InformeTres extends Informe {
    private ArrayList<String[]> consulta;
    private Document documento ;
    private String s ;
    
    
    /**
     * Constructor de la clase InformeTres
     * @param consulta ArrayList con el conjunto de datos para agregar en el pdf
     * @param s String que corresponde a lo que se consultó
     */
    public InformeTres(ArrayList<String[]> consulta,String s) {
        // TODO implement here
        
        documento = new Document();
        this.consulta=new ArrayList<>();
        this.consulta = consulta;
        this.s=s;
    }

    /**
     * Metodo que degener el informe 3 en pdf
     */
    @Override
    public void generarInforme() {
        // TODO implement here
        FileOutputStream ficheroPdf;
        try {
            Date date = new Date();
            DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss-dd/MM/yyyy");
            ficheroPdf = new FileOutputStream("informe de reinos.pdf");
            PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(20);
            
            documento.open();
            documento.add(new Paragraph("INFORME TRES REINO: "+s));    
            documento.add(new Paragraph("Especie  -  Genero  -  Familia  -  Orden  -  Clase  -  Phylo/Division  -  Dominio "));
            //this.documento.add((Element) this.img);
            for (int i = 0; i < this.consulta.size(); i++) {
                documento.add(new Paragraph(this.consulta.get(i)[0]+" - "+this.consulta.get(i)[1]+" - "+this.consulta.get(i)[2]+" - "+this.consulta.get(i)[3]+" - "+this.consulta.get(i)[4]+" - "+this.consulta.get(i)[5]+" - "+this.consulta.get(i)[6]));
            }
            documento.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String[]> getConsulta() {
        return consulta;
    }

    public void setConsulta(ArrayList<String[]> consulta) {
        this.consulta = consulta;
    }

    public Document getDocumento() {
        return documento;
    }

    public void setDocumento(Document documento) {
        this.documento = documento;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
    
    

}