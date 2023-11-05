/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conectabd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gllbo
 */
public class Conectabanco {
    private static String usuario = "root";
    private static String password = "";
    private static Connection connect = null;
    
    public static Connection getConnection() {
        if (connect == null){
            try {
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/viajava", usuario, password);
            }catch (SQLException e) {
                e.getMessage();
            }
        }
        return connect;
    }
    
}
