package taxonomia;
import java.io.PrintWriter;
import java.util.*;

/**
 * 
 */
public class InformeTexto extends Informe {
    private String[] consulta;
    /**
     * Default constructor
     */
    public InformeTexto(String[] consulta) {    
        this.consulta = consulta;
        
    }

    /**
     * 
     * @param s
     */
    @Override
    public void generarInforme() {
        // TODO implement here
        //faltaria lo de estado
        try {
            PrintWriter writer = new PrintWriter("informe1.txt", "UTF-8");
            writer.println("Especie - Genero - Familia - Orden - Clase - Phylo/Division - Reino - Dominio");
            writer.println(this.consulta[0]+" - "+this.consulta[1]+" - "+this.consulta[2]+" - "+this.consulta[3]+" - "+this.consulta[4]+" - "+this.consulta[5]+" - "+this.consulta[6]+" - "+this.consulta[7]+" ");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public String[] getConsulta() {
        return consulta;
    }

    public void setConsulta(String[] consulta) {
        this.consulta = consulta;
    }

}