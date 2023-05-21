/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author zidan bsa
 */
public class connectt {
        Connection connect = null;
public static Connection koneksi(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/toko_grosir","root","");
        return koneksi;
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
}   
}
