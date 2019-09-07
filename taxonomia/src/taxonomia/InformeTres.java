package taxonomia;
import java.io.PrintWriter;
import java.util.*;

/**
 * 
 */
public class InformeTres extends Informe {
    private ArrayList<String[]> consulta;
    /**
     * Default constructor
     */
    public InformeTres(ArrayList<String[]> consulta) {
        this.consulta = consulta;
        // TODO implement here
    }

    /**
     * 
     */
    @Override
    public void generarInforme() {
        // TODO implement here
        try {
            PrintWriter writer = new PrintWriter("informe1.txt", "UTF-8");
            writer.println("Especie  -  Genero  -  Familia  -  Orden  -  Clase  -  Phylo/Division  -  Dominio ");
            for (int i = 0; i < this.consulta.size(); i++) {
                writer.println(this.consulta.get(i)[0]+" - "+this.consulta.get(i)[1]+" - "+this.consulta.get(i)[2]+" - "+this.consulta.get(i)[3]+" - "+this.consulta.get(i)[4]+" - "+this.consulta.get(i)[5]+" - "+this.consulta.get(i)[6]);
            }
            //writer.println(this.consulta[0]+" - "+this.consulta[1]+" - "+this.consulta[2]+" - "+this.consulta[3]+" - "+this.consulta[4]+" - "+this.consulta[5]+" - "+this.consulta[6]+" - "+this.consulta[7]+" ");
            writer.close();
            
            //especie,genero,familia,orden,clase,filo_division,dominio
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}