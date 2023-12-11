/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesrmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Elotlan
 */
public class Cliente {

    
    public static void main(String args[]) {
        
        try {
            
            Calculadora calc = (Calculadora) Naming.lookup("rmi://10.50.40.61:1099/Calculadora");

            while(true){
                String opt = JOptionPane.showInputDialog("Calcular\n"+
                        "Suma....................(1)\n"+
                        "Resta...................(2)\n"+
                        "Multiplicación..........(3)\n"+
                        "Division................(4)\n"+
                        "Cancelar para salir.....(5)\n");
                if(opt == null) break;
                int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese a"));
                int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese b"));

                switch(opt){
                    case "1":
                        JOptionPane.showMessageDialog(null, a+" + " +b+ " = "+calc.sum(a, b));
                        break;
                    case "2":  
                        JOptionPane.showMessageDialog(null, a+" + " +b+ " = "+calc.res(a, b));
                        break;
                    case "3":
                        JOptionPane.showMessageDialog(null, a+" + " +b+ " = "+calc.mul(a, b));
                        break;
                    case "4":
                        JOptionPane.showMessageDialog(null, a+" + " +b+ " = "+calc.div(a, b));
                        break;
                }
            }
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        
        }        
    }
}
