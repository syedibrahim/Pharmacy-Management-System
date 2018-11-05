
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Connect {
 
  public static Connection connect(){
       try{
    Class.forName("com.mysql.jdbc.Driver"); 
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pharmacy","root","");
    if(con!=null)return con ;
   }catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
   }
   return null ;
}    
  }
   