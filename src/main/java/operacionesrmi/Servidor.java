/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesrmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elotlan
 */
public class Servidor {

    public static void main(String args[]) {
        try {
            System.out.println("Creando registro RMI...\n");
            
            Registry registry = LocateRegistry.createRegistry(1099);
            
            System.out.println("Enlazando métodos remotos calculadora");
            registry.rebind("Calculadora", new CalcRMI());
            
            System.out.println("Servidor ejecutandose...\n");
        } catch (RemoteException ex) {
            System.out.println("Error"+ex);
        }
    }
}
