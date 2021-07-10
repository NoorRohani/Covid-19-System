
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NoorAhmad
 */
public class Connectivity {
    public static Connection conn;
    public static String dbFile = "C:\\Users\\NoorAhmad\\Documents\\NetBeansProjects\\COVID-19-System//17-A-6545.accdb";
    public static String dbURL = "jdbc:ucanaccess://"+dbFile.trim()+";memory=true";
    public static Connection getConnection(){
        try{
            conn = DriverManager.getConnection(dbURL,"","");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "error");
        }
        return conn;
    }
}
