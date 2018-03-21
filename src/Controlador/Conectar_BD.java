/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AronChocama
 */
public class Conectar_BD {
    
      public Connection ConectarDB() {
        Connection conecxion = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            System.out.println("Conectando con la base de datos.....");
        } catch (ClassNotFoundException e) {
            System.out.println("No se pude establecer una conexión con la base de datos" + e);
        }
        try {
            String url = "jdbc:derby://localhost:1527/Cuentas";
            conecxion = DriverManager.getConnection(url, "administrador", "admin");
            System.out.println("Conexion establecida con la DB");

        } catch (SQLException e) {
            System.out.println("No se pude establecer una conexión con la base de datos" + e);
        }
        return conecxion;
    }
    
}
