/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author ronny
 */
public class cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            Registry miregistro = LocateRegistry.getRegistry("localhost", 1099);
            NewInterface c = (NewInterface) Naming.lookup("//localhost/NewInterface");
            
            while (true) {
            String menu = JOptionPane.showInputDialog("ejercicio calculadora \n"+
                    "suma...................1\n"+
                    "resta..................2\n"+
                    "multiplicacion.........3\n"+
                    "division...............4\n"+
                    "Cancelar para salir");
            
                 switch(menu){
                    case "1":
                    {
                        int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                        JOptionPane.showInputDialog(null, "La suma es",+c.sum(x,y));
                        break;
                    }
                    case "2":
                    {
                        int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                        JOptionPane.showInputDialog(null, "La resta es",+c.res(x,y));
                        break;
                    }
                    case "3":
                    {
                        int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                        JOptionPane.showInputDialog(null, "La multiplicacion es",+c.mul(x,y));
                        break;
                    }
                    case "4":
                    {
                        int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                        
                        int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                        if(y!=0)
                        JOptionPane.showInputDialog(null, "La division es",+c.div(x,y));
                        else
                            JOptionPane.showMessageDialog(null, "no se puede dividir entre cero");
                        break;
                    }

                }
            }
        }catch(Exception e){
          JOptionPane.showMessageDialog(null,"servidor no conectado" + e);
        }
    }
    
}

