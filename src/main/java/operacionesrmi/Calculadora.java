/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operacionesrmi;

/**
 *
 * @author Elotlan
 */
public interface Calculadora extends java.rmi.Remote{

    public int div(int a, int b) throws java.rmi.RemoteException;
    public int mul(int a, int b) throws java.rmi.RemoteException;
    public int sum(int a, int b) throws java.rmi.RemoteException;
    public int res(int a, int b) throws java.rmi.RemoteException;
    
    
}
