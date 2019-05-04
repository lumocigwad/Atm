package Atm2;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Willie
 */
public class MySqlConnect {
    
    Connection conn = null;
    
      public static Connection ConnectDB(){
          
          try{
              Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/atm","root","finch");
              
              return conn;
          }
      
         catch(Exception zona){
         
         JOptionPane.showMessageDialog(null, zona);
    
         return null;
       }
          
  }
 
}
              
            
          
          
          
      
    
    
    
