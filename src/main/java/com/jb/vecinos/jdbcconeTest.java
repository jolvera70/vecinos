package com.jb.vecinos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by jolvera on 18/11/2016.
 */
public class jdbcconeTest {

    /**
     * Crea una instancia de la clase MySQL y realiza todo el código
     * de conexión, consulta y muestra de resultados.
     */
    public jdbcconeTest()
    {
        // Se mete todo en un try por los posibles errores de MySQL
        try
        {
            // Se registra el Driver de MySQL
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            // Se obtiene una conexión con la base de datos. Hay que
            // cambiar el usuario "root" y la clave "la_clave" por las
            // adecuadas a la base de datos que estemos usando.
            Connection conexion = DriverManager.getConnection (
                    "jdbc:mysql://localhost:3306/vecinos?useSSL=false&serverTimezone=UTC","root", "root");

            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            ResultSet rs = s.executeQuery ("select * from users");

            // Se recorre el ResultSet, mostrando por pantalla los resultados.
            while (rs.next())
            {
                System.out.println (rs.getString ("Iduser") + " " + rs.getString (2)+
                        " " + rs.getString(3));
            }

            // Se cierra la conexión con la base de datos.
            conexion.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Método principal, instancia una clase PruebaMySQL
     *
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        new jdbcconeTest();
    }

}
