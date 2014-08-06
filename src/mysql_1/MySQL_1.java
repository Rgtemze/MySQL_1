/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysql_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Taptuk
 */
public class MySQL_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/gpstest"; //URL Bicimi: jdbc:mysql://hostismi:3306/veritabaniismi
        String kullaniciad = "root";
        String sifre = "123456"; 
        Connection con = null; Statement st = null; ResultSet rs = null;
        con = DriverManager.getConnection(url, kullaniciad, sifre);
        st = con.createStatement();
        System.out.println("Baglandi");
    }
    
}
