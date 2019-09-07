package taxonomia;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 */
public class InformeImagen extends Informe {
    private Document documento ;
    private File img ;
    /**
     * Default constructor
     */
    public InformeImagen(File i) {
        documento = new Document();
        this.img = i;
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
            ficheroPdf = new FileOutputStream("informeImagen.pdf");
            // Se asocia el documento al OutputStream y se indica que el espaciado entre
            // lineas sera de 20. Esta llamada debe hacerse antes de abrir el documento
            PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(20);

            // Se abre el documento.
            documento.open();
            documento.add(new Paragraph("ESPECIE"));
            //this.documento.add((Element) this.img);
            documento.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InformeImagen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(InformeImagen.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }

}