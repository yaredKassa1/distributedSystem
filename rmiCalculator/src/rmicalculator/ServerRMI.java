
package rmicalculator;


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServerRMI {
    public static void main(String[] args) {
        try {
            
            CalcImpl calculator = new CalcImpl();

            LocateRegistry.createRegistry(1012);
            Naming.bind("rmi://localhost:1012/CalculatorService", calculator);
           
            System.out.println("server is ready to go...");
            while (true) {
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
