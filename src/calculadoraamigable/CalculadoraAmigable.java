/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraamigable;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author almeiro
 */
public class CalculadoraAmigable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calculator myCalculator = new Calculator();    
        
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;
        
        
        int number1, number2;
                
        while (!exit){
            
            System.out.println("==================================================");
            System.out.println("| Menu");
            System.out.println("==================================================");
            System.out.println("| Ingresa valores para realizar la operacion.");
            System.out.println("==================================================");
            System.out.println("| 1. Calcular suma: (1)");
            System.out.println("==================================================");
            System.out.println("| 2. Calcular resta: (2)");
            System.out.println("==================================================");
            System.out.println("| 3. Calcular multiplicación: (3)");
            System.out.println("==================================================");
            System.out.println("| 4. Calcular división: (4)");
            System.out.println("==================================================");
            System.out.println("| 5. Salir: (5)");
            System.out.println("==================================================");
            
            try {
                System.out.println("Elija la operación a realizar: ");
                option = sn.nextInt();
                
              
                switch (option) {
                    case 1:
                        System.out.println("Ingresa primer numero: ");
                        number1 = sn.nextInt();
                        myCalculator.setNumber1(number1);
                        System.out.println("Ingresa segundo numero: ");
                        number2 = sn.nextInt();
                        myCalculator.setNumber2(number2);
                        int sum = myCalculator.sum();
                        System.out.println("El resultado de la suma es: " + sum);
                        System.out.println("\n");
                        break;
                    case 2:
                        System.out.println("Ingresa primer numero: ");
                        number1 = sn.nextInt();
                        myCalculator.setNumber1(number1);
                        System.out.println("Ingresa segundo numero: ");
                        number2 = sn.nextInt();
                        myCalculator.setNumber2(number2);
                        int substract = myCalculator.substract();
                        System.out.println("El resultado de la resta es: " + substract);
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.println("Ingresa primer numero: ");
                        number1 = sn.nextInt();
                        myCalculator.setNumber1(number1);
                        System.out.println("Ingresa segundo numero: ");
                        number2 = sn.nextInt();
                        myCalculator.setNumber2(number2);
                        int multiply = myCalculator.multiply();
                        System.out.println("El resultado de la multiplicación es: " + multiply);
                        System.out.println("\n");
                        break;
                    case 4:
                        System.out.println("Ingresa primer numero: ");
                        number1 = sn.nextInt();
                        myCalculator.setNumber1(number1);
                        System.out.println("Ingresa segundo numero: ");
                        number2 = sn.nextInt();
                        myCalculator.setNumber2(number2);
                        float divide = myCalculator.divide();
                        System.out.println("El resultado de la división es: " + divide);
                        System.out.println("\n");
                        break;
                    case 5:
                        exit = true;
                        System.out.println("******** FIN DEL PROGRAMA ********"); 
                        break;
                        
                    default:
                        System.out.println("Opcion invalida, debes elegir entre 1 y 4");
                        System.out.println("\n");
                      
                }
                
            }catch (InputMismatchException e){
                System.out.println("Debes ingresar un numero");
                sn.next();
                
            }

        }
        
        
        
        
        
        
        
        
    }
    
}
