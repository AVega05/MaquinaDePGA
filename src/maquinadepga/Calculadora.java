package maquinadepga;
import java.util.Scanner;

public class Calculadora {
    
    
//Atri.
    private double num1;
    private double num2;

    
//Set&Get
    public void setNum1(double num1){
        this.num1 = num1;
    }
    public double getNum1(){
        return num1; 
    }
    public void setNum2(double num2){
        this.num2 = num2;
    } 
    public double getNum2(){
        return num2;
    }
    

//Met.
    public double sumar(){
        return(this.num1 + this.num2);
    }
    public double restar(){
        return(this.num1 - this.num2);
    }
    public double multiplicar(){
        return(this.num1 * this.num2);
    }
    public double dividir(){
        return(this.num1 / this.num2);
    }
    
    
    
}
