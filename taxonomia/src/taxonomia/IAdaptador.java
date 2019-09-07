package taxonomia;
import java.awt.Image;
import java.io.File;
import java.util.*;

/**
 * 
 */
public interface IAdaptador {

    /**
     * 
     * @param n
     */
    
    public void insertarHaciaBD();
    public void generarInforme(int n, String s);
    
    public void generarInforme1(String s);
    
    public void generarInforme2(File i);
    
    public void generarInforme3(String s);

}