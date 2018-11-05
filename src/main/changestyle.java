package main;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class changestyle {
    
    public void chabgelock(){
   try{
       UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
   }catch(Exception e){
     JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
   }
}
}
//  com.jtattoo.plaf.smart.SmartLookAndFeel   
//   com.jtattoo.plaf.luna.LunaLookAndFeel