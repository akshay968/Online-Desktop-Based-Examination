/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author apple
 */
public class connection_provider {
  
    public static Connection con_db() {
       
    
    PreparedStatement pst;
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:///ques_table_admin","root","1234");
            Statement s =con.createStatement(); 
             System.out.println("project");
        return con;
            
           
        }
        catch(Exception e){ 
            System.out.println(e);
           // System.out.println("No");
            return null;
        } 
       
    }
}