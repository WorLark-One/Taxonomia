/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxonomia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author braya
 */
public class ConectarBaseDeDatos {

    private Connection conexion = null;

    public ConectarBaseDeDatos() {
    //supuestamente creariamos la conexion o no aqui
    }
    
    

    public Connection getConexion() {
        return conexion;
    }

    /**
     * Crea la conexion con la base de datos, recibe como parametro el nombre de
     * la base de datos y contraseña que tienes como usuario de postgres.
     *
     * @param nombreBD
     * @param contraseña
     * @return true si se realiza la conexion, false de lo contrario
     */
    public boolean crearConexion(String nombreBD, String contraseña) {
        String url = "jdbc:postgresql://localhost:5432/" + nombreBD + "";// la url incluye el puerto y nombre del proyecto
        String password = "" + contraseña + "";// contraseña de postgres
        String usuario = "postgres";
        try {
            Class.forName("org.postgresql.Driver");

            conexion = DriverManager.getConnection(url, usuario, password);

            if (conexion != null) {
                //System.out.println("Conexion exitosa!!");
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("error en conexion: " + ex);
        } catch (ClassNotFoundException ex) {
            //System.out.println(ex);
        }
        return false;
    }

    /**
     * por el momento no esta implementada para almacenar imagenes.
     *
     * @param datoID
     * @param datoEspecie
     * @param datoGenero
     * @param datoFamilia
     * @param datoOrden
     * @param datoClase
     * @param datoFiloDivicion
     * @param reino
     * @param dominio
     */
    public void agregarPersona(String datoID, String datoEspecie, String datoGenero, String datoFamilia,
            String datoOrden, String datoClase, String datoFiloDivicion, String reino, String dominio) {
        if (conexion != null) {
            try {
                java.sql.Statement st = conexion.createStatement();
                String sql = "INSERT INTO Categoria(id,especie,genero,familia,orden,clase,filo_division,reino"
                        + "dominio) VALUES('" + datoID + "','" + datoEspecie + "','" + datoGenero + "','" + datoFamilia + "',"
                        + "'" + datoOrden + "','" + datoClase + "','" + datoFiloDivicion + "','" + reino + "','" + dominio + "')";
                st.executeUpdate(sql);

                st.close();

            } catch (SQLException e) {
                System.out.println("ERROR DE CONEXION" + e);
            }
        }
    }

    /**
     * Cierra la conexion con la base de datos.
     *
     * @throws SQLException
     */
    public void cerrarBaseDeDatos() throws SQLException {
        if (conexion != null) {
            conexion.close();

        }
    }
    /**
     * consulta simple sobre los datos almacenados en la base de datos,
     * luego hay que modificarla para los datos que los informes requieran
     * @throws SQLException 
     */
    public void consultaSQL() throws SQLException {
        if (conexion != null)// si hay conexion
        {
            try {
                java.sql.Statement st = conexion.createStatement();
                String sql = "select * from Categoria";
                ResultSet resultado = st.executeQuery(sql);
                while (resultado.next()) {
                    String id = resultado.getString("id");
                    String especie = resultado.getString("especie");
                    String genero = resultado.getString("genero");
                    String familia = resultado.getString("familia");
                    String orden = resultado.getString("orden");
                    String clase = resultado.getString("clase");
                    String filo_division = resultado.getString("filo_division");
                    String reino = resultado.getString("reino");
                    String dominio = resultado.getString("dominio");
                    // se obtuvieron todos los datos, falta que quieren que retorne los datos.
                    //String reino = resultado.getString("apellido");// para capturar la imagen
                    
                }
                resultado.close();
                st.close();
                //conexion.close();
            } catch (SQLException e) {
                System.out.println("ERROR DE CONEXION");
            }
        }

    }
    
    public String[] consultaSQL1(String s) throws SQLException {
        String[] cadena =  new String[8];
        int i =0;
        cadena[i] = s;
        i++;
        if (conexion != null)// si hay conexion
        {
            try {
                java.sql.Statement st = conexion.createStatement();
                String sql = "select genero,familia,orden,clase,filo_division,reino,dominio from Categoria where especie = "+s;
                ResultSet resultado = st.executeQuery(sql);
                while (resultado.next()) {
                    String genero = resultado.getString("genero");
                    cadena[i] = genero;
                    i++;
                    String familia = resultado.getString("familia");
                    cadena[i] = familia;
                    i++;
                    String orden = resultado.getString("orden");
                    cadena[i] = orden;
                    i++;
                    String clase = resultado.getString("clase");
                    cadena[i] = clase;
                    i++;
                    String filo_division = resultado.getString("filo_division");
                    cadena[i] = filo_division;
                    i++;
                    String reino = resultado.getString("reino");
                    cadena[i] = reino;
                    i++;
                    String dominio = resultado.getString("dominio");
                    cadena[i] = dominio;
                    
                    // se obtuvieron todos los datos, falta que quieren que retorne los datos.
                    //String reino = resultado.getString("apellido");// para capturar la imagen
                    
                }
                resultado.close();
                st.close();
                //conexion.close();
            } catch (SQLException e) {
                System.out.println("ERROR DE CONEXION");
            }
        }
        return cadena;

    }

}