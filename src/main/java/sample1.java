/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author SridharKotha
 */
public class sample1 {
    Connection c;
    Statement s;
    PreparedStatement pst;
    public sample1() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///check2","root","");
            s =c.createStatement(); 
         System.out.println("QWER");
        }catch(SQLException e){ 
            System.out.println(e);
        }  
    }
    
}
