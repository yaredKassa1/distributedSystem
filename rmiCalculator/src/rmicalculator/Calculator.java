
package rmicalculator;

import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public interface Calculator extends Remote {
    
    public double add(double a, double b) throws RemoteException;
    
    public double subtract(double a, double b) throws RemoteException;
    
    public double multiply(double a, double b) throws RemoteException;
    
    public double divide(double a, double b) throws RemoteException;
}
