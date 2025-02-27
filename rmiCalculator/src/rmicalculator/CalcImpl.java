
package rmicalculator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

class CalcImpl extends UnicastRemoteObject implements Calculator {
    protected CalcImpl() throws RemoteException {
        super();
    }

    public double add(double a, double b) throws RemoteException {
        return a + b;
    }

    public double subtract(double a, double b) throws RemoteException {
        return a - b;
    }

    public double multiply(double a, double b) throws RemoteException {
        return a * b;
    }

    public double divide(double a, double b) throws RemoteException {
        return a / b;
    }
}
