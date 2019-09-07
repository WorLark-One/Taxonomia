package taxonomia;
import java.io.PrintWriter;
import java.util.*;

/**
 * 
 */
public class InformeTexto extends Informe {

    /**
     * Default constructor
     */
    public InformeTexto() {
    }

    /**
     * 
     */
    public void generarInforme(String[] s) {
        // TODO implement here
        //faltaria lo de estado
        try {
            PrintWriter writer = new PrintWriter("informe1.txt", "UTF-8");
            writer.println("Especie - Genero - Familia - Orden - Clase - Phylo/Division - Reino - Dominio");
            writer.println(s[0]+" - "+s[1]+" - "+s[2]+" - "+s[3]+" - "+s[4]+" - "+s[5]+" - "+s[6]+" - "+s[7]+" ");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}