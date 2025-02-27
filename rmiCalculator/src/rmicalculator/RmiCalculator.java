
package rmicalculator;

import java.rmi.Naming;
import java.util.Scanner;

public class RmiCalculator 
{

    public static void main(String[] args) {
        try {
            Calculator calculator = (Calculator) Naming.lookup("rmi://localhost:1012/CalculatorService");

            Scanner scanner = new Scanner(System.in);
               int z=0;
            while (z==0) {
                System.out.println("Enter the first number:");
                double x = scanner.nextDouble();

                System.out.println("Enter the second number:");
                double y = scanner.nextDouble();

                System.out.println("Enter the operation (+, -, *, /):");
                System.out.println("enter ex for exit");
               String operation = scanner.next();

                double result = 0;

                switch (operation) {
                    case "+":
                        result = calculator.add(x, y);
                         System.out.println("Result: " + result);
                        break;
                    case "-":
                        result = calculator.subtract(x, y);
                         System.out.println("Result: " + result);
                        break;
                    case "*":
                        result = calculator.multiply(x, y);
                         System.out.println("Result: " + result);
                        break;
                    case "/":
                        result = calculator.divide(x, y);
                         System.out.println("Result: " + result);
                        if (y==0){
                            System.out.println("numbers can not divisible by zero");}
                        break;
                    case "ex":
                        exit();
                    default:
                        System.out.println("Invalid operation!");
                        break;
                }
                System.out.println("enter any numberexcept from zero to exit from entire application");
                z=scanner.nextInt();
               if(z!=0)
                   break;
               
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
