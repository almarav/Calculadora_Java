/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraamigable;

/**
 *
 * @author almeiro
 */
public class Calculator {
    
    CalculadoraAmigable calculatorMain = new CalculadoraAmigable();
    private int number1;
    private int number2;
    
    public Calculator(){
        
        
    }
    
    public Calculator(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
                
    }
    
    // operaciones basicas
    
    public int sum (){
        int sum = this.getNumber1() + this.getNumber2();
        return sum;
        
    }
    
    public int substract (){
        int substract = this.getNumber1() - this.getNumber2();
        return substract;
    }
    
    public int multiply (){
        int multiply = this.getNumber1() * this.getNumber2();
        return multiply;
    }
    
     public float divide (){
        float divide = (float)this.getNumber1() / (float)this.getNumber2();
        return divide;
    }

    /**
     * @return the number1
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * @param number1 the number1 to set
     */
    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    /**
     * @return the number2
     */
    public int getNumber2() {
        return number2;
    }

    /**
     * @param number2 the number2 to set
     */
    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    
    
    
}



