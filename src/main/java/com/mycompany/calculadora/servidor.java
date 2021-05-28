/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author ronny
 */
public class servidor {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       try{
        Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
        r.rebind("NewInterface",new RMI());
        JOptionPane.showMessageDialog(null, "servidor conectado");
       }catch(Exception e){
          JOptionPane.showMessageDialog(null, "servidor no conectado" + e); 
       }
    }
    
}

