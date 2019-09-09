package taxonomia;

/**
 * Interfaz adapter para adaptar datos
 */
public interface IAdaptador {

    public void insertarHaciaBD();
    public void generarInforme(int n, String s);
    public void generarInforme1(String s);
    public void generarInforme2(String s);
    public void generarInforme3(String s);

}