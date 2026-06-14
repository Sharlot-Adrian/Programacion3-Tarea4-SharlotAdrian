package Ejercicio4;

public class CalculadoraSegura {

    public static double suma(double num1, double num2) {
        return num1+num2;
    }

    public static double resta(double num1, double num2){
        return num1-num2;
    }

    public static double multiplicacion(double num1, double num2){
        return num1 * num2;
    }

    public static double division(double dividendo, double divisor) throws ArithmeticException{
        if(divisor == 0)
            throw new ArithmeticException("Error: No se puede dividir entre cero");

        return dividendo/divisor;
    }
    
}
